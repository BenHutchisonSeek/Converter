package org.scalablytyped.converter.internal
package scalajs
package flavours

sealed trait ComponentType

object ComponentType {
  case object Class extends ComponentType
  case object Function extends ComponentType
  case object Field extends ComponentType
}

final case class Component(
    location:        LocationAnnotation,
    scalaRef:        TypeRef,
    fullName:        Name,
    tparams:         IArray[TypeParamTree],
    props:           Option[TypeRef],
    isGlobal:        Boolean,
    componentType:   ComponentType,
    isAbstractProps: Boolean,
) {
  val shortenedPropsName = Name(fullName.unescaped + "Props")

  val knownRef: Option[TypeRef] =
    componentType match {
      case ComponentType.Class    => Some(scalaRef)
      case ComponentType.Function => None
      case ComponentType.Field    => None
    }

  def rewritten(scope: TreeScope, t: TreeTransformation): Component =
    copy( // don't rewrite scalaRef
      tparams = tparams.map(t.visitTypeParamTree(scope)),
      props   = props.map(t.visitTypeRef(scope)),
    )
}

object Component {
  def formatReferenceTo(ref: TypeRef, componentType: ComponentType): String = {
    val loc = Printer.formatTypeRef(0)(ref)

    componentType match {
      case ComponentType.Class => s"js.constructorOf[$loc]"
      case ComponentType.Field => loc
      case ComponentType.Function =>
        ref.typeName.parts match {
          case IArray.initLast(ownerQName, name) =>
            val owner = Printer.formatQN(QualifiedName(ownerQName))
            s"""$owner.asInstanceOf[js.Dynamic].selectDynamic("${name.unescaped}")"""
        }
    }
  }
}

package typingsJapgolly.react.mod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefForwardingComponent[T, P] extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[Partial[P]] = js.native
  var displayName: js.UndefOr[String] = js.native
  var propTypes: js.UndefOr[WeakValidationMap[P]] = js.native
  def apply(props: PropsWithChildren[P], ref: japgolly.scalajs.react.raw.React.Ref): Element | Null = js.native
}


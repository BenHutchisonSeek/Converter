package typings.vue.optionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import typings.std.Error
import typings.std.Record
import typings.vue.AnonEvent
import typings.vue.vnodeMod.VNode
import typings.vue.vueMod.CreateElement
import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentOptions[V /* <: Vue */, Data, Methods, Computed, PropsDef] extends js.Object {
  var activated: js.UndefOr[js.Function0[Unit]] = js.native
  var beforeCreate: js.UndefOr[js.ThisFunction0[/* this */ V, Unit]] = js.native
  var beforeDestroy: js.UndefOr[js.Function0[Unit]] = js.native
  var beforeMount: js.UndefOr[js.Function0[Unit]] = js.native
  var beforeUpdate: js.UndefOr[js.Function0[Unit]] = js.native
  var comments: js.UndefOr[Boolean] = js.native
  var components: js.UndefOr[StringDictionary[(Component[_, _, _, _]) | (AsyncComponent[_, _, _, _])]] = js.native
  var computed: js.UndefOr[Accessors[Computed]] = js.native
  var created: js.UndefOr[js.Function0[Unit]] = js.native
  var data: js.UndefOr[Data] = js.native
  var deactivated: js.UndefOr[js.Function0[Unit]] = js.native
  var delimiters: js.UndefOr[js.Tuple2[String, String]] = js.native
  var destroyed: js.UndefOr[js.Function0[Unit]] = js.native
  var directives: js.UndefOr[StringDictionary[DirectiveFunction | DirectiveOptions]] = js.native
  var el: js.UndefOr[Element | String] = js.native
  var errorCaptured: js.UndefOr[js.Function0[Boolean | Unit]] = js.native
  // TODO: support properly inferred 'extends'
  var `extends`: js.UndefOr[
    (ComponentOptions[
      Vue, 
      DefaultData[Vue], 
      DefaultMethods[Vue], 
      DefaultComputed, 
      PropsDefinition[DefaultProps]
    ]) | VueConstructor[Vue]
  ] = js.native
  var filters: js.UndefOr[StringDictionary[js.Function]] = js.native
  var inheritAttrs: js.UndefOr[Boolean] = js.native
  var inject: js.UndefOr[InjectOptions] = js.native
  var methods: js.UndefOr[Methods] = js.native
  var mixins: js.UndefOr[
    js.Array[
      (ComponentOptions[
        Vue, 
        DefaultData[Vue], 
        DefaultMethods[Vue], 
        DefaultComputed, 
        PropsDefinition[DefaultProps]
      ]) | VueConstructor[Vue]
    ]
  ] = js.native
  var model: js.UndefOr[AnonEvent] = js.native
  var mounted: js.UndefOr[js.Function0[Unit]] = js.native
  var name: js.UndefOr[String] = js.native
  var parent: js.UndefOr[Vue] = js.native
  var props: js.UndefOr[PropsDef] = js.native
  var propsData: js.UndefOr[js.Object] = js.native
  var provide: js.UndefOr[js.Object | js.Function0[js.Object]] = js.native
  var render: js.UndefOr[js.Function1[/* createElement */ CreateElement, VNode]] = js.native
  var renderError: js.UndefOr[js.Function2[/* h */ js.Function0[VNode], /* err */ Error, VNode]] = js.native
  var staticRenderFns: js.UndefOr[js.Array[js.Function1[/* createElement */ CreateElement, VNode]]] = js.native
  var template: js.UndefOr[String] = js.native
  var transitions: js.UndefOr[StringDictionary[js.Object]] = js.native
  var updated: js.UndefOr[js.Function0[Unit]] = js.native
  var watch: js.UndefOr[Record[String, WatchOptionsWithHandler[_] | WatchHandler[_] | String]] = js.native
}

object ComponentOptions {
  @scala.inline
  def apply[V /* <: Vue */, Data, Methods, Computed, PropsDef](
    activated: () => Unit = null,
    beforeCreate: js.ThisFunction0[/* this */ V, Unit] = null,
    beforeDestroy: () => Unit = null,
    beforeMount: () => Unit = null,
    beforeUpdate: () => Unit = null,
    comments: js.UndefOr[Boolean] = js.undefined,
    components: StringDictionary[(Component[_, _, _, _]) | (AsyncComponent[_, _, _, _])] = null,
    computed: Accessors[Computed] = null,
    created: () => Unit = null,
    data: Data = null,
    deactivated: () => Unit = null,
    delimiters: js.Tuple2[String, String] = null,
    destroyed: () => Unit = null,
    directives: StringDictionary[DirectiveFunction | DirectiveOptions] = null,
    el: Element | String = null,
    errorCaptured: () => Boolean | Unit = null,
    `extends`: (ComponentOptions[
      Vue, 
      DefaultData[Vue], 
      DefaultMethods[Vue], 
      DefaultComputed, 
      PropsDefinition[DefaultProps]
    ]) | VueConstructor[Vue] = null,
    filters: StringDictionary[js.Function] = null,
    inheritAttrs: js.UndefOr[Boolean] = js.undefined,
    inject: InjectOptions = null,
    methods: Methods = null,
    mixins: js.Array[
      (ComponentOptions[
        Vue, 
        DefaultData[Vue], 
        DefaultMethods[Vue], 
        DefaultComputed, 
        PropsDefinition[DefaultProps]
      ]) | VueConstructor[Vue]
    ] = null,
    model: AnonEvent = null,
    mounted: () => Unit = null,
    name: String = null,
    parent: Vue = null,
    props: PropsDef = null,
    propsData: js.Object = null,
    provide: js.Object | js.Function0[js.Object] = null,
    render: /* createElement */ CreateElement => VNode = null,
    renderError: (/* h */ js.Function0[VNode], /* err */ Error) => VNode = null,
    staticRenderFns: js.Array[js.Function1[/* createElement */ CreateElement, VNode]] = null,
    template: String = null,
    transitions: StringDictionary[js.Object] = null,
    updated: () => Unit = null,
    watch: Record[String, WatchOptionsWithHandler[_] | WatchHandler[_] | String] = null
  ): ComponentOptions[V, Data, Methods, Computed, PropsDef] = {
    val __obj = js.Dynamic.literal()
    if (activated != null) __obj.updateDynamic("activated")(js.Any.fromFunction0(activated))
    if (beforeCreate != null) __obj.updateDynamic("beforeCreate")(beforeCreate.asInstanceOf[js.Any])
    if (beforeDestroy != null) __obj.updateDynamic("beforeDestroy")(js.Any.fromFunction0(beforeDestroy))
    if (beforeMount != null) __obj.updateDynamic("beforeMount")(js.Any.fromFunction0(beforeMount))
    if (beforeUpdate != null) __obj.updateDynamic("beforeUpdate")(js.Any.fromFunction0(beforeUpdate))
    if (!js.isUndefined(comments)) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (computed != null) __obj.updateDynamic("computed")(computed.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(js.Any.fromFunction0(created))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (deactivated != null) __obj.updateDynamic("deactivated")(js.Any.fromFunction0(deactivated))
    if (delimiters != null) __obj.updateDynamic("delimiters")(delimiters.asInstanceOf[js.Any])
    if (destroyed != null) __obj.updateDynamic("destroyed")(js.Any.fromFunction0(destroyed))
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (el != null) __obj.updateDynamic("el")(el.asInstanceOf[js.Any])
    if (errorCaptured != null) __obj.updateDynamic("errorCaptured")(js.Any.fromFunction0(errorCaptured))
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (!js.isUndefined(inheritAttrs)) __obj.updateDynamic("inheritAttrs")(inheritAttrs.asInstanceOf[js.Any])
    if (inject != null) __obj.updateDynamic("inject")(inject.asInstanceOf[js.Any])
    if (methods != null) __obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (mounted != null) __obj.updateDynamic("mounted")(js.Any.fromFunction0(mounted))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    if (propsData != null) __obj.updateDynamic("propsData")(propsData.asInstanceOf[js.Any])
    if (provide != null) __obj.updateDynamic("provide")(provide.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (renderError != null) __obj.updateDynamic("renderError")(js.Any.fromFunction2(renderError))
    if (staticRenderFns != null) __obj.updateDynamic("staticRenderFns")(staticRenderFns.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (transitions != null) __obj.updateDynamic("transitions")(transitions.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(js.Any.fromFunction0(updated))
    if (watch != null) __obj.updateDynamic("watch")(watch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentOptions[V, Data, Methods, Computed, PropsDef]]
  }
  @scala.inline
  implicit sealed class Sugar[V <: Vue, Data, Methods, Computed, PropsDef] (x: ComponentOptions[V, Data, Methods, Computed, PropsDef]) {
    @scala.inline
    def duplicate: ComponentOptions[V, Data, Methods, Computed, PropsDef] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.vue.optionsMod.ComponentOptions[V, Data, Methods, Computed, PropsDef]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): (ComponentOptions[V, Data, Methods, Computed, PropsDef]) with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.vue.optionsMod.ComponentOptions[V, Data, Methods, Computed, PropsDef] with T]
    @scala.inline
    def withActivated(activated: () => Unit): ComponentOptions[V, Data, Methods, Computed, PropsDef] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (activated != null) obj.updateDynamic("activated")(js.Any.fromFunction0(activated))
      obj.asInstanceOf[typings.vue.optionsMod.ComponentOptions[V, Data, Methods, Computed, PropsDef]]
    }
    @scala.inline
    def withBeforeCreate(beforeCreate: js.ThisFunction0[/* this */ V, Unit]): ComponentOptions[V, Data, Methods, Computed, PropsDef] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (beforeCreate != null) obj.updateDynamic("beforeCreate")(beforeCreate.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.optionsMod.ComponentOptions[V, Data, Methods, Computed, PropsDef]]
    }
    @scala.inline
    def withBeforeDestroy(beforeDestroy: () => Unit): ComponentOptions[V, Data, Methods, Computed, PropsDef] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (beforeDestroy != null) obj.updateDynamic("beforeDestroy")(js.Any.fromFunction0(beforeDestroy))
      obj.asInstanceOf[typings.vue.optionsMod.ComponentOptions[V, Data, Methods, Computed, PropsDef]]
    }
    @scala.inline
    def withBeforeMount(beforeMount: () => Unit): ComponentOptions[V, Data, Methods, Computed, PropsDef] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (beforeMount != null) obj.updateDynamic("beforeMount")(js.Any.fromFunction0(beforeMount))
      obj.asInstanceOf[typings.vue.optionsMod.ComponentOptions[V, Data, Methods, Computed, PropsDef]]
    }
    @scala.inline
    def withBeforeUpdate(beforeUpdate: () => Unit): ComponentOptions[V, Data, Methods, Computed, PropsDef] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (beforeUpdate != null) obj.updateDynamic("beforeUpdate")(js.Any.fromFunction0(beforeUpdate))
      obj.asInstanceOf[typings.vue.optionsMod.ComponentOptions[V, Data, Methods, Computed, PropsDef]]
    }
    @scala.inline
    def withCommentsUndefined: ComponentOptions[V, Data, Methods, Computed, PropsDef] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "comments")
      obj.asInstanceOf[typings.vue.optionsMod.ComponentOptions[V, Data, Methods, Computed, PropsDef]]
    }
    @scala.inline
    def withComments(comments: Boolean): ComponentOptions[V, Data, Methods, Computed, PropsDef] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(comments)) obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.optionsMod.ComponentOptions[V, Data, Methods, Computed, PropsDef]]
    }
    @scala.inline
    def withComponents(components: StringDictionary[(Component[_, _, _, _]) | (AsyncComponent[_, _, _, _])]): ComponentOptions[V, Data, Methods, Computed, PropsDef] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (components != null) obj.updateDynamic("components")(components.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.optionsMod.ComponentOptions[V, Data, Methods, Computed, PropsDef]]
    }
    @scala.inline
    def withComputed(computed: Accessors[Computed]): ComponentOptions[V, Data, Methods, Computed, PropsDef] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (computed != null) obj.updateDynamic("computed")(computed.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.optionsMod.ComponentOptions[V, Data, Methods, Computed, PropsDef]]
    }
    @scala.inline
    def withCreated(created: () => Unit): ComponentOptions[V, Data, Methods, Computed, PropsDef] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (created != null) obj.updateDynamic("created")(js.Any.fromFunction0(created))
      obj.asInstanceOf[typings.vue.optionsMod.ComponentOptions[V, Data, Methods, Computed, PropsDef]]
    }
    @scala.inline
    def withData(data: Data): ComponentOptions[V, Data, Methods, Computed, PropsDef] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (data != null) obj.updateDynamic("data")(data.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.optionsMod.ComponentOptions[V, Data, Methods, Computed, PropsDef]]
    }
    @scala.inline
    def withDeactivated(deactivated: () => Unit): ComponentOptions[V, Data, Methods, Computed, PropsDef] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (deactivated != null) obj.updateDynamic("deactivated")(js.Any.fromFunction0(deactivated))
      obj.asInstanceOf[typings.vue.optionsMod.ComponentOptions[V, Data, Methods, Computed, PropsDef]]
    }
    @scala.inline
    def withDelimiters(delimiters: js.Tuple2[String, String]): ComponentOptions[V, Data, Methods, Computed, PropsDef] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (delimiters != null) obj.updateDynamic("delimiters")(delimiters.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.optionsMod.ComponentOptions[V, Data, Methods, Computed, PropsDef]]
    }
    @scala.inline
    def withDestroyed(destroyed: () => Unit): ComponentOptions[V, Data, Methods, Computed, PropsDef] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (destroyed != null) obj.updateDynamic("destroyed")(js.Any.fromFunction0(destroyed))
      obj.asInstanceOf[typings.vue.optionsMod.ComponentOptions[V, Data, Methods, Computed, PropsDef]]
    }
    @scala.inline
    def withDirectives(directives: StringDictionary[DirectiveFunction | DirectiveOptions]): ComponentOptions[V, Data, Methods, Computed, PropsDef] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (directives != null) obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.optionsMod.ComponentOptions[V, Data, Methods, Computed, PropsDef]]
    }
    @scala.inline
    def withElElement(el: Element): ComponentOptions[V, Data, Methods, Computed, PropsDef] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (el != null) obj.updateDynamic("el")(el.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.optionsMod.ComponentOptions[V, Data, Methods, Computed, PropsDef]]
    }
    @scala.inline
    def withElString(el: String): ComponentOptions[V, Data, Methods, Computed, PropsDef] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (el != null) obj.updateDynamic("el")(el.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.optionsMod.ComponentOptions[V, Data, Methods, Computed, PropsDef]]
    }
    @scala.inline
    def withErrorCaptured(errorCaptured: () => Boolean | Unit): ComponentOptions[V, Data, Methods, Computed, PropsDef] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (errorCaptured != null) obj.updateDynamic("errorCaptured")(js.Any.fromFunction0(errorCaptured))
      obj.asInstanceOf[typings.vue.optionsMod.ComponentOptions[V, Data, Methods, Computed, PropsDef]]
    }
    @scala.inline
    def withExtendsComponentOptions(
      `extends`: ComponentOptions[
          Vue, 
          DefaultData[Vue], 
          DefaultMethods[Vue], 
          DefaultComputed, 
          PropsDefinition[DefaultProps]
        ]
    ): ComponentOptions[V, Data, Methods, Computed, PropsDef] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`extends` != null) obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.optionsMod.ComponentOptions[V, Data, Methods, Computed, PropsDef]]
    }
    @scala.inline
    def withExtendsVueConstructor(`extends`: VueConstructor[Vue]): ComponentOptions[V, Data, Methods, Computed, PropsDef] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (`extends` != null) obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.optionsMod.ComponentOptions[V, Data, Methods, Computed, PropsDef]]
    }
    @scala.inline
    def withFilters(filters: StringDictionary[js.Function]): ComponentOptions[V, Data, Methods, Computed, PropsDef] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (filters != null) obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.optionsMod.ComponentOptions[V, Data, Methods, Computed, PropsDef]]
    }
    @scala.inline
    def withInheritAttrsUndefined: ComponentOptions[V, Data, Methods, Computed, PropsDef] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      js.special.delete(obj, "inheritAttrs")
      obj.asInstanceOf[typings.vue.optionsMod.ComponentOptions[V, Data, Methods, Computed, PropsDef]]
    }
    @scala.inline
    def withInheritAttrs(inheritAttrs: Boolean): ComponentOptions[V, Data, Methods, Computed, PropsDef] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (!js.isUndefined(inheritAttrs)) obj.updateDynamic("inheritAttrs")(inheritAttrs.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.optionsMod.ComponentOptions[V, Data, Methods, Computed, PropsDef]]
    }
    @scala.inline
    def withInject(inject: InjectOptions): ComponentOptions[V, Data, Methods, Computed, PropsDef] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (inject != null) obj.updateDynamic("inject")(inject.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.optionsMod.ComponentOptions[V, Data, Methods, Computed, PropsDef]]
    }
    @scala.inline
    def withMethods(methods: Methods): ComponentOptions[V, Data, Methods, Computed, PropsDef] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (methods != null) obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.optionsMod.ComponentOptions[V, Data, Methods, Computed, PropsDef]]
    }
    @scala.inline
    def withMixins(
      mixins: js.Array[
          (ComponentOptions[
            Vue, 
            DefaultData[Vue], 
            DefaultMethods[Vue], 
            DefaultComputed, 
            PropsDefinition[DefaultProps]
          ]) | VueConstructor[Vue]
        ]
    ): ComponentOptions[V, Data, Methods, Computed, PropsDef] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (mixins != null) obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.optionsMod.ComponentOptions[V, Data, Methods, Computed, PropsDef]]
    }
    @scala.inline
    def withModel(model: AnonEvent): ComponentOptions[V, Data, Methods, Computed, PropsDef] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (model != null) obj.updateDynamic("model")(model.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.optionsMod.ComponentOptions[V, Data, Methods, Computed, PropsDef]]
    }
    @scala.inline
    def withMounted(mounted: () => Unit): ComponentOptions[V, Data, Methods, Computed, PropsDef] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (mounted != null) obj.updateDynamic("mounted")(js.Any.fromFunction0(mounted))
      obj.asInstanceOf[typings.vue.optionsMod.ComponentOptions[V, Data, Methods, Computed, PropsDef]]
    }
    @scala.inline
    def withName(name: String): ComponentOptions[V, Data, Methods, Computed, PropsDef] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (name != null) obj.updateDynamic("name")(name.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.optionsMod.ComponentOptions[V, Data, Methods, Computed, PropsDef]]
    }
    @scala.inline
    def withParent(parent: Vue): ComponentOptions[V, Data, Methods, Computed, PropsDef] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (parent != null) obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.optionsMod.ComponentOptions[V, Data, Methods, Computed, PropsDef]]
    }
    @scala.inline
    def withProps(props: PropsDef): ComponentOptions[V, Data, Methods, Computed, PropsDef] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (props != null) obj.updateDynamic("props")(props.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.optionsMod.ComponentOptions[V, Data, Methods, Computed, PropsDef]]
    }
    @scala.inline
    def withPropsData(propsData: js.Object): ComponentOptions[V, Data, Methods, Computed, PropsDef] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (propsData != null) obj.updateDynamic("propsData")(propsData.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.optionsMod.ComponentOptions[V, Data, Methods, Computed, PropsDef]]
    }
    @scala.inline
    def withProvideObject(provide: js.Object): ComponentOptions[V, Data, Methods, Computed, PropsDef] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (provide != null) obj.updateDynamic("provide")(provide.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.optionsMod.ComponentOptions[V, Data, Methods, Computed, PropsDef]]
    }
    @scala.inline
    def withProvideFunction0(provide: js.Function0[js.Object]): ComponentOptions[V, Data, Methods, Computed, PropsDef] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (provide != null) obj.updateDynamic("provide")(provide.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.optionsMod.ComponentOptions[V, Data, Methods, Computed, PropsDef]]
    }
    @scala.inline
    def withRender(render: /* createElement */ CreateElement => VNode): ComponentOptions[V, Data, Methods, Computed, PropsDef] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (render != null) obj.updateDynamic("render")(js.Any.fromFunction1(render))
      obj.asInstanceOf[typings.vue.optionsMod.ComponentOptions[V, Data, Methods, Computed, PropsDef]]
    }
    @scala.inline
    def withRenderError(renderError: (/* h */ js.Function0[VNode], /* err */ Error) => VNode): ComponentOptions[V, Data, Methods, Computed, PropsDef] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (renderError != null) obj.updateDynamic("renderError")(js.Any.fromFunction2(renderError))
      obj.asInstanceOf[typings.vue.optionsMod.ComponentOptions[V, Data, Methods, Computed, PropsDef]]
    }
    @scala.inline
    def withStaticRenderFns(staticRenderFns: js.Array[js.Function1[/* createElement */ CreateElement, VNode]]): ComponentOptions[V, Data, Methods, Computed, PropsDef] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (staticRenderFns != null) obj.updateDynamic("staticRenderFns")(staticRenderFns.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.optionsMod.ComponentOptions[V, Data, Methods, Computed, PropsDef]]
    }
    @scala.inline
    def withTemplate(template: String): ComponentOptions[V, Data, Methods, Computed, PropsDef] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (template != null) obj.updateDynamic("template")(template.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.optionsMod.ComponentOptions[V, Data, Methods, Computed, PropsDef]]
    }
    @scala.inline
    def withTransitions(transitions: StringDictionary[js.Object]): ComponentOptions[V, Data, Methods, Computed, PropsDef] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (transitions != null) obj.updateDynamic("transitions")(transitions.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.optionsMod.ComponentOptions[V, Data, Methods, Computed, PropsDef]]
    }
    @scala.inline
    def withUpdated(updated: () => Unit): ComponentOptions[V, Data, Methods, Computed, PropsDef] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (updated != null) obj.updateDynamic("updated")(js.Any.fromFunction0(updated))
      obj.asInstanceOf[typings.vue.optionsMod.ComponentOptions[V, Data, Methods, Computed, PropsDef]]
    }
    @scala.inline
    def withWatch(watch: Record[String, WatchOptionsWithHandler[_] | WatchHandler[_] | String]): ComponentOptions[V, Data, Methods, Computed, PropsDef] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (watch != null) obj.updateDynamic("watch")(watch.asInstanceOf[js.Any])
      obj.asInstanceOf[typings.vue.optionsMod.ComponentOptions[V, Data, Methods, Computed, PropsDef]]
    }
  }
  
}


package typings.vue.optionsMod

import typings.std.HTMLElement
import typings.vue.vnodeMod.VNode
import typings.vue.vnodeMod.VNodeDirective
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectiveOptions extends js.Object {
  var bind: js.UndefOr[DirectiveFunction] = js.native
  var componentUpdated: js.UndefOr[DirectiveFunction] = js.native
  var inserted: js.UndefOr[DirectiveFunction] = js.native
  var unbind: js.UndefOr[DirectiveFunction] = js.native
  var update: js.UndefOr[DirectiveFunction] = js.native
}

object DirectiveOptions {
  @scala.inline
  def apply(
    bind: (/* el */ HTMLElement, /* binding */ VNodeDirective, /* vnode */ VNode, /* oldVnode */ VNode) => Unit = null,
    componentUpdated: (/* el */ HTMLElement, /* binding */ VNodeDirective, /* vnode */ VNode, /* oldVnode */ VNode) => Unit = null,
    inserted: (/* el */ HTMLElement, /* binding */ VNodeDirective, /* vnode */ VNode, /* oldVnode */ VNode) => Unit = null,
    unbind: (/* el */ HTMLElement, /* binding */ VNodeDirective, /* vnode */ VNode, /* oldVnode */ VNode) => Unit = null,
    update: (/* el */ HTMLElement, /* binding */ VNodeDirective, /* vnode */ VNode, /* oldVnode */ VNode) => Unit = null
  ): DirectiveOptions = {
    val __obj = js.Dynamic.literal()
    if (bind != null) __obj.updateDynamic("bind")(js.Any.fromFunction4(bind))
    if (componentUpdated != null) __obj.updateDynamic("componentUpdated")(js.Any.fromFunction4(componentUpdated))
    if (inserted != null) __obj.updateDynamic("inserted")(js.Any.fromFunction4(inserted))
    if (unbind != null) __obj.updateDynamic("unbind")(js.Any.fromFunction4(unbind))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction4(update))
    __obj.asInstanceOf[DirectiveOptions]
  }
}


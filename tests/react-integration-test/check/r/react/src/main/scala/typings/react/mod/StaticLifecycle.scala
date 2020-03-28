package typings.react.mod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Unfortunately, we have no way of declaring that the component constructor must implement this
@js.native
trait StaticLifecycle[P, S] extends js.Object {
  var getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[P, S]] = js.native
  var getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[P, S]] = js.native
}

object StaticLifecycle {
  @scala.inline
  def apply[P, S](
    getDerivedStateFromError: /* error */ js.Any => Partial[S] | Null = null,
    getDerivedStateFromProps: (P, S) => Partial[S] | Null = null
  ): StaticLifecycle[P, S] = {
    val __obj = js.Dynamic.literal()
    if (getDerivedStateFromError != null) __obj.updateDynamic("getDerivedStateFromError")(js.Any.fromFunction1(getDerivedStateFromError))
    if (getDerivedStateFromProps != null) __obj.updateDynamic("getDerivedStateFromProps")(js.Any.fromFunction2(getDerivedStateFromProps))
    __obj.asInstanceOf[StaticLifecycle[P, S]]
  }
  @scala.inline
  implicit sealed class Sugar[P, S] (x: StaticLifecycle[P, S]) {
    @scala.inline
    def duplicate: StaticLifecycle[P, S] = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x).asInstanceOf[typings.react.mod.StaticLifecycle[P, S]]
    @scala.inline
    def combine[T /* <: js.Any */](other: T): (StaticLifecycle[P, S]) with T = js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.StaticLifecycle[P, S] with T]
    @scala.inline
    def withGetDerivedStateFromError(getDerivedStateFromError: /* error */ js.Any => Partial[S] | Null): StaticLifecycle[P, S] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (getDerivedStateFromError != null) obj.updateDynamic("getDerivedStateFromError")(js.Any.fromFunction1(getDerivedStateFromError))
      obj.asInstanceOf[typings.react.mod.StaticLifecycle[P, S]]
    }
    @scala.inline
    def withGetDerivedStateFromProps(getDerivedStateFromProps: (P, S) => Partial[S] | Null): StaticLifecycle[P, S] = {
      val obj = duplicate.asInstanceOf[js.Dynamic]
      if (getDerivedStateFromProps != null) obj.updateDynamic("getDerivedStateFromProps")(js.Any.fromFunction2(getDerivedStateFromProps))
      obj.asInstanceOf[typings.react.mod.StaticLifecycle[P, S]]
    }
  }
  
}


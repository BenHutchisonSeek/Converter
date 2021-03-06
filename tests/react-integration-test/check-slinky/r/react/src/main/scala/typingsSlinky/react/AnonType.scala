package typingsSlinky.react

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonType[T /* <: ReactComponentClass[_] */] extends js.Object {
  val `type`: T = js.native
}

object AnonType {
  @scala.inline
  def apply[T /* <: ReactComponentClass[_] */](`type`: T): AnonType[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType[T]]
  }
}


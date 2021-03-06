package typings.unionToInheritance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Either[L, R]
  extends Legal3[js.Any, L, R]
     with _Test[js.Any, L, R]
     with _Test2[R, L] {
  var value: R = js.native
}

object Either {
  @scala.inline
  def apply[L, R](value: R): Either[L, R] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Either[L, R]]
  }
}


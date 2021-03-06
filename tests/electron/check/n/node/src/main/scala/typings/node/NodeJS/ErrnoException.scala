package typings.node.NodeJS

import typings.node.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrnoException extends Error {
  var code: js.UndefOr[String] = js.native
  var errno: js.UndefOr[Double] = js.native
  var path: js.UndefOr[String] = js.native
  var syscall: js.UndefOr[String] = js.native
}

object ErrnoException {
  @scala.inline
  def apply(
    code: String = null,
    errno: Int | Double = null,
    path: String = null,
    stack: String = null,
    syscall: String = null
  ): ErrnoException = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (errno != null) __obj.updateDynamic("errno")(errno.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (syscall != null) __obj.updateDynamic("syscall")(syscall.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrnoException]
  }
}


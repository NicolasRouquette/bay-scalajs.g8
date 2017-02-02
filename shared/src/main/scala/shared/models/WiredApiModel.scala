package shared.models

import scala.concurrent.Future
import scalaz.\/

object WiredApiModel {
  sealed trait ApiError
  case object NotFound extends ApiError

  case object NoContent

  type ApiResult[T] = Future[\/[ApiError, T]]
}
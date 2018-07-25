import play.api.libs.json.{Format, JsArray, Json}

object Foo {
  def jsonType[T](t: T)(implicit format: Format[T]): String =
    Json.toJson(t) match {
      case JsArray(elements) => s"got Array: ${elements.mkString("[", ",", "]")}"
      case _                 => "sth else"
    }
}

import org.scalatest.FreeSpec

class FooSpec extends FreeSpec {

  "Using play-json 2.5" in {
    println(Foo.jsonType(List("abc", "xyz")))
  }

}

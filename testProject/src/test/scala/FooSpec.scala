import org.scalatest.FreeSpec

class FooSpec extends FreeSpec {

  "Binary incompatibility?" in {
    // throws NoSuchMethodError if dependency on PlayJson25 but works if dependency on PlayJson26
    println(Foo.jsonType(List("abc", "xyz")))
  }

}

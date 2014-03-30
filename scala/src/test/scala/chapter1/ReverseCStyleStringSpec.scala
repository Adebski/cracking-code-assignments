package chapter1

import org.specs2.mutable.Specification
import ReverseCStyleString.reverseCStyleString


class ReverseCStyleStringSpec extends Specification{
  "ReverseCStyleString" should {
    "reverse C string with only null character" in {
      reverseCStyleString("\0".toCharArray) must beEqualTo("\0".toCharArray)
    }
    "reverse C string with odd number of characters: abcde\0" in {
      reverseCStyleString("abcde\0".toCharArray) must beEqualTo("edcba\0".toCharArray)
    }
    "reverse C string with even number of characters: abcd\0" in {
      reverseCStyleString("abcd\0".toCharArray) must beEqualTo("dcba\0".toCharArray)
    }
  }
}

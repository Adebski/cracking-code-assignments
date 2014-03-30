package chapter1

import org.specs2.mutable.Specification
import chapter1.Anagram.areAnagrams

class AnagramSpec extends Specification {
  "areAnagrams" should {
    "return false for strings with different length" in {
      areAnagrams("".toCharArray, "a".toCharArray) must beFalse
    }

    "return true for two empty strings" in {
      val emptyString = "".toCharArray
      areAnagrams(emptyString, emptyString) must beTrue
    }

    "return true for two same strings" in {
      val string = "abc".toCharArray
      areAnagrams(string, string) must beTrue
    }

    "return true for reversed strings" in {
      val string = "abc".toCharArray
      areAnagrams(string, string.reverse) must beTrue
    }

    "return true for zxdfg, xdfgz" in {
      areAnagrams("zxdfg".toCharArray, "xdfgz".toCharArray) must beTrue
    }

    "return false for zxdfg, xafgz" in {
      areAnagrams("zxdfg".toCharArray, "xafgz".toCharArray) must beFalse
    }
  }
}

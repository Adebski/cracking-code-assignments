package chapter1

import org.specs2.mutable.Specification
import chapter1.UniqueCharacters.{isStringUniqueAdditionalDataStructure, isStringUniqueNoAdditionalDataStructure}


class UniqueCharactersSpec extends Specification {
  "isStringUniqueAdditionalDataStructure" should {
    "return true for empty string" in {
      isStringUniqueAdditionalDataStructure("".toCharArray) must beTrue
    }
    "return true for abcde" in {
      isStringUniqueAdditionalDataStructure("abcde".toCharArray) must beTrue
    }
    "return false for abcdea" in {
      isStringUniqueAdditionalDataStructure("abcdea".toCharArray) must beFalse
    }
  }

  "isStringUniqueNoAdditionalDataStructure" should {
    "return true for empty string" in {
      isStringUniqueNoAdditionalDataStructure("".toCharArray) must beTrue
    }
    "return true for abcde" in {
      isStringUniqueNoAdditionalDataStructure("abcde".toCharArray) must beTrue
    }
    "return false for abcdea" in {
      isStringUniqueNoAdditionalDataStructure("abcdea".toCharArray) must beFalse
    }
  }
}

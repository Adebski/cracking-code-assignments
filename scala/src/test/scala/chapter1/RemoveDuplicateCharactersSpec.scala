package chapter1

import org.specs2.mutable.Specification
import chapter1.RemoveDuplicateCharacters.{removeDuplicateCharactersConstantAdditionalSpace, removeDuplicateCharactersQuadraticTime}

class RemoveDuplicateCharactersSpec extends Specification{
  "removeDuplicateCharactersConstantAdditionalSpace" should {
    "return the same string for empty string" in {
      removeDuplicateCharactersConstantAdditionalSpace("".toCharArray) must beEqualTo("".toCharArray)
    }
    "return the same string for string with all unique characters: abcdef" in {
      removeDuplicateCharactersConstantAdditionalSpace("abcdef".toCharArray) must beEqualTo("abcdef".toCharArray)
    }
    "return string with one letter for string where all letters are the same: aaaaaa" in {
      removeDuplicateCharactersConstantAdditionalSpace("aaaaaa".toCharArray) must beEqualTo("a".toCharArray)
    }
    "return string with duplicated removed: abbccdedfabf" in {
      removeDuplicateCharactersConstantAdditionalSpace("abbccdedfabf".toCharArray) must beEqualTo("abcdef".toCharArray)
    }
  }

  "removeDuplicateCharactersQuadraticTime" should {
    "return the same string for empty string" in {
      removeDuplicateCharactersQuadraticTime("".toCharArray) must beEqualTo("".toCharArray)
    }
    "return the same string for string with all unique characters: abcdef" in {
      removeDuplicateCharactersQuadraticTime("abcdef".toCharArray) must beEqualTo("abcdef".toCharArray)
    }
    "return string with one letter for string where all letters are the same: aaaaaa" in {
      removeDuplicateCharactersQuadraticTime("aaaaaa".toCharArray) must beEqualTo("a".toCharArray)
    }
    "return string with duplicated removed: abbccdedfabf" in {
      removeDuplicateCharactersQuadraticTime("abbccdedfabf".toCharArray) must beEqualTo("abcdef".toCharArray)
    }
  }
}

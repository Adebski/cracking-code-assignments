package chapter1

import scala.util.Sorting

object UniqueCharacters {
  def isStringUniqueAdditionalDataStructure(s: Array[Char]) = {
    val encounteredASCIICharacters = Array.fill(256)(0)

    for (character <- s) encounteredASCIICharacters(character) += 1

    encounteredASCIICharacters forall (_ <= 1)
  }

  def isStringUniqueNoAdditionalDataStructure(s: Array[Char]) = {
    var result = true
    Sorting.quickSort(s)

    for (index <- 0 until s.length - 1 if s(index) == s(index+1)) result = false

    result
  }
}

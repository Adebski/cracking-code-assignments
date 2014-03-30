package chapter1


object Anagram {
  private def isEven(number: Int) = number % 2 == 0

  def areAnagrams(s1: Array[Char], s2: Array[Char]) = {
    val asciiCharacterOccurrences = Array.fill(256)(0)

    if(s1.length != s2.length){
      false
    }
    else{
      for(index <- 0 until s1.length){
        asciiCharacterOccurrences(s1(index)) += 1
        asciiCharacterOccurrences(s2(index)) += 1
      }

      asciiCharacterOccurrences forall isEven
    }
  }
}

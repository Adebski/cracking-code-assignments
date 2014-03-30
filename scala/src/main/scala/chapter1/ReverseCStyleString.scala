package chapter1


object ReverseCStyleString {

  private def swap(s: Array[Char], i: Int, j:Int) = {
    val temp = s(i)
    s(i) = s(j)
    s(j) = temp
  }

  def reverseCStyleString(s: Array[Char]) = {
    var headIndex = 0
    var tailIndex = s.length - 2
    val halfOfSizeWithoutNullCharacter = (s.length - 1) / 2

    for(_ <- 1 to halfOfSizeWithoutNullCharacter) {
      swap(s, headIndex, tailIndex)
      headIndex +=1
      tailIndex -=1
    }

    s
  }
}

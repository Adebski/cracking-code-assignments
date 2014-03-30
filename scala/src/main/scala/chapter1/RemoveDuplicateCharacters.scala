package chapter1


object RemoveDuplicateCharacters {

  def removeDuplicateCharactersConstantAdditionalSpace(s: Array[Char]) = {
    if(s.isEmpty){
      s
    }else{
      val encounteredASCIICharacters = Array.fill(256)(0)
      var headOfNewString = 1
      encounteredASCIICharacters(s(0)) = 1

      for(index <- 1 until s.length if encounteredASCIICharacters(s(index)) == 0){
        val character = s(index)

        encounteredASCIICharacters(character) = 1
        s(headOfNewString) = character
        headOfNewString += 1
      }

      s.slice(0, headOfNewString)
    }
  }

  def removeDuplicateCharactersQuadraticTime(s: Array[Char]) = {
    import util.control.Breaks._
    if(s.isEmpty){
      s
    }
    else{
      var headOfNewString = 1

      for(outerIndex <- 1 until s.length ){
        val inspectedChar = s(outerIndex)
        breakable {
          for(innerIndex <- 0 until outerIndex if s(innerIndex) == inspectedChar) break()
          s(headOfNewString) = inspectedChar
          headOfNewString += 1
        }
      }

      s.slice(0, headOfNewString)
    }

  }
}

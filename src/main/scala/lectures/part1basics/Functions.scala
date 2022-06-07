package lectures.part1basics

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("Kailash", 31))

  def aParameterLessFunction(): Int = 42

  println(aParameterLessFunction())

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) {
      aString
    } else {
      aString + aRepeatedFunction(aString, n - 1)
    }
  }

  println(aRepeatedFunction("hello \n",3))

  //When you need loops, use recursion.

}

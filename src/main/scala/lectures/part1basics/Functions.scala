package lectures.part1basics

import scala.annotation.tailrec

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

  println(aRepeatedFunction("hello \n", 3))

  //When you need loops, use recursion.

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallFunction(c: Int, d: Int): Int = c + d

    aSmallFunction(n, n - 1)
  }

  /*
    Exercises:
    1.  A greeting function (name, age) => "Hi, my name is $name and I am $age years old."
    2.  Factorial function 1 * 2 * 3 * .. * n
    3.  A Fibonacci function
        f(1) = 1
        f(2) = 1
        f(n) = f(n - 1) + f(n - 2)
    4.  Tests if a number is prime.
   */


  def aGreetingFunction(name: String, age: Int): String = {
    "Hi, my name is " + name + " and I am " + age + " years old."
  }

  println(aGreetingFunction("Kailash", 24))

  def aFactorialFunction(n: Int): Int = {
    if (n <= 0) {
      1
    } else {
      n * aFactorialFunction(n - 1)
    }
  }

  println(aFactorialFunction(5))

  def aFibonacciFunction(n: Int): Int = {
    if (n <= 2) {
      1
    } else {
      aFibonacciFunction(n - 1) + aFibonacciFunction(n - 2)
    }
  }

  println(aFibonacciFunction(8))

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)

    isPrimeUntil(n / 2)
  }

  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(37 * 17))

}

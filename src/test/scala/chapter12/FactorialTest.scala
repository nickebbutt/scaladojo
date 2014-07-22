package chapter12

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by nick on 08/07/2014.
 */
class FactorialTest extends FlatSpec with Matchers {

  val factorial = (f : Int) => {
    if ( f < 0 ) throw UnsupportedOperationException
    (1 to Math.max(1, f)).reduceLeft(_ * _)
  }

  "factorial of 5" should "return 120" in {
    factorial(5) should equal(120)
  }

  "factorial of 1" should "return 1" in {
    factorial(1) should equal(1)
  }

  "factorial of 0" should "return 1" in {
    factorial(0) should equal(1)
  }

//  "factorial of -5" should "throw UnsupportedOperationException" in {
//    factorial(-5) should ))
//  }
}

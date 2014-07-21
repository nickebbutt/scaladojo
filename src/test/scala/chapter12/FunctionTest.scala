package chapter12

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by nick on 08/07/2014.
 */
class FunctionTest extends FlatSpec with Matchers {


  "Produce pairs from function" should "produce a collection of squares" in {

    def values( fun : Int => Int, low: Int, high: Int) = (low to high) map ( x => ( x, fun(x)))

    println(values( (x : Int) => x * x, -5, 5))
  }

  "get largest function" should "return the largest element in an array" in {

    def getLargest(a : Array[Int]) : Int = a.reduceLeft(Math.max)

    getLargest(Array(5,2,3,9,4)) should equal(9)
  }

  "factorial of 5" should "return 120" in {

    def getFactorial(f : Int) : Int = {
      (1 to f).reduceLeft(_ * _)
    }

    getFactorial(5) should equal(120)
  }

}

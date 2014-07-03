package chapter4

import org.scalatest.{Matchers, FlatSpec, FunSuite}

/**
 * Created by nick on 01/07/2014.
 */
class LessThanEqualToGreaterThanTest extends FlatSpec with Matchers {

  val testArray = Array(12, 1, 14, 99, 5, 6, 9)

  "Less than equal greater than 12 " should " be 4 1 and 2" in {
    val result : (Int, Int, Int) = new LessThanEqualToGreaterThan().lteqgt(testArray, 12)
    assert(result == (4, 1, 2))
  }

  "Less than equal greater than 1 " should " be 0 1 and 6" in {
    val result : (Int, Int, Int) = new LessThanEqualToGreaterThan().lteqgt(testArray, 1)
    assert(result == (0, 1, 6))
  }
}

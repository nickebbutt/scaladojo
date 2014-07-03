package chapter4

import org.scalatest.{Matchers, FlatSpec, FunSuite}

/**
 * Created by nick on 01/07/2014.
 */
class MinMaxTest extends FlatSpec with Matchers {

  "Smallest and largest number from the array " should " be 1 and 99" in {
    val result : (Int, Int) = new MinMax().getMinMax(Array(12, 1, 14, 99, 5, 6, 9))
    assert(result._1 == 1)
    assert(result._2 == 99)
  }
}
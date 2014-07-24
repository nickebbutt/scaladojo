package chapter12

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by nick on 08/07/2014.
 */
class Corresponds extends FlatSpec with Matchers {

  "an array of strings " should " correspond to an array of ints represeting string lengths " in {

    val arrayStrings: Array[String] = Array("One", "Two", "Three")
    val arrayInts: Array[Int] = Array(3, 3, 5)
    arrayStrings.corresponds(arrayInts)(_.length == _ ) should be (true)

    arrayInts(1) = 4
    arrayStrings.corresponds(arrayInts)(_.length == _ ) should be (false)

  }
}

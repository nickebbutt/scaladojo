package chapter12

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by nick on 08/07/2014.
 */
class LargestResultFromInputSequence extends FlatSpec with Matchers {

  val largestResult = (f : Int => Int, inputs: Seq[Int]) => inputs.map(f).max


  "Max of -x from sequence 5, 10, 15, 20" should " be -5" in {
    largestResult( x => -x, Array(5, 10, 15,20)) should equal (-5)
  }

  "Max of x squared from sequence 5, 10, 15, 20" should " be 400" in {
    largestResult( x => x * x, Array(5, 10, 15,20)) should equal (400)
  }

  "Input with largest val " should " be 20" in {
    def findInputWithLargestResult (f : Int => Int, inputs: Seq[Int]) = inputs.map( a => (f(a), a)).max._2 //use natural ordering of tuple
    val r = findInputWithLargestResult( x => x * x, Array(5, 10, -30, 15, 20, 12))
    r should equal ( -30 )
  }

}

package chapter12

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by nick on 08/07/2014.
 */
class AdjustToPairTest extends FlatSpec with Matchers {

  "adjust to pair " should " allow a sequence of pairs to be summed " in {

    def adjustToPair(f: (Int, Int) => Int) = (a: (Int, Int)) => f(a._1, a._2)

    val pairs = (1 to 10) zip (11 to 20)

    pairs.map(adjustToPair(_ + _)) should equal( 12 to (30,2) )
  }
}

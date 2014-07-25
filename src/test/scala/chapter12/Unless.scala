package chapter12

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by nick on 08/07/2014.
 */
class Unless extends FlatSpec with Matchers {

  "an unless function " should " operate as an inverted if " in {

    def unless( condition : => Boolean) ( block : => Unit ) = {
      if ( ! condition ) block
    }

    var called = false;
    unless ( condition = false ) {
      called = true
      println("You talkin' to me?")
    }

    called should be (true)
  }
}

package chapter10

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by nick on 11/07/2014.
 */
class CryptoLoggerTest extends FlatSpec with Matchers {

  trait Logger {
    def log(msg: String) : String
  }


  trait ConsoleLogger extends Logger {
    override def log(msg: String)  = {
      Console.println(msg)
      msg
    }
  }

  trait CryptoLogger extends Logger {

    val key = 3

    abstract override def log(msg: String) = {
      val newMessage = msg.map( _ + key toChar)
      super.log(newMessage)
    }
  }

  "hello" should "be encrypted" in {

    var logged = new ConsoleLogger with CryptoLogger log "hello"
    logged should equal("khoor")

    logged = new { override val key = 0 } with ConsoleLogger with CryptoLogger log "hello"
    logged should equal("hello")


  }
}

package chapter10

/**
 * Created by nick on 08/07/2014.
 */
trait TimestampLogger extends Logger {

  abstract override def log(msg: String) = {
    super.log("wibble")
  }
}

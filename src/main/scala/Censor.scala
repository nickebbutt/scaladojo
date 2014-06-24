import scala.io.Source

/**
 * Created by nick on 24/06/2014.
 */
trait Censor {

  val myCensoredTerms = Map( "Shoot" -> "Pucky", "Darn" -> "Beans")

  def censorContents(text: String) = {
    val censoredArray : Array[String] = text.split(' ').map(str => myCensoredTerms.getOrElse(str, str))
    censoredArray.mkString(" ")
  }

}

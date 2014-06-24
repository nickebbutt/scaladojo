/**
 * Created by nick on 24/06/2014.
 */
import collection.mutable.Stack
import org.scalatest._

class StringLengthTest extends FlatSpec with Matchers {

  "A list with a single item" should "have the length of the single item" in {
    val myList = List("SingleItem")

    val totalLength = totalStringLength(myList)
    totalLength should be (10)
  }

  "A list with no items" should "have the length of zero" in {
    val myList = List()

    val totalLength = totalStringLength(myList)
    totalLength should be (0)
  }

  "A list with a zero length string" should "have the length of zero" in {
    val myList = List("")

    val totalLength = totalStringLength(myList)
    totalLength should be (0)
  }

  "A list with a two strings" should "have the length of string1 plus string2" in {
    val myList = List("Greene King", "IPA")

    val totalLength = totalStringLength(myList)
    totalLength should be (14)
  }

  "A strings with 2 whitespace chars" should "have the length of 2" in {
    val myList = List("  ")

    val totalLength = totalStringLength(myList)
    totalLength should be (2)
  }

  "A random list of strings" should "have correct length" in {
    var totalLength = 0
    for ( i <- 0 to 1000)


  }

  def totalStringLength(myList: List[String]) = {
    myList.foldLeft(0)((accu, str) => accu + str.length)
  }
}

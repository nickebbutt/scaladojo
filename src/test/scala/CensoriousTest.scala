/**
 * Created by nick on 24/06/2014.
 */
import org.scalatest._

class CensoriousTest extends FlatSpec with Matchers {

  "Shoot " should "be replaced with Pucky" in {
    val censorious = new Censorious()

    val replacement = censorious.censorContents("Shoot")
    replacement should be ("Pucky")
  }

  "Shoot me Darn you" should "be replaced with Pucky me Beans you" in {
    val censorious = new Censorious()

    val replacement = censorious.censorContents("Shoot me Darn you")
    replacement should be ("Pucky me Beans you")
  }

  "An empty String " should "return an empty String" in {
    val censorious = new Censorious()

    val replacement = censorious.censorContents("")
    replacement should be ("")
  }

  "A null " should "return an empty String" in {
    val censorious = new Censorious()

    val nilStr : String = null
    a [NullPointerException] should be thrownBy {
      censorious.censorContents(nilStr)
    }
  }

//  it should "throw NoSuchElementException if an empty stack is popped" in {
//    val emptyStack = new Stack[Int]
//    a [NoSuchElementException] should be thrownBy {
//      emptyStack.pop()
//    }
//  }


//  "A strings with 2 whitespace chars" should "have the length of 2" in {
//    val myList = List("  ")
//
//    val totalLength = totalStringLength(myList)
//    totalLength should be (2)
//  }
//
//
//  def totalStringLength(myList: List[String]) = {
//    myList.foldLeft(0)((accu, str) => accu + str.length)
//  }
}

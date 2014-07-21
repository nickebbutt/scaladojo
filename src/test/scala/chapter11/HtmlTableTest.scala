package chapter11

import org.scalatest.{Matchers, FlatSpec}
import scala.math.ceil

/**
 * Created by nick on 08/07/2014.
 */
class HtmlTableTest extends FlatSpec with Matchers {

  class HtmlTable(htmlTokens: List[String]) {

    def | (html : String) : HtmlTable = HtmlTable(htmlTokens ::: ("<td>" :: (html :: ("</td>" :: Nil))))

    def || (html : String) : HtmlTable = HtmlTable(htmlTokens ::: ( "</tr><tr><td>" :: ( html :: ( "</td>" :: Nil))))

    override def toString : String = (htmlTokens ::: ( "</tr></table>" :: Nil )).mkString
  }

  object HtmlTable {

    def apply() = new HtmlTable(List("<table><tr>"))

    def apply(htmlTokens: List[String]) = new HtmlTable(htmlTokens)
  }


  "A simple table" should " produce valid html " in {
    val t = HtmlTable() | "Java" | "Scala" || "Gosling" | "Odersky" || "JVM" | "JVM,.NET"
    println(t)
    true should equal(true)
  }

}

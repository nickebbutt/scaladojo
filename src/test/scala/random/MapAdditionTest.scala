package random

import org.scalatest.{Matchers, FlatSpec}
import scala.io.Source

/**
 * Created by nick on 14/07/2014.
 */
class MapAdditionTest extends FlatSpec with Matchers {

  "We" should "can increment a Int counter in the map in a single line, but how?" in {

    val tokens = ("apple orange pear apple orange apple").split(" ")

    val countPerToken = scala.collection.mutable.HashMap[String, Int]().withDefaultValue(0)
    for (token <- tokens) {
      countPerToken(token) += 1
    }

    println(countPerToken)
  }

}

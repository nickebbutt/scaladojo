package chapter13

import org.scalatest.{Matchers, FlatSpec}
import scala.collection.mutable._

/**
 * Created by nick on 08/07/2014.
 */
class MapToIndexesOfCharacters extends FlatSpec with Matchers {

  "running this " should " produce a map with the index of each character " in {


    def getCharIndexes(str: String) = {
//      val mutableMap = new scala.collection.mutable.HashMap[Char, Set[Int]].withDefaultValue(Set[Int]())
      val mutableMap = new scala.collection.mutable.HashMap[Char, Set[Int]]

      str.foldLeft(0)((i: Int, c: Char) => {
          val newIndex = i + 1
          val s : Set[Int] = mutableMap getOrElse (c, Set[Int]()) += newIndex
          mutableMap(c) = s
          newIndex
      })
      mutableMap
    }

    val indexes = getCharIndexes("blobalob")
    println(indexes)
  }

}

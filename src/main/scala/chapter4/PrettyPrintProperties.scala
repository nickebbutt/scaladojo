package chapter4

import scala.collection.JavaConverters._
import scala.collection.Map

/**
 * Created by nick on 30/06/2014.
 */
class PrettyPrintProperties {

  def prettyPrintProperties = {

    val propertiesMap : Map[String,String] = System.getProperties.asScala

    def getLongestValue(p : scala.collection.Map[String,String]) : Int = {
      //val op: (Int, (String, String)) => Int = (acc, kv) => scala.math.max(acc, kv._2.length)

      def op ( i: Int,s: (String,String)) : Int = {
        scala.math.max(i, s._2.length)
      }

      p.foldLeft(0)(op)
    }

    val longestValue = getLongestValue(propertiesMap)

    println(longestValue)
    for ( (k,v) <- propertiesMap ) {
      printf("%-40s| %-" + longestValue + "s%n", k, v)
    }


  }


}

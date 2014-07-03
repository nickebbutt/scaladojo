package chapter4

import scala.collection.mutable

/**
 * Created by nick on 26/06/2014.
 */
object ZipStrings {

  def main (args: Array[String]) = {
    val v = "Hello".zip("World")

    println(v)


    val l = List("test", "this").zip(List("TEST", "THIS"))
    println(l)

    val m = new mutable.HashMap[String,String]()

    m ++= l

    println(m)
  }

}

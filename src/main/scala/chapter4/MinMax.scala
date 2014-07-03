package chapter4

import scala.collection.JavaConverters._
import scala.collection.Map

/**
  * Created by nick on 30/06/2014.
  */
class MinMax {

  val initialResult = (Integer.MAX_VALUE, Integer.MIN_VALUE)

   def getMinMax(ints : Array[Int]) : (Int, Int) = {
     ints.foldLeft (initialResult) (( result : (Int, Int), b : Int ) => {
       (scala.math.min(result._1, b), scala.math.max(result._2, b))
      })
   }

//  def minmax(values: Array[Int]) = {
//    (values.min, values.max)
//  }

 }

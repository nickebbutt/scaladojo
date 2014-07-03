package chapter4

/**
 * Created by nick on 01/07/2014.
 */
class LessThanEqualToGreaterThan {

  def lteqgt(a : Array[Int], v : Int) = {
    a.foldLeft((0,0,0)) ( (r : (Int,Int,Int), currentVal : Int ) => {
      if ( currentVal < v ) {
        (r._1 + 1, r._2, r._3)
      } else if ( currentVal == v ) {
        (r._1, r._2 + 1, r._3)
      } else {
        (r._1, r._2, r._3+1)
      }
    })
  }

//  def lteqgt(values: Array[Int], v : Int) = (
//    values.count(_ < v),
//    values.count(_ == v),
//    values.count(_ > v)
//  )
}

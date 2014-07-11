package chapter10

import java.awt.Point

/**
 * Created by nick on 10/07/2014.
 */
class OrderedPoint(x: Int, y: Int) extends java.awt.Point(x,y) with Ordered[java.awt.Point] {

  def compare(that: Point): Int = {
    var result = that.x compareTo x
    if ( result == 0 ) that.y compareTo y else result
  }

  override def toString = "[%d, %d]".format(getX(), getY())

}

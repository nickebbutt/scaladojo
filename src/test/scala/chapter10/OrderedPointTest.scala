package chapter10

import org.scalatest.{Matchers, FlatSpec}
import java.awt.geom.Ellipse2D

/**
  * Created by nick on 08/07/2014.
  */
class OrderedPointTest extends FlatSpec with Matchers {

   "A Rectangle" should "be growable" in {
     class MyRect(x:Double, y:Double, w:Double, h:Double) extends Ellipse2D.Double(x,y,w,h) with RectangleLike

     val a:MyRect = new MyRect(10,10,10,10)
     a.grow(10, 10)

     a should equal(new MyRect(0, 0, 30, 30))
   }

   "A Rectangle" should "be translated" in {
     class MyRect(x:Double, y:Double, w:Double, h:Double) extends Ellipse2D.Double(x,y,w,h) with RectangleLike

     val a:MyRect = new MyRect(10,10,10,10)
     a.translate(10, 10)

     a should equal(new MyRect(20, 20, 10, 10))
   }
 }

package chapter11

import org.scalatest.{Matchers, FlatSpec}
import java.awt.geom.Ellipse2D

/**
 * Created by nick on 08/07/2014.
 */
class FractionTest extends FlatSpec with Matchers {

  class Fraction(n: Int, d: Int) {
    private val num: Int = if (d == 0) 1 else n * sign(d) / gcd(n, d);
    private val den: Int = if (d == 0) 0 else d * sign(d) / gcd(n, d);
    override def toString = num + "/" + den
    def sign(a: Int) = if (a > 0) 1 else if (a < 0) -1 else 0
    def gcd(a: Int, b: Int): Int = if (b == 0) math.abs(a) else gcd(b, a % b)

    def + (f: Fraction) : Fraction = new Fraction(  num * f.den + f.num * den, f.den * den )

    def - (f: Fraction) : Fraction = new Fraction( num * f.den - f.num * den, f.den * den )

    def / (f: Fraction) : Fraction = new Fraction(num * f.den, den * f.num)

    def * (f: Fraction) : Fraction = new Fraction(num * f.num, den * f.den)

    override def equals(f: Any ) : Boolean = {
      f.toString == toString
    }
  }

  object Fraction {

    def apply(n: Int, d: Int) = new Fraction(n, d)
  }

  "A 1/2 plus a 1/4" should "be 3/4" in {

    val f = Fraction(1,2) + Fraction (1, 4)
    f should equal(Fraction(3,4))
  }

  "A 1/2 minus a 1/4" should "be 1/4" in {

    val f = Fraction(1,2) - Fraction (1, 4)
    f should equal(Fraction(1,4))
  }

  "A 1/4 divided 1/8" should "be 2/1" in {

    val f = Fraction(1,4) / Fraction (1, 8)
    f should equal(Fraction(2,1))
  }

  "A 1/4 multiplied 1/8" should "be 1/32" in {

    val f = Fraction(1,4) * Fraction (1, 8)
    f should equal(Fraction(1,32))
  }

}

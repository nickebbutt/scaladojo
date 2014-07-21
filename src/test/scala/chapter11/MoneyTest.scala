package chapter11

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by nick on 08/07/2014.
 */
class MoneyTest extends FlatSpec with Matchers {

  class Money(dollars: BigInt,  cents: BigInt) extends Ordered[Money] {

    def toCents : BigInt = dollars * 100 + cents

    def fromCents (cents: BigInt) : Money = new Money(cents / 100, cents % 100)
    
    def compare(that: Money): Int = toCents.compare(that.toCents)

    override def equals(that: Any) = that.getClass == classOf[Money] && this.compare(that.asInstanceOf[Money]) == 0

    def + (that: Money): Money = new Money((that.toCents + this.toCents) / 100, (that.toCents + this.toCents) % 100)
    
    def - (that: Money): Money = fromCents(this.toCents - that.toCents)

    def * (i : Int) : Money = fromCents(this.toCents * i)

    override def toString : String = if ( cents == 0 ) dollars + " dollars" else dollars + " dollars and " + cents + " cents"
    
  }

  object Money {

    def apply(dollars: Int, cents: Int) = new Money(dollars, cents)
  }

  "1 dollar plus 1 dollar" should "be 2 dollars" in {

    val m = Money(1,0) + Money(1,0)
    m should equal(Money(2,0))
  }

  "1 dollar minus 1 dollar" should "be 0 dollars" in {

    val m = Money(1,0) - Money(1,0)
    m should equal(Money(0,0))
  }

  "1 dollar plus 1 dollar 50" should "be 2 dollars 50" in {

    val m = Money(1,0) + Money(1,50)
    m should equal(Money(2,50))
  }

  "1 dollar 50 plus 1 dollar 60" should "be 3 dollars 10" in {

    val m = Money(1,50) + Money(1,60)
    m should equal(Money(3,10))
  }

  "1 dollar 60 times 2 " should "be 3 dollars 20" in {

    val m = Money(1,60) * 2
    m should equal(Money(3,20))
  }



}

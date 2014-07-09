package chapter6

/**
 * Created by nick on 03/07/2014.
 */
object PlayingCards extends Enumeration {
  type Suits = Value
  val Spade = Value("♠")
  val Club = Value("♣")
  val Heart = Value("♥")
  val Diamond = Value("♦")
}


package chapter4

import org.scalatest.{Matchers, FlatSpec, FunSuite}

/**
 * Created by nick on 26/06/2014.
 */
class ScalaLinkedHashMapTest extends FlatSpec with Matchers {

  "Linked map with weekdays " should " retain order of addition" in {
    val map = new ScalaLinkedHashMap().createLinkedMap
    val indexed = map.keySet.toIndexedSeq
    assert(indexed(0) == "Monday")
    assert(indexed(6) == "Sunday")
  }


}

package chapter4

import org.scalatest.{Matchers, FlatSpec, FunSuite}

/**
 * Created by nick on 30/06/2014.
 */
class PrettyPrintPropertiesTest extends FlatSpec with Matchers {

  "Pretty print properties " should " be correctly delimited " in {
    new PrettyPrintProperties().prettyPrintProperties
  }

}
package chapter4

import scala.collection.mutable

/**
 * Created by nick on 26/06/2014.
 */
class ScalaLinkedHashMap {

  def createLinkedMap = {
    var linkedMap = new mutable.LinkedHashMap[String, Int]
    linkedMap += "Monday" -> java.util.Calendar.MONDAY
    linkedMap += "Tuesday" -> java.util.Calendar.TUESDAY
    linkedMap += "Wednesday" -> java.util.Calendar.WEDNESDAY
    linkedMap += "Thursday" -> java.util.Calendar.THURSDAY
    linkedMap += "Friday" -> java.util.Calendar.FRIDAY
    linkedMap += "Saturday" -> java.util.Calendar.SATURDAY
    linkedMap += "Sunday" -> java.util.Calendar.SUNDAY
    linkedMap
  }

}

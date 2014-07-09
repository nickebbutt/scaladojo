package chapter10

/**
 * Created by nick on 08/07/2014.
 */
trait RectangleLike {

  def getX(): Double
  def getY(): Double
  def getWidth(): Double
  def getHeight(): Double
  def setFrame(x: Double, y: Double, width: Double, height: Double)

  def grow(xFactor: Double, yFactor: Double) = {
    val newX = getX() - xFactor
    val newY = getY() - yFactor
    val newWidth = getWidth() + ( 2 * xFactor )
    val newHeight = getHeight() + ( 2 * yFactor )
    setFrame(newX, newY, newWidth, newHeight)
  }

  def translate(xOffset: Double, yOffset: Double) = {
    val newX = getX() + xOffset
    val newY = getY() + yOffset
    setFrame(newX, newY, getWidth(), getHeight())
  }

}

import scala.collection.mutable.ArrayBuffer

class Pizza (
  var crustType: CrustType,
  var crustSize: CrustSize,
  val toppings: ArrayBuffer[Topping]
)
{
  def addTopping(topping: Topping): Unit = toppings += topping

  def removeTopping(topping: Topping): Unit = toppings -= topping

  def removeAllToppings(): Unit = toppings.clear()

  override def toString: String = {
    var counter = 0
    val toppingsToString = toppings.mkString(", ")
    counter = counter + 1
    s"""Pizza $counter:
       | size: $crustSize
       | crust type: $crustType
       | toppings: $toppingsToString
       |""".stripMargin
  }
}

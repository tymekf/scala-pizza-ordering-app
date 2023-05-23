import scala.collection.mutable.ArrayBuffer

class Order (
  val pizzas: ArrayBuffer[Pizza],
  var customer: Customer
){

  def addPizza(pizza: Pizza): Unit = {
    pizzas += pizza
  }

  def removePizza(pizza: Pizza): Unit = {
    pizzas -= pizza
  }

  def printOrder(): Unit = {
    pizzas.foreach(println)
  }

  def getPrice: Int = ???

}

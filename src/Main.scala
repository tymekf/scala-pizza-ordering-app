import scala.collection.mutable.ArrayBuffer

object Main extends App {

  val regularCapricciosa = new Pizza(RegularCrust, RegularPizza, ArrayBuffer(Cheese, Ham, Mushrooms))

  val largeMarinara = new Pizza (ThinCrust, LargePizza, ArrayBuffer())

  val newCustomer = new Customer("Alex", "Chilton", newAddress)

  val newAddress = new Address("", "", "")

  val newWorldOrder = new Order(ArrayBuffer(regularCapricciosa, largeMarinara), newCustomer)

  regularCapricciosa.addTopping(Cheese)

  newWorldOrder.addPizza(new Pizza(ThickCrust, SmallPizza, ArrayBuffer(Cheese, Salami, Pepperoni, Onion)))

  newWorldOrder.printOrder()

}

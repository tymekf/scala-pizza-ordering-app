  sealed trait Topping
  case object Ham extends Topping
  case object Salami extends Topping
  case object Bacon extends Topping
  case object Onion extends Topping
  case object Pepperoni extends Topping
  case object Cheese extends Topping
  case object Mushrooms extends Topping

  sealed trait CrustSize
  case object SmallPizza extends CrustSize
  case object RegularPizza extends CrustSize
  case object LargePizza extends CrustSize

  sealed trait CrustType
  case object ThinCrust extends CrustType
  case object RegularCrust extends CrustType
  case object ThickCrust extends CrustType
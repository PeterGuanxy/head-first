package headfirst.chapter4_factory.pizza_2;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/3/2
 */
public class ChicagoPizzaStore extends PizzaStore {

  @Override
  Pizza createPizza(String type) {
    if (type.equals("cheese")) {
      return new ChicagoStyleCheesePizza();
    } else if (type.equals("veggie")) {
      return new ChicagoStyleVeggiePizza();
    } else if (type.equals("clam")) {
      return new ChicagoStyleClamPizza();
    } else if (type.equals("peppernoi")) {
      return new ChicagoStylePepperoniPizza();
    } else {
      return null;
    }
  }
}

package headfirst.chapter4_factory.pizza_2;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/3/2
 */
public class NYPizzaStore extends PizzaStore {

  @Override
  Pizza createPizza(String type) {
    if (type.equals("cheese")) {
      return new NYStyleCheesePizza();
    } else if (type.equals("veggie")) {
      return new NYStyleVeggiePizza();
    } else if (type.equals("clam")) {
      return new NYStyleClamPizza();
    } else if (type.equals("pepperoni")) {
      return new NYStylePepperoniPizza();
    } else {
      return null;
    }
  }
}

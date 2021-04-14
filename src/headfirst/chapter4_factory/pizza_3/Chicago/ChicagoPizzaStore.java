package headfirst.chapter4_factory.pizza_3.Chicago;

import headfirst.chapter4_factory.pizza_3.CheesePizza;
import headfirst.chapter4_factory.pizza_3.ClamPizza;
import headfirst.chapter4_factory.pizza_3.PepperoniPizza;
import headfirst.chapter4_factory.pizza_3.Pizza;
import headfirst.chapter4_factory.pizza_3.PizzaIngredientFactory;
import headfirst.chapter4_factory.pizza_3.PizzaStore;
import headfirst.chapter4_factory.pizza_3.VeggiePizza;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/3/5
 */
public class ChicagoPizzaStore extends PizzaStore {

  @Override
  protected Pizza createPizza(String item) {
    Pizza pizza = null;
    PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

    if (item.equals("cheese")) {

      pizza = new CheesePizza(ingredientFactory);
      pizza.setName("Chicago Style Cheese Pizza");

    } else if (item.equals("veggie")) {

      pizza = new VeggiePizza(ingredientFactory);
      pizza.setName("Chicago Style Veggie Pizza");

    } else if (item.equals("clam")) {

      pizza = new ClamPizza(ingredientFactory);
      pizza.setName("Chicago Style Clam Pizza");

    } else if (item.equals("pepperoni")) {

      pizza = new PepperoniPizza(ingredientFactory);
      pizza.setName("Chicago Style Pepperoni Pizza");

    }
    return pizza;
  }
}

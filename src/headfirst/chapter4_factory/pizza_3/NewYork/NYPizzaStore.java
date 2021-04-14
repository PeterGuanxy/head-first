package headfirst.chapter4_factory.pizza_3.NewYork;

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
public class NYPizzaStore extends PizzaStore {

  @Override
  protected Pizza createPizza(String item) {
    Pizza pizza = null;
    PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

    if (item.equals("cheese")) {

      pizza = new CheesePizza(ingredientFactory);
      pizza.setName("New York Style Cheese Pizza");

    } else if (item.equals("veggie")) {

      pizza = new VeggiePizza(ingredientFactory);
      pizza.setName("New York Style Veggie Pizza");

    } else if (item.equals("clam")) {

      pizza = new ClamPizza(ingredientFactory);
      pizza.setName("New York Style Clam Pizza");

    } else if (item.equals("pepperoni")) {

      pizza = new PepperoniPizza(ingredientFactory);
      pizza.setName("New York Style Pepperoni Pizza");

    }
    return pizza;
  }
}

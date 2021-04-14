package headfirst.chapter4_factory.pizza_3;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/3/4
 */
public abstract class PizzaStore {

  protected  abstract Pizza createPizza(String item);

  public Pizza orderPizza(String type) {
    Pizza pizza = createPizza(type);
    System.out.println("------ Making a " + pizza.getName() + " ------");
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }

}

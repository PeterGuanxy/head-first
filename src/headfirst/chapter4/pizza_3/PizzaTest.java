package headfirst.chapter4.pizza_3;

import headfirst.chapter4.pizza_3.Chicago.ChicagoPizzaStore;
import headfirst.chapter4.pizza_3.NewYork.NYPizzaStore;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/3/5
 */
public class PizzaTest {

  public static void main(String[] args) {
    PizzaStore nyStore = new NYPizzaStore();
    PizzaStore chicagoStore = new ChicagoPizzaStore();

    Pizza pizza = nyStore.orderPizza("cheese");
    System.out.println("Peter ordered a " + pizza);
    System.out.println();

    pizza = chicagoStore.orderPizza("cheese");
    System.out.println("Peter ordered a " + pizza);
    System.out.println();

    pizza = nyStore.orderPizza("pepperoni");
    System.out.println("Peter ordered a " + pizza);
    System.out.println();

    pizza = chicagoStore.orderPizza("veggie");
    System.out.println("Peter ordered a " + pizza);
    System.out.println();
  }

}

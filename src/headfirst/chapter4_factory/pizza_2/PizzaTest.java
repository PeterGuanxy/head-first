package headfirst.chapter4_factory.pizza_2;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/3/2
 */
public class PizzaTest {

  public static void main(String[] args) {
    PizzaStore nyStore = new NYPizzaStore();
    PizzaStore chicagoStore = new ChicagoPizzaStore();

    Pizza pizza = nyStore.orderPizza("cheese");
    System.out.println("-----Peter ordered a " + pizza.getName() + " -----");

    pizza = chicagoStore.orderPizza("clam");
    System.out.println("-----Lily ordered a " + pizza.getName() + " -----");
  }

}

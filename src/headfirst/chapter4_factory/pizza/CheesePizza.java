package headfirst.chapter4_factory.pizza;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/3/1
 */
public class CheesePizza extends Pizza {

  public CheesePizza() {
    name = "Cheese Pizza";
    dough = "Regular Crust";
    sauce = "Marinara Pizza Sauce";
    toppings.add("Fresh Mozzarella");
    toppings.add("Parmesan");
  }

}

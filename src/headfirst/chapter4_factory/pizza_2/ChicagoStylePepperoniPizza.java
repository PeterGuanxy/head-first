package headfirst.chapter4_factory.pizza_2;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/3/2
 */
public class ChicagoStylePepperoniPizza extends Pizza {

  public ChicagoStylePepperoniPizza() {
    name = "Chicago Style Pepperoni Pizza";
    dough = "Extra Thick Crust Dough";
    sauce = "Plum Tomato Sauce";

    toppings.add("Shredded Mozzarella Cheese");
    toppings.add("Black Olives");
    toppings.add("Spinach");
    toppings.add("Eggplant");
    toppings.add("Sliced Pepperoni");
  }

  @Override
  void cut() {
    System.out.println("Cutting the pizza into square slices");
  }

}

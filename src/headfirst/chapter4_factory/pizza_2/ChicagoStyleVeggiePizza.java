package headfirst.chapter4_factory.pizza_2;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/3/2
 */
public class ChicagoStyleVeggiePizza extends Pizza {

  public ChicagoStyleVeggiePizza() {
    name = "Chicago Deep Dish Veggie Pizza";
    dough = "Extra Thick Crust Dough";
    sauce = "Plum Tomato Sauce";

    toppings.add("Shredded Mozzarella Cheese");
    toppings.add("Black Olives");
    toppings.add("Spinach");
    toppings.add("Eggplant");
  }

  @Override
  void cut() {
    System.out.println("Cutting the pizza into square slices");
  }

}

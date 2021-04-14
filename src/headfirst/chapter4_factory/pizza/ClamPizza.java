package headfirst.chapter4_factory.pizza;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/3/1
 */
public class ClamPizza extends Pizza {

  public ClamPizza() {
    name = "Clam Pizza";
    dough = "Thin crust";
    sauce = "White garlic sauce";
    toppings.add("Clams");
    toppings.add("Grated parmesan cheese");
  }

}

package headfirst.chapter4_factory.pizza_2;

import java.util.ArrayList;
import java.util.List;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/3/1
 */
public abstract class Pizza {

  String name;
  String dough;
  String sauce;
  List<String> toppings = new ArrayList<>();

  void prepare() {
    System.out.println("Prepare " + name);
    System.out.println("Tossing dough...");
    System.out.println("Adding sauce...");
    System.out.println("Adding toppings: ");
    for (String topping : toppings) {
      System.out.println("   " + topping);
    }
  }

  void bake() {
    System.out.println("Bake for 25 minutes at 350");
  }

  void cut() {
    System.out.println("Cut the pizza into diagonal slices");
  }

  void box() {
    System.out.println("Place pizza in official PizzaStore box");
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    StringBuilder display = new StringBuilder();
    display.append("---- ").append(name).append(" ----\n");
    display.append(dough).append("\n");
    display.append(sauce).append("\n");
    for (String topping : toppings) {
      display.append(topping).append("\n");
    }
    return display.toString();
  }

}

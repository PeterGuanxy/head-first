package headfirst.chapter4_factory.pizza_3;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/3/5
 */
public class VeggiePizza extends Pizza {

  PizzaIngredientFactory ingredientFactory;

  public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
    this.ingredientFactory = ingredientFactory;
  }

  @Override
  void prepare() {
    System.out.println("Preparing " + name);
    dough = ingredientFactory.createDough();
    sauce = ingredientFactory.createSauce();
    cheese = ingredientFactory.createCheese();
    veggies = ingredientFactory.createVeggies();
  }
}

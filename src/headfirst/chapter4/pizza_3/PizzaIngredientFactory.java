package headfirst.chapter4.pizza_3;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/3/4
 */
public interface PizzaIngredientFactory {

  Dough createDough();
  Sauce createSauce();
  Cheese createCheese();
  Veggies[] createVeggies();
  Pepperoni createPepperoni();
  Clams createClam();

}

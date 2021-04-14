package headfirst.chapter4_factory.pizza_3.Chicago;

import headfirst.chapter4_factory.pizza_3.Cheese;
import headfirst.chapter4_factory.pizza_3.Cheeses.MozzarellaCheese;
import headfirst.chapter4_factory.pizza_3.Clam.FrozenClams;
import headfirst.chapter4_factory.pizza_3.Clams;
import headfirst.chapter4_factory.pizza_3.Dough;
import headfirst.chapter4_factory.pizza_3.Doughs.ThickCrustDough;
import headfirst.chapter4_factory.pizza_3.Pepperoni;
import headfirst.chapter4_factory.pizza_3.Pepperonis.SlicedPepperoni;
import headfirst.chapter4_factory.pizza_3.PizzaIngredientFactory;
import headfirst.chapter4_factory.pizza_3.Sauce;
import headfirst.chapter4_factory.pizza_3.Sauces.PlumTomatoSauce;
import headfirst.chapter4_factory.pizza_3.Veggies;
import headfirst.chapter4_factory.pizza_3.veggies.BlackOlives;
import headfirst.chapter4_factory.pizza_3.veggies.EggPlant;
import headfirst.chapter4_factory.pizza_3.veggies.Spinach;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/3/5
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

  @Override
  public Dough createDough() {
    return new ThickCrustDough();
  }

  @Override
  public Sauce createSauce() {
    return new PlumTomatoSauce();
  }

  @Override
  public Cheese createCheese() {
    return new MozzarellaCheese();
  }

  @Override
  public Veggies[] createVeggies() {
    Veggies veggies[] = {new BlackOlives(), new Spinach(), new EggPlant()};
    return veggies;
  }

  @Override
  public Pepperoni createPepperoni() {
    return new SlicedPepperoni();
  }

  @Override
  public Clams createClam() {
    return new FrozenClams();
  }
}

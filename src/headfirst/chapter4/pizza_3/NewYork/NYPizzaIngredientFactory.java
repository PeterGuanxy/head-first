package headfirst.chapter4.pizza_3.NewYork;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.MethodAccessor_Short;
import headfirst.chapter4.pizza_3.Cheese;
import headfirst.chapter4.pizza_3.Cheeses.ReggianoCheese;
import headfirst.chapter4.pizza_3.Clam.FreshClams;
import headfirst.chapter4.pizza_3.Clams;
import headfirst.chapter4.pizza_3.Dough;
import headfirst.chapter4.pizza_3.Doughs.ThinCrustDough;
import headfirst.chapter4.pizza_3.Pepperoni;
import headfirst.chapter4.pizza_3.Pepperonis.SlicedPepperoni;
import headfirst.chapter4.pizza_3.PizzaIngredientFactory;
import headfirst.chapter4.pizza_3.Sauce;
import headfirst.chapter4.pizza_3.Sauces.MarinaraSauce;
import headfirst.chapter4.pizza_3.Veggies;
import headfirst.chapter4.pizza_3.veggies.Garlic;
import headfirst.chapter4.pizza_3.veggies.Mushroom;
import headfirst.chapter4.pizza_3.veggies.Onion;
import headfirst.chapter4.pizza_3.veggies.RedPepper;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/3/5
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

  @Override
  public Dough createDough() {
    return new ThinCrustDough();
  }

  @Override
  public Sauce createSauce() {
    return new MarinaraSauce();
  }

  @Override
  public Cheese createCheese() {
    return new ReggianoCheese();
  }

  @Override
  public Veggies[] createVeggies() {
    Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    return veggies;
  }

  @Override
  public Pepperoni createPepperoni() {
    return new SlicedPepperoni();
  }

  @Override
  public Clams createClam() {
    return new FreshClams();
  }
}

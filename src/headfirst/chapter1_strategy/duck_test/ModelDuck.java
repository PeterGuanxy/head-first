package headfirst.chapter1_strategy.duck_test;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/2/24
 */
public class ModelDuck extends Duck {

  public ModelDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new Quack();
  }

  @Override
  public void display() {
    System.out.println("I'm a model duck");
  }
}

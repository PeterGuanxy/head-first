package headfirst.chapter1_strategy.duck_test;

/**
 * ** Created by peter.guan on 2019/8/9.
 *
 * @author peter.guan
 */
public class MallardDuck extends Duck {

  public MallardDuck() {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

  @Override
  public void display() {
    System.out.println("I'm a real Mallard duck");
  }
}

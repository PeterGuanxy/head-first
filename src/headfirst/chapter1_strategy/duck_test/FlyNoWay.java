package headfirst.chapter1_strategy.duck_test;

/**
 * ** Created by peter.guan on 2019/8/9.
 *
 * @author peter.guan
 */
public class FlyNoWay implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("I can't fly");
  }
}

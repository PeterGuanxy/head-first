package headfirst.chapter1_strategy.duck_test;

/**
 * ** Created by peter.guan on 2019/8/9.
 *
 * @author peter.guan
 */
public class FlyWithWings implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("I'm flying!");
  }
}

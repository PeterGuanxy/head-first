package chapter1.duck_test;

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

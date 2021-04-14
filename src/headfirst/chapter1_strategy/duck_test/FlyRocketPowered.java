package headfirst.chapter1_strategy.duck_test;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/2/24
 */
public class FlyRocketPowered implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("I'm flying with a rocket!");
  }
}

package headfirst.chapter1.duck_test;

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

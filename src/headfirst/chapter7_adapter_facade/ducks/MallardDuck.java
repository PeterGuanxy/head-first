package headfirst.chapter7_adapter_facade.ducks;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/5/26
 */
public class MallardDuck implements Duck {

  @Override
  public void quack() {
    System.out.println("Quack");
  }

  @Override
  public void fly() {
    System.out.println("I'm flying");
  }
}

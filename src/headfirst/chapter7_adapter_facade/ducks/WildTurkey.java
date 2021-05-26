package headfirst.chapter7_adapter_facade.ducks;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/5/26
 */
public class WildTurkey implements Turkey {

  @Override
  public void gobble() {
    System.out.println("Gobble gobble");
  }

  @Override
  public void fly() {
    System.out.println("I'm flying a short distance");
  }
}

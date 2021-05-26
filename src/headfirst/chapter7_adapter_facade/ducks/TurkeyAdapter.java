package headfirst.chapter7_adapter_facade.ducks;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/5/26
 */
public class TurkeyAdapter implements Duck {

  Turkey turkey;

  public TurkeyAdapter(Turkey turkey) {
    this.turkey = turkey;
  }

  @Override
  public void quack() {
    turkey.gobble();
  }

  @Override
  public void fly() {
    for (int i = 0; i < 5; i++) {
      turkey.fly();
    }
  }
}

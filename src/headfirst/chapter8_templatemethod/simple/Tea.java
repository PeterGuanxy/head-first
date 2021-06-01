package headfirst.chapter8_templatemethod.simple;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/6/1
 */
public class Tea extends CaffeineBeverage {

  @Override
  void brew() {
    System.out.println("Steeping the tea");
  }

  @Override
  void addCondiments() {
    System.out.println("Adding lemon");
  }
}

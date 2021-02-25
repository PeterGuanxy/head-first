package headfirst.chapter1.duck_test;

/**
 * ** Created by peter.guan on 2019/8/9.
 *
 * @author peter.guan
 */
public class MuteQuack implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("<< Silence >>");
  }
}

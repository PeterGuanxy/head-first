package headfirst.chapter3.starbuzz;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/2/28
 */
public class Decat extends Beverage{

  public Decat() {
    description = "Decat";
  }

  @Override
  public double cost() {
    return 1.05;
  }
}

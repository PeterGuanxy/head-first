package headfirst.chapter3.starbuzz;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/2/28
 */
public class DarkRoast extends Beverage{

  public DarkRoast() {
    description = "Dark Roast Coffee";
  }

  @Override
  public double cost() {
    return 0.99;
  }
}

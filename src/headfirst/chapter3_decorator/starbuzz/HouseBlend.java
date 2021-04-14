package headfirst.chapter3_decorator.starbuzz;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/2/28
 */
public class HouseBlend extends Beverage{

  public HouseBlend() {
    description = "House Blend Coffee";
  }

  @Override
  public double cost() {
    return 0.89;
  }
}

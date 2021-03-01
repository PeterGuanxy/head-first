package headfirst.chapter3.starbuzz;

/**
 * description 奶泡
 *
 * @author Peter Guan
 * @date 2021/2/28
 */
public class Whip extends CondimentDecorator {

  Beverage beverage;

  public Whip(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public double cost() {
    return 0.10 + beverage.cost();
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Whip";
  }
}

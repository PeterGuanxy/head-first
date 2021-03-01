package headfirst.chapter3.starbuzz;

/**
 * description 豆浆
 *
 * @author Peter Guan
 * @date 2021/2/28
 */
public class Soy extends CondimentDecorator {

  Beverage beverage;

  public Soy(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public double cost() {
    return 0.15 + beverage.cost();
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Soy";
  }
}

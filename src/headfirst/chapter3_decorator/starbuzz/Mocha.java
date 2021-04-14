package headfirst.chapter3_decorator.starbuzz;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/2/28
 */
public class Mocha extends CondimentDecorator {

  /**
   * 用一个实例变量记录饮料，也就是被装饰者
   */
  Beverage beverage;

  /**
   * 把饮料当做构造器参数，再由构造器将此饮料记录在实例变量中
   */
  public Mocha(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public double cost() {
    return 0.20 + beverage.cost();
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Mocha";
  }
}

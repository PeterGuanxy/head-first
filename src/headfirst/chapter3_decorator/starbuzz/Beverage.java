package headfirst.chapter3_decorator.starbuzz;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/2/28
 */
public abstract class Beverage {

  String description = "Unknown Beverage";

  public String getDescription() {
    return description;
  }

  /**
   * 计费
   * @return 费用
   */
  public abstract double cost();

}

package headfirst.chapter8_templatemethod.simple;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/6/1
 */
public abstract class CaffeineBeverageWithHook {

  final void prepareRecipe() {
    boilWater();
    brew();
    pourInCup();
    if (customerWantsCondiments()) {
      addCondiments();
    }
  }

  abstract void brew();

  abstract void addCondiments();

  void boilWater() {
    System.out.println("Boiling water");
  }

  void pourInCup() {
    System.out.println("Pouring into cup");
  }

  boolean customerWantsCondiments() {
    return true;
  }

}

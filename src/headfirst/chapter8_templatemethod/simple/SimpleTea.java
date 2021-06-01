package headfirst.chapter8_templatemethod.simple;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/6/1
 */
public class SimpleTea {

  void prepareRecipe() {
    boilWater();
    steepTeaBag();
    pourInCup();
    addLemon();
  }

  public void boilWater() {
    System.out.println("Boiling water");
  }

  public void steepTeaBag() {
    System.out.println("Steeping the tea");
  }

  public void addLemon() {
    System.out.println("Adding lemon");
  }

  public void pourInCup() {
    System.out.println("Pouring into cup");
  }

}

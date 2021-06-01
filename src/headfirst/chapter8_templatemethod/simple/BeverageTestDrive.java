package headfirst.chapter8_templatemethod.simple;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/6/1
 */
public class BeverageTestDrive {

  public static void main(String[] args) {

    TeaWithHook tea = new TeaWithHook();
    CoffeeWithHook coffee = new CoffeeWithHook();

    System.out.println("\nMaking tea...");
    tea.prepareRecipe();

    System.out.println("\nMaking coffee...");
    coffee.prepareRecipe();
  }

}

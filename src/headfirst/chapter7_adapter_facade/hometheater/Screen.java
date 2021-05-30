package headfirst.chapter7_adapter_facade.hometheater;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/5/30
 */
public class Screen {

  String description;

  public Screen(String description) {
    this.description = description;
  }

  public void up() {
    System.out.println(description + " going up");
  }

  public void down() {
    System.out.println(description + " going down");
  }

  @Override
  public String toString() {
    return description;
  }
}

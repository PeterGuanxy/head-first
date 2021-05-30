package headfirst.chapter7_adapter_facade.hometheater;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/5/30
 */
public class PopcornPopper {

  String description;

  public PopcornPopper(String description) {
    this.description = description;
  }

  public void on() {
    System.out.println(description + " on");
  }

  public void off() {
    System.out.println(description + " off");
  }

  public void pop() {
    System.out.println(description + " popping popcorn!");
  }

  @Override
  public String toString() {
    return description;
  }
}

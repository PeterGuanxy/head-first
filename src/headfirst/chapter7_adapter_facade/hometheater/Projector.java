package headfirst.chapter7_adapter_facade.hometheater;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/5/30
 */
public class Projector {

  String description;
  StreamingPlayer player;

  public Projector(String description, StreamingPlayer player) {
    this.description = description;
    this.player = player;
  }

  public void on() {
    System.out.println(description + " on");
  }

  public void off() {
    System.out.println(description + " off");
  }

  public void wideScreenMode() {
    System.out.println(description + " in widescreen mode (16x9 aspect ratio)");
  }

  public void tvMode() {
    System.out.println(description + " in tv mode (4x3 aspect ratio)");
  }

  @Override
  public String toString() {
    return description;
  }
}

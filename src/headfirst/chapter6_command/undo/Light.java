package headfirst.chapter6_command.undo;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/5/24
 */
public class Light {

  String location;

  public Light(String location) {
    this.location = location;
  }

  public void on() {
    System.out.println("Light is on");
  }

  public void off() {
    System.out.println("Light is off");
  }

}

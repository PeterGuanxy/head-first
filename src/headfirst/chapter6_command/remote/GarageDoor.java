package headfirst.chapter6_command.remote;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/4/25
 */
public class GarageDoor {

  String location;

  public GarageDoor(String location) {
    this.location = location;
  }

  public void up() {
    System.out.println(location + " garage door is up");
  }

  public void down() {
    System.out.println(location + " garage door is down");
  }

  public void stop() {
    System.out.println(location + " garage door is stop");
  }

  public void lightOn() {
    System.out.println(location + " garage light is on");
  }

  public void lightOff() {
    System.out.println(location + " garage light is off");
  }
}

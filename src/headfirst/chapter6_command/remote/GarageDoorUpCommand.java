package headfirst.chapter6_command.remote;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/4/25
 */
public class GarageDoorUpCommand implements Command {

  GarageDoor garageDoor;

  public GarageDoorUpCommand(GarageDoor garageDoor) {
    this.garageDoor = garageDoor;
  }

  @Override
  public void execute() {
    garageDoor.up();
    garageDoor.lightOn();
  }
}

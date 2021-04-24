package headfirst.chapter6_command.simple_remote;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/4/14
 */
public class SimpleRemoteControl {

  Command slot;

  public SimpleRemoteControl() {

  }

  public void setCommand(Command command) {
    slot = command;
  }

  public void buttonWasPressed() {
    slot.execute();
  }

}

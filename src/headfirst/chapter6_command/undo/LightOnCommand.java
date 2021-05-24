package headfirst.chapter6_command.undo;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/5/24
 */
public class LightOnCommand implements Command {

  Light light;

  public LightOnCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.on();
  }

  @Override
  public void undo() {
    light.off();
  }
}

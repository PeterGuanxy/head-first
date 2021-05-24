package headfirst.chapter6_command.undo;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/5/24
 */
public class LightOffCommand implements Command {

  Light light;

  public LightOffCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.off();
  }

  @Override
  public void undo() {
    light.on();
  }
}

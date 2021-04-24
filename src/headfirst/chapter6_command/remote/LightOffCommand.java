package headfirst.chapter6_command.remote;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/4/24
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
}

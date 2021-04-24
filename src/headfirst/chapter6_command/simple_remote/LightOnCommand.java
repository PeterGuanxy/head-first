package headfirst.chapter6_command.simple_remote;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/4/14
 */
public class LightOnCommand implements Command{

  Light light;

  public LightOnCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.on();
  }
}

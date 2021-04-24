package headfirst.chapter6_command.remote;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/4/24
 */
public class CeilingFanOffCommand implements Command {

  CeilingFan ceilingFan;

  public CeilingFanOffCommand(CeilingFan ceilingFan) {
    this.ceilingFan = ceilingFan;
  }

  @Override
  public void execute() {
    ceilingFan.off();
  }
}

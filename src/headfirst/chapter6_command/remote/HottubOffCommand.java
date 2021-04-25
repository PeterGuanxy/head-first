package headfirst.chapter6_command.remote;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/4/25
 */
public class HottubOffCommand implements Command {

  Hottub hottub;

  public HottubOffCommand(Hottub hottub) {
    this.hottub = hottub;
  }

  @Override
  public void execute() {
    hottub.cool();
    hottub.off();
  }
}

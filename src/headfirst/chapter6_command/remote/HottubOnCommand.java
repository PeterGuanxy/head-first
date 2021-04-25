package headfirst.chapter6_command.remote;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/4/25
 */
public class HottubOnCommand implements Command {

  Hottub hottub;

  public HottubOnCommand(Hottub hottub) {
    this.hottub = hottub;
  }

  @Override
  public void execute() {
    hottub.on();
    hottub.heat();
    hottub.bubblesOn();
  }
}

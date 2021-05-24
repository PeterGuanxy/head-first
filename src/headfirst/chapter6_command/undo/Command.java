package headfirst.chapter6_command.undo;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/5/24
 */
public interface Command {

  public void execute();
  public void undo();

}

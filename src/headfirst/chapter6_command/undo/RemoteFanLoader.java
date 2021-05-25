package headfirst.chapter6_command.undo;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/5/25
 */
public class RemoteFanLoader {

  public static void main(String[] args) {
    RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

    CeilingFan ceilingFan = new CeilingFan("Living Room");

    CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
    CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
    CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

    remoteControl.setCommand(0, ceilingFanMediumCommand, ceilingFanOffCommand);
    remoteControl.setCommand(1, ceilingFanHighCommand, ceilingFanOffCommand);

    remoteControl.onButtonWasPushed(0);
    remoteControl.offButtonWasPushed(0);
    System.out.println(remoteControl);

    remoteControl.undoButtonWasPushed();

    remoteControl.onButtonWasPushed(1);
    System.out.println(remoteControl);
    remoteControl.undoButtonWasPushed();
  }

}

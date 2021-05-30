package headfirst.chapter7_adapter_facade.hometheater;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/5/30
 */
public class HomeTheaterTestDrive {

  public static void main(String[] args) {
    Amplifier amp = new Amplifier("Amplifier");
    Tuner tuner = new Tuner("Tuner", amp);
    StreamingPlayer streaming = new StreamingPlayer("Stream", amp);
    CdPlayer cd = new CdPlayer("CDPlayer", amp);
    Projector projector = new Projector("Projector", streaming);
    Screen screen = new Screen("Apple screen");
    TheaterLights lights = new TheaterLights("Room lights");
    PopcornPopper popper = new PopcornPopper("Sweaty popper");

    HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, streaming, cd, projector,
        lights, screen, popper);

    homeTheater.watchMovie("Raiders of the Lost Ark");
    homeTheater.endMovie();

  }

}

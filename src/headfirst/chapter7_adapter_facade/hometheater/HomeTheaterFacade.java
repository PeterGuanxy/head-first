package headfirst.chapter7_adapter_facade.hometheater;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/5/30
 */
public class HomeTheaterFacade {

  Amplifier amp;
  Tuner tuner;
  StreamingPlayer stream;
  CdPlayer cd;
  Projector projector;
  TheaterLights lights;
  Screen screen;
  PopcornPopper popper;

  public HomeTheaterFacade(Amplifier amp, Tuner tuner, StreamingPlayer stream, CdPlayer cd,
      Projector projector, TheaterLights lights
      , Screen screen, PopcornPopper popper) {
    this.amp = amp;
    this.tuner = tuner;
    this.stream = stream;
    this.cd = cd;
    this.projector = projector;
    this.screen = screen;
    this.lights = lights;
    this.popper = popper;
  }

  public void watchMovie(String movie) {
    System.out.println("Get ready to watch a movie...");
    popper.on();
    popper.pop();
    lights.dim(10);
    screen.down();
    projector.on();
    projector.wideScreenMode();
    amp.on();
    amp.setStreamingPlayer(stream);
    amp.setSurroundSound();
    amp.setVolume(5);
    stream.on();
    stream.play(movie);
  }

  public void endMovie() {
    System.out.println("Shutting movie theater down...");
    popper.off();
    lights.on();
    screen.up();
    projector.off();
    amp.off();
    stream.stop();
    cd.eject();
    stream.off();
  }

}

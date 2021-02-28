package headfirst.chapter2.weather_o_rama_observable;

import java.util.Observable;
import java.util.Observer;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/2/28
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

  Observable observable;
  private float temperature;
  private float humidity;

  public CurrentConditionsDisplay(Observable observable) {
    this.observable = observable;
    observable.addObserver(this);
  }

  @Override
  public void display() {
    System.out
        .println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
  }

  @Override
  public void update(Observable o, Object arg) {
    if (o instanceof WeatherData) {
      WeatherData weatherData = (WeatherData) o;
      this.temperature = weatherData.getTemperature();
      this.humidity = weatherData.getHumidity();
      display();
    }
  }
}

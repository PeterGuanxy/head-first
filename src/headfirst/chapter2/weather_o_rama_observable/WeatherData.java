package headfirst.chapter2.weather_o_rama_observable;

import java.util.Observable;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/2/28
 */
public class WeatherData extends Observable {

  private float temperature;
  private float humidity;
  private float pressure;

  public WeatherData() {

  }

  public void measurementsChanged() {
    setChanged();
    notifyObservers();
  }

  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }

  public float getTemperature() {
    return temperature;
  }

  public float getHumidity() {
    return humidity;
  }

  public float getPressure() {
    return pressure;
  }

}

package headfirst.chapter2_observer.weather_o_rama;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/2/25
 */
public interface Observer {

  void update(float temp, float humidity, float pressure);

}

package headfirst.chapter2.weather_o_rama;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/2/25
 */
public interface Subject {

  void registerObserver(Observer o);

  void removeObserver(Observer o);

  void notifyObservers();

}

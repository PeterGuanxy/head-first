package headfirst.chapter5.chocalate;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/3/15
 */
public class ChocolateController {

  public static void main(String[] args) {

    ChocolateBoiler boiler =ChocolateBoiler.getInstance();
    boiler.fill();
    boiler.boil();
    boiler.drain();

    ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
  }

}

package headfirst.chapter3.my_io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/3/1
 */
public class InputTest {

  public static void main(String[] args) throws IOException {
    int c;

    try {
      InputStream in = new LowerCaseInputStream(
          new BufferedInputStream(new FileInputStream("test.txt")));
      while ((c = in.read()) >= 0) {
        System.out.print((char) c);
      }
      in.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

}

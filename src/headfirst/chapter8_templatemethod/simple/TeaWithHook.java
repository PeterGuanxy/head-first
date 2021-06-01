package headfirst.chapter8_templatemethod.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * description
 *
 * @author Peter Guan
 * @date 2021/6/1
 */
public class TeaWithHook extends CaffeineBeverageWithHook {

  @Override
  void brew() {
    System.out.println("Steeping the tea");
  }

  @Override
  void addCondiments() {
    System.out.println("Adding lemon");
  }

  @Override
  public boolean customerWantsCondiments() {
    String answer = getUserInput();

    return answer.toLowerCase().startsWith("y");
  }

  private String getUserInput() {
    String answer = null;

    System.out.println("Would you like lemon with your tea (y/n)?");

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    try {
      answer = in.readLine();
    } catch (IOException e) {
      System.out.println("IO error trying to read your answer");
    }

    if (answer == null) {
      return "no";
    }
    return answer;
  }
}

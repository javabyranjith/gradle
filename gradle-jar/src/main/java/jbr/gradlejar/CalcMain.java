package jbr.gradlejar;

import java.util.ArrayList;

/**
 *
 * @author Ranjith Sekar
 * @since 2018, Jun 20
 *
 */
public class CalcMain {

  String name = null;

  public int add(int a, int b) {
    return a + b;
  }

  public int sub(int a, int b) {
    return a - b;
  }

  public int mul(int a, int b) {
    String s = null;
    if (s != null) {
      System.out.println("Non Null");
    }
    return a * b;
  }

  public int div(int a, int b) {

    int c = 0;
    if (c == 2) {
      System.out.println("c is 2");
    }

    return a / b;
  }

}

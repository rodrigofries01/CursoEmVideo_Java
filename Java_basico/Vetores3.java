package Java_basico;

import java.util.Arrays;

public class Vetores3 {
  public static <mes> void main(String[] args) {
    double num[] = {3.5, 5.1, 1.75, 8, 4.98};

    Arrays.sort(num);

    for (double valor : num) {
      System.out.println(valor);
    }
  }
}

import java.util.Arrays;

public class Vetores5 {
  public static void main(String[] args) {

    int num[] = new int[5];

    Arrays.fill(num, 8);

    for (int val : num) {
      System.out.println(val);
    }
  }
}

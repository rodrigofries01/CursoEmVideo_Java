package Java_basico;

import java.util.Scanner;

public class EstruturasCondicionais3 {
  public static void main(String[] args) {
    try (Scanner teclado = new Scanner(System.in)) {
      int A = teclado.nextInt();
      int B = teclado.nextInt();
      int C = teclado.nextInt();
      float Delta;
      Delta = ((B * B) - 4 * A * C);

      System.out.printf("%.1f\n", Delta);

      if (Delta < 0) {
        System.out.println("Não existem Raizes");
      } else {
        System.out.println("Existem Raizes reais!");
      }
    }
  }
}

package Java_basico;

import java.util.Scanner;

public class EstruturasDeRepeticao {
  public static void main(String[] args) {
    try (Scanner teclado = new Scanner(System.in)) {
      System.out.println("Digite um valor: ");
      int tam = teclado.nextInt();
      int num = 0;

      while (num <= tam) {
        num++;
        if (num == 5 || num == 7 || num == 9) {
          System.out.println("O numero " + num + " não foi");
          continue;
        } else if (num == 15) {
          System.out.println("O numero " + num + " parou");
          break;
        }
        System.out.println("O numero " + num + " foi");
      }
    }
  }
}

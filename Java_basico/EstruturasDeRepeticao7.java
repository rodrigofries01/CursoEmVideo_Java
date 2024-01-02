package Java_basico;

import java.util.Scanner;

public class EstruturasDeRepeticao7 {
  public static void main(String[] args) {
    try (Scanner teclado = new Scanner(System.in)) {
      System.out.println("Digite um valor: ");
      int num = teclado.nextInt();

      for (int i = 0; i <= num; i += 10) {
        System.out.println(i);
      }
    }
  }
}

package Java_basico;

import java.util.Scanner;

public class EstruturasDeRepeticao5 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int num;

    do {
      System.out.println("Digite um valor: ");
      num = teclado.nextInt();
    } while (num != 5);
    System.out.println("Acabou");
  }
}

package Java_basico;

import java.util.Scanner;

public class EstruturasCondicionais2 {
  public static void main(String[] args) {
    try (Scanner teclado = new Scanner(System.in)) {
      System.out.print("Digite um Valor: ");

      int valor = teclado.nextInt();

      if (valor % 2 == 0) {
        System.out.println("O número " + valor + " é Par!");
      } else {
        System.out.println("O número " + valor + " é Ímpar!");
      }
    }
  }
}

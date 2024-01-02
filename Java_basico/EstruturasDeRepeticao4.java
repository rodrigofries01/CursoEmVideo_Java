package Java_basico;

import java.util.Scanner;

public class EstruturasDeRepeticao4 {
  public static void main(String[] args) {
    try (Scanner teclado = new Scanner(System.in)) {
      int num, soma = 0;
      String resp;

      do {
        System.out.println("Digite um valor: ");
        num = teclado.nextInt();
        soma += num;
        System.out.println("Quer continuar? [S/N]");
        resp = teclado.next();
      } while (resp.equals("S"));
      System.out.println("A soma de todos os valores é " + soma);
    }

  }
}

package Java_basico;

import java.util.Scanner;

public class EstruturasDeRepeticao6 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int num = 1;
    int totalValor = 0;
    int totalPares = 0;
    int totalImpares = 0;
    int acimaDe100 = 0;
    int totalPI = 0;
    double mediaValores = 0;

    do {
      System.out.println("Digite um valor: ");
      num = teclado.nextInt();
      totalValor += num;

      if (num % 2 == 0 && num != 0) {
        totalPares++;
      }
      if (num % 2 == 1) {
        totalImpares++;
      }
      if (num > 100) {
        acimaDe100++;
      }
      totalPI = (totalPares + totalImpares);
      mediaValores = ((double) totalValor / totalPI);


    } while (num != 0);
    System.out.println("Total de valor: " + totalValor);
    System.out.println("Total de pares: " + totalPares);
    System.out.println("Total de impares: " + totalImpares);
    System.out.println("Acima de 100: " + acimaDe100);
    System.out.printf("Media dos valores: %.2f\n", mediaValores);
  }
}

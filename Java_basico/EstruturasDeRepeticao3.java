package Java_basico;

import java.util.Scanner;

public class EstruturasDeRepeticao3 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite um valor: ");
    int tam = teclado.nextInt();
    int num = 0;

    do {
      System.out.println(num);
      num++;
    }
    while (num <= tam);
  }
}

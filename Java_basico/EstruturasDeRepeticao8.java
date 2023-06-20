package Java_basico;

import java.util.Scanner;

public class EstruturasDeRepeticao8 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

//    System.out.println("Digite um valor: ");
//    int num = teclado.nextInt();

    for (int i = 1; i < 3; i++) {
      for (int j = 0; j < 2; j++) {
        System.out.println("i = " + i + "|| j = " + j);
      }
      System.out.println();
    }
  }
}

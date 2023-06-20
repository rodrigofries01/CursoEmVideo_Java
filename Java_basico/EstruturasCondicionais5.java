package Java_basico;

import java.util.Scanner;

public class EstruturasCondicionais5 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite um numero de pernas: ");
    int pernas = teclado.nextInt();

    switch (pernas) {
      case 1:
        System.out.println("1 Perna = Saci");
        break;
      case 2:
        System.out.println("2 Pernas = Bipede");
        break;
      case 4:
        System.out.println("4 Pernas = Quadrupede");
        break;
      case 6:
        System.out.println("6 Pernas = Aranha");
        break;
      case 8:
        System.out.println("6 Pernas = Aranha");
        break;
      default:
        System.out.println("outro = ET");
    }
  }
}

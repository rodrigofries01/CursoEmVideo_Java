import java.util.Scanner;

public class EstruturasDeRepeticao6 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int num = 0;
    int totalValor = 0;
    int totalPares = 0;
    int totalImpares;
    int acimaDe100;
    float mediaValores;

    do {
      System.out.println("Digite um valor: ");
      num = teclado.nextInt();
      totalValor += num;
      if (totalPares % 2 == 0){
        totalPares = num;
      }

    } while (num != 0);
    System.out.println("Total de valor: " + totalValor);
  }
}

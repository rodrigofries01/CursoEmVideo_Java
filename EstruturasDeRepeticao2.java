import java.util.Scanner;

public class EstruturasDeRepeticao2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite um valor: ");
    int tam = teclado.nextInt();
    int fatorial = 1;
    int cont = tam;

    while (cont >= 1) {
      fatorial *= cont;
      cont--;
    }
    System.out.println("O Fatorial de " + tam + " = " + (fatorial--) );
  }
}


import java.util.Scanner;

public class EstruturasCondicionais6 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite 3 Valores: ");

    int a = teclado.nextInt();
    int b = teclado.nextInt();
    int c = teclado.nextInt();

    if (a < b + c && b < a + c && c < a + b) {
      System.out.println("Forma um triangulo!");
      if (a == b && c == b) {
        System.out.println("Equilateral");
      } else if (a != b && b != c && a != c) {
        System.out.println("Scalene");
      } else {
        System.out.println("Isosceles");
      }
    } else {
      System.out.println("Não forma um triangulo");
    }
  }
}

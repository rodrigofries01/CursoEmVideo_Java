import java.util.Calendar;
import java.util.Scanner;

public class EstruturasCondicionais {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    Calendar data = Calendar.getInstance();
    System.out.println();
    int ano = data.get(Calendar.YEAR);
    int idade = teclado.nextInt();
    int anoNasc = ano - idade;

    if (idade >= 18) {
      System.out.println("Você nasceu em " + anoNasc + ", você é maior de idade!");
    } else {
      System.out.println("Você nasceu em " + anoNasc + ", você é menor de idade!");
    }
  }
}

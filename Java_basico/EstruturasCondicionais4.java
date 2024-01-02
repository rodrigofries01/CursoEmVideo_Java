package Java_basico;

import java.util.Calendar;
import java.util.Scanner;

public class EstruturasCondicionais4 {
  public static void main(String[] args) {
    try (Scanner teclado = new Scanner(System.in)) {
      Calendar ano = Calendar.getInstance();

      int anoAtual = ano.get(Calendar.YEAR);
      System.out.println("Digite um ano: ");

      int anoNasc = teclado.nextInt();
      int idade = anoAtual - anoNasc;
      System.out.println("Voce tem " + idade);

      if (idade < 16) {
        System.out.println("Não Vota!");
      } else if ((idade >= 16 && idade < 18) || (idade > 70)) {
        System.out.println("Opcional");
      } else {
        System.out.println("Obrigatório");
      }
    }
  }
}

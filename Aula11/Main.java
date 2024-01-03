package Aula11;

public class Main {
  public static void main(String[] args) {
    Visitante v1 = new Visitante();
    Aluno a1 = new Aluno();
    // Pessoa p1 = new Pessoa();// Não permite pois ela é uma classe abstrata
    Bolsista b1 = new Bolsista();

    System.out.println(a1.toString());
    System.out.println(v1.toString());
    System.out.println(b1.toString());

  }
}

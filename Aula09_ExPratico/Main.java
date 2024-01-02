package Aula09_ExPratico;

public class Main {
  public static void main(String[] args) {
    Pessoa leitor = new Pessoa("Otis", 6, "M");
    Livro livro = new Livro("A revolução dos Bichos", "George Orwell", 147, 77, false, leitor);

    livro.abrir();
    livro.detalhes();
    leitor.fazerAniver();
    livro.detalhes();
  }
}

package Aula11;

public class Main {
  public static void main(String[] args) {
    // Pessoa p1 = new Pessoa(); // não pode ser instanciada, pois, é uma classe
    // abstrata
    Visitante v1 = new Visitante();
    v1.setNome("Otis");
    v1.setIdade(6);
    v1.setSexo("M");
    System.out.println(v1.toString());

    System.out.println();

    Aluno a1 = new Aluno();
    a1.setNome("Filó");
    a1.setMatricula(111);
    a1.setIdade(2);
    a1.setCurso("Engenharia de software");
    a1.setSexo("F");
    System.out.println(a1.toString());
    a1.pagarMensalidade();

    System.out.println();

    Bolsista b1 = new Bolsista();
    b1.setNome("Teddy");
    b1.setMatricula(111);
    b1.setIdade(5);
    b1.setCurso("Engenharia de software");
    b1.setBolsa(12.5f);
    b1.setSexo("M");
    System.out.println(b1.toString());
    b1.pagarMensalidade();

    System.out.println();

    Professor p1 = new Professor();
    p1.setNome("Anah");
    p1.setSalario(5500f);
    p1.setIdade(25);
    p1.setEspecialidade("Engenharia de software");
    p1.receberAumento(1500f);
    p1.setSexo("F");
    System.out.println(p1.toString());
  }
}

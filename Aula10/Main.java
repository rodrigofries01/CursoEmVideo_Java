package Aula10;

public class Main {
  public static void main(String[] args) {
    Pessoa p1 = new Pessoa();
    Aluno a1 = new Aluno();
    Professor pf1 = new Professor();
    Funcionario f1 = new Funcionario();

    p1.setNome("Otis");
    a1.setNome("Filó");
    pf1.setNome("Anah");
    f1.setNome("Rodrigo");

    p1.setIdade(6);
    a1.setIdade(2);
    pf1.setIdade(23);
    f1.setIdade(23);

    p1.setSexo("M");
    a1.setSexo("F");
    pf1.setSexo("F");
    f1.setSexo("M");

    a1.setMatricula("ENGENHARIA DE SOFTWARE");
    pf1.setSalario(30005);
    f1.setSetor("Desenvolvedor");

    p1.fazerAniver();
    a1.fazerAniver();
    pf1.fazerAniver();
    f1.fazerAniver();

    System.out.println(p1.toString());
    System.out.println(a1.toString());
    System.out.println(pf1.toString());
    System.out.println(f1.toString());

  }
}

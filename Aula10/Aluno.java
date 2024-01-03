package Aula10;

public class Aluno extends Pessoa {
  private String matricula;
  private String curso;

  public void cancelarMatricula() {
    System.out.println("Matricula cancelada");
  }

  public void setCurso(String curso) {
    this.curso = curso;
  }

  public String getCurso() {
    return curso;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public String getMatricula() {
    return matricula;
  }
}

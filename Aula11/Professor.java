package Aula11;

public class Professor extends Pessoa {
  public String especialidade;
  public float salario;

  public void receberAumento(float aumento) {
    setSalario(getSalario() + aumento);
    System.out.println("O aumento no salario de " + getNome() + " é de " + aumento);
  }

  public String getEspecialidade() {
    return especialidade;
  }

  public void setEspecialidade(String especialidade) {
    this.especialidade = especialidade;
  }

  public float getSalario() {
    return salario;
  }

  public void setSalario(float salario) {
    this.salario = salario;
  }

}

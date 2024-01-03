package Aula10;

public class Pessoa {
  private String nome, sexo;
  private int idade;

  public void fazerAniver() {
    setIdade(getIdade() + 1);
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return this.nome;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public int getIdade() {
    return this.idade;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public String getSexo() {
    return this.sexo;
  }

  @Override
  public String toString() {
    return "Pessoa [nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + "]";
  }

}

package Aula11;

public abstract class Pessoa {
  protected String nome;
  protected int idade;
  protected String sexo;

  public final void fazerAniversario() {
    setIdade(getIdade() + 1);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public String toString() {
    return "Pessoa [nome = " + nome + ", idade = " + idade + ", sexo = " + sexo + "]";
  }

}

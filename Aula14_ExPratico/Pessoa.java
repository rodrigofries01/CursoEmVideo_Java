package Aula14_ExPratico;

public abstract class Pessoa {
  protected String nome;
  protected int idade;
  protected String sexo;
  protected float experiencia;

  protected void ganharExp() {
    setExperiencia(getExperiencia() + 1);
    System.out.println("Ganhou mais 1 de experiencia");
  }

  public Pessoa(String nome, int idade, String sexo) {
    this.nome = nome;
    this.idade = idade;
    this.sexo = sexo;
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

  public float getExperiencia() {
    return experiencia;
  }

  public void setExperiencia(float experiencia) {
    this.experiencia = experiencia;
  }

  @Override
  public String toString() {
    return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", experiencia=" + experiencia + " ";
  }

}

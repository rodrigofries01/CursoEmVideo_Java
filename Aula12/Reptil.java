package Aula12;

public class Reptil extends Animal {
  public Reptil(float peso, int idade, int membros) {
    super(peso, idade, membros);
  }

  private String corEscama;

  @Override
  public void locomover() {
    System.out.println("Reptil Rastejando");
  }

  @Override
  public void alimentar() {
    System.out.println("Reptil se alimentando");
  }

  @Override
  public void emitirSom() {
    System.out.println("Som de reptil");
  }

  public void setCorEscama(String corEscama) {
    this.corEscama = corEscama;
  }

  public String getCorEscama() {
    return corEscama;
  }
}

package Aula12;

public class Mamifero extends Animal {
  public Mamifero(float peso, int idade, int membros) {
    super(peso, idade, membros);

  }

  private String corPelo;

  @Override
  public void locomover() {
    System.out.println("Mamifero Correndo");
  }

  @Override
  public void alimentar() {
    System.out.println("Mamifero Mamando");
  }

  @Override
  public void emitirSom() {
    System.out.println("Som de mamifero");
  }

  public void setCorPelo(String corPelo) {
    this.corPelo = corPelo;
  }

  public String getCorPelo() {
    return corPelo;
  }

}

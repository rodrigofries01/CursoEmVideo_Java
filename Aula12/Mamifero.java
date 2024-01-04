package Aula12;

public class Mamifero extends Animal {
  private String corPelo;

  @Override
  public void locomover() {
    System.out.println("Correndo");
  }

  @Override
  public void alimentar() {
    System.out.println("Se alimentando");
  }

  @Override
  public void emitirSom() {
    System.out.println("Som de Mamifero");
  }

  public void setCorPelo(String corPelo) {
    this.corPelo = corPelo;
  }

  public String getCorPelo() {
    return corPelo;
  }
}

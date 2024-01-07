package Aula13;

public class Mamifero extends Animal {

  protected String corPelo;

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

  public Mamifero(float peso, int idade, int membros) {
    super(peso, idade, membros);
  }

}

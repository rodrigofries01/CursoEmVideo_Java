package Aula13;

public class Lobo extends Mamifero {

  @Override
  public void emitirSom() {
    System.out.println("AUUUUUUUUU");
  }

  public Lobo(float peso, int idade, int membros) {
    super(peso, idade, membros);
  }

}

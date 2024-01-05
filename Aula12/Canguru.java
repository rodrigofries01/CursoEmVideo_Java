package Aula12;

public class Canguru extends Mamifero {
  public Canguru(float peso, int idade, int membros) {
    super(peso, idade, membros);
  }

  public void usarBolsa() {
    System.out.println("Canguru Usando sua bolsa");
  }

  @Override
  public void locomover() {
    System.out.println("Canguru saltando");
  }

}

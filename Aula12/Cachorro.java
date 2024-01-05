package Aula12;

public class Cachorro extends Mamifero {
  public Cachorro(float peso, int idade, int membros) {
    super(peso, idade, membros);
  }

  public void enterrarOsso() {
    System.out.println("Cachorro enterrando osso");
  }

  public void abanarRabo() {
    System.out.println("Cachorro abanando rabo");
  }
}

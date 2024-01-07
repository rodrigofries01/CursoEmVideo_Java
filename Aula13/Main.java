package Aula13;

public class Main {
  public static void main(String[] args) {
    Mamifero mamifero = new Mamifero(12.5f, 5, 4);
    Lobo lobo = new Lobo(12.6f, 3, 4);
    Cachorro cachorro = new Cachorro(10.5f, 5, 4);

    mamifero.emitirSom();
    lobo.emitirSom();
    cachorro.emitirSom();
    System.out.println();
    cachorro.reagir("Olá");
    cachorro.reagir("aaaaa");
    cachorro.reagir(11, 45);
    cachorro.reagir(21, 00);
    cachorro.reagir(false);
    cachorro.reagir(2, 12.5f);
    cachorro.reagir(17, 4.5f);
  }
}

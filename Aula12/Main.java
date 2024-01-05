package Aula12;

public class Main {
  public static void main(String[] args) {
    // Animal animal = new Animal() //não pode, classe abstrata
    Mamifero mamifero = new Mamifero(25.5f, 4, 4);
    Reptil reptil = new Reptil(25.5f, 4, 4);
    Peixe peixe = new Peixe(25.5f, 4, 4);
    Ave ave = new Ave(25.5f, 4, 4);
    Canguru canguru = new Canguru(25.5f, 4, 4);
    Cachorro cachorro = new Cachorro(25.5f, 4, 4);
    Cobra cobra = new Cobra(25.5f, 4, 4);
    Tartaruga tartaruga = new Tartaruga(25.5f, 4, 4);
    GoldFish goldFish = new GoldFish(25.5f, 4, 3);
    Arara arara = new Arara(25.5f, 4, 2);

    mamifero.locomover();
    reptil.locomover();
    peixe.locomover();
    ave.locomover();
    canguru.locomover();
    cachorro.locomover();
    cobra.locomover();
    tartaruga.locomover();
    goldFish.locomover();
    arara.locomover();

  }
}

package Aula13;

public class Cachorro extends Lobo {

  public void reagir(String frase) {
    if (frase.equals("toma comida") || frase.equals("Olá")) {
      System.out.println("Abanar e Latir");
    } else {
      System.out.println("Rosnar");
    }
  }

  public void reagir(int hora, int minuto) {
    if (hora < 12) {
      System.out.println("Abanar");
    } else if (hora >= 18) {
      System.out.println("Ignorar");
    } else {
      System.out.println("Rosnar e latir");
    }
  }

  public void reagir(boolean dono) {
    if (dono) {
      System.out.println("Abanar");
    } else {
      System.out.println("Rosnar e latir");
    }
  }

  public void reagir(int idade, float peso) {
    if (idade < 5) {
      if (peso < 10) {
        System.out.println("Abanar");
      } else {
        System.out.println("Latir");
      }
    } else {
      if (peso < 10) {
        System.out.println("Rosnar");
      } else {
        System.out.println("Ignorar");
      }
    }
  }

  @Override
  public void emitirSom() {
    System.out.println("AU AU AU");
  }

  public Cachorro(float peso, int idade, int membros) {
    super(peso, idade, membros);
  }

}

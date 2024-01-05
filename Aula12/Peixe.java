package Aula12;

public class Peixe extends Animal {
  public Peixe(float peso, int idade, int membros) {
    super(peso, idade, membros);
  }

  private String corEscama;

  @Override
  public void locomover() {
    System.out.println("Peixe Nadando");
  }

  @Override
  public void alimentar() {
    System.out.println("Peixe se alimentando");
  }

  @Override
  public void emitirSom() {
    System.out.println("Peixe não emite som");
  }

  public void fazerBolha() {
    System.out.println("Fazendo uma bolha");
  }

  public void setCorEscama(String corEscama) {
    this.corEscama = corEscama;
  }

  public String getCorEscama() {
    return corEscama;
  }
}

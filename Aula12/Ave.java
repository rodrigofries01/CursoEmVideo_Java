package Aula12;

public class Ave extends Animal {
  public Ave(float peso, int idade, int membros) {
    super(peso, idade, membros);
  }

  private String corPena;

  @Override
  public void locomover() {
    System.out.println("Ave Voando");
  }

  @Override
  public void alimentar() {
    System.out.println("Ave se alimentando");
  }

  @Override
  public void emitirSom() {
    System.out.println("Ave emitindo som");
  }

  public void fazerNinho() {
    System.out.println("Fez um ninho");
  }

  public void setCorPena(String corPena) {
    this.corPena = corPena;
  }

  public String getCorPena() {
    return corPena;
  }

}

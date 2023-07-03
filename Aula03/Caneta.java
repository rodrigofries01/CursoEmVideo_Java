package Aula03;

public class Caneta {
  public String modelo;
  public String cor;
  private float ponta;
  protected int carga;
  private boolean tampada;

  void status() {
    System.out.println("Modelo: " + this.modelo);
    System.out.println("Uma caneta " + this.cor);
    System.out.println("Ponta: " + this.ponta);
    System.out.println("Carga: " + this.carga);
    System.out.println("Esta tampada? " + this.tampada);
  }

  public void rabiscar() {
    if (this.tampada) {
      System.out.println("Erro! A caneta esta tampada");
    } else {
      System.out.println("Estou rabiscando!");
    }
  }

  public void tampar() {
    this.tampada = true;
  }

  public void destampar() {
    this.tampada = false;
  }
}

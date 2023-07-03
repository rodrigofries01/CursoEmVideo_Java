package Aula02;

public class CanetaMain {
  public static void main(String[] args) {
    Caneta c1 = new Caneta();
    c1.modelo = "Bic";
    c1.cor = "Azul";
    c1.ponta = 0.5F;
    c1.carga = 100;
    c1.destampar();
    c1.status();
    c1.rabiscar();

    System.out.println();

    Caneta c2 = new Caneta();
    c2.modelo = "Faber Castell";
    c2.cor = "Preta";
    c2.ponta = 0.7f;
    c2.carga = 86;
    c2.tampar();
    c2.status();
    c2.rabiscar();
  }
}

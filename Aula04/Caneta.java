
public class Caneta {
  public String modelo, cor;
  private float ponta;
  private Boolean tampada;

  // public Caneta(String modelo, float ponta, boolean tampada, String cor) {
  // this.setModelo(modelo);
  // this.setPonta(ponta);
  // this.setTampada(tampada);
  // this.setCor(cor);
  // }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public float getPonta() {
    return ponta;
  }

  public void setPonta(float ponta) {
    this.ponta = ponta;
  }

  public Boolean getTampada() {
    return tampada;
  }

  public void setTampada(Boolean tampada) {
    this.tampada = tampada;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }
}

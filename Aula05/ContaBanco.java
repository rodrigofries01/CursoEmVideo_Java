package Aula05;

public class ContaBanco {

  public int numConta;
  protected String tipo;
  private String dono;
  private Double saldo;
  private Boolean status;

  public void abrirConta(String tipo) {
    setTipo(tipo);
    setStatus(true);
    if (tipo == "CC") {
      saldo = (double) 50;
    } else if (tipo == "CP") {
      saldo = (double) 150;
    }
  }

  public void fecharConta() {
    if (saldo > 0) {
      System.out.println("Conta com dinheiro");
    } else if (saldo < 0) {
      System.out.println("Conta em debito");
    } else {
      setStatus(false);
    }
  }

  public void depositar(Double valor) {
    if (getStatus()) {
      setSaldo(getSaldo() + valor);
    } else {
      System.out.println("Impossivel Depositar");
    }
  }

  public void sacar(Double valor) {
    if (status) {
      if (getSaldo() > valor) {
        setSaldo(getSaldo() - valor);
      } else {
        System.out.println("Saldo Insuficiente");
      }
    } else {
      System.out.println("Impossivel sacar");
    }
  }

  public void pagarMensal() {
    Double valor;
    if (getTipo() == "CC") {
      valor = (double) 12;
    } else if (getTipo() == "CP") {
      valor = (double) 20;
    }

    if (getStatus()) {
      if (getSaldo() > valor) {
        setSaldo(getSaldo() - valor);
      } else {
        System.out.println("Saldo Insuficiente");
      }
    } else {
      System.out.println("Impossivel pagar");
    }

  }

  public ContaBanco(int numConta, String tipo, String dono, Double saldo, Boolean status) {
    this.numConta = numConta;
    this.tipo = tipo;
    this.dono = dono;
    this.saldo = (double) 0;
    this.status = false;
  }

  public void setNumConta(int numConta) {
    this.numConta = numConta;
  }

  public int getNumConta() {
    return numConta;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getTipo() {
    return tipo;
  }

  public void setDono(String dono) {
    this.dono = dono;
  }

  public String getDono() {
    return dono;
  }

  public void setSaldo(Double saldo) {
    this.saldo = saldo;
  }

  public Double getSaldo() {
    return saldo;
  }

  public void setStatus(Boolean status) {
    this.status = status;
  }

  public Boolean getStatus() {
    return status;
  }

}

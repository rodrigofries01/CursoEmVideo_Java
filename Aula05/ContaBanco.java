package Aula05;

public class ContaBanco {

  public int numConta;
  protected String tipo;
  private String dono;
  private float saldo;
  private Boolean status;

  public void estadoAtual() {
    System.out.println("---------------------------");
    System.out.println("Numero da conta: " + this.getNumConta());
    System.out.println("Dono: " + this.getDono());
    System.out.println("Tipo: " + getTipo());
    System.out.println("Saldo: " + getSaldo());
    System.out.println("Status: " + getStatus());
  }

  public void abrirConta(String tipo) {
    setTipo(tipo);
    setStatus(true);
    if (tipo == "CC") {
      // saldo = (float) 50;
      this.setSaldo(50);
    } else if (tipo == "CP") {
      // saldo = (float) 150;
      this.setSaldo(150);
    }
  }

  public void fecharConta() {
    if (this.getSaldo() > 0) {
      System.out.println("Conta com dinheiro, impossivel fechar conta");
    } else if (this.getSaldo() < 0) {
      System.out.println("Conta em debito, impossivel fechar conta");
    } else {
      this.setStatus(false);
      System.out.println("Conta encerrada com sucesso");
    }
  }

  public void depositar(float valor) {
    if (this.getStatus()) {
      // this.saldo = this.saldo + valor;
      this.setSaldo(this.getSaldo() + valor);
      System.out.println("Deposito realizado com sucesso ");
    } else {
      System.out.println("Impossivel Depositar, crie uma conta");
    }
  }

  public void sacar(float valor) {
    if (this.getStatus()) {
      if (this.getSaldo() >= valor) {
        this.setSaldo(this.getSaldo() - valor);
        System.out.println("Saque realizado com sucesso ");
      } else {
        System.out.println("Saldo Insuficiente");
      }
    } else {
      System.out.println("Impossivel sacar");
    }
  }

  public void pagarMensal() {
    int valor = 0;
    if (this.getTipo() == "CC") {
      valor = 12;
    } else if (this.getTipo() == "CP") {
      valor = 20;
    }

    if (this.getStatus()) {
      if (this.getSaldo() > valor) {
        this.setSaldo(this.getSaldo() - valor);
      } else {
        System.out.println("Saldo Insuficiente");
      }
    } else {
      System.out.println("Impossivel pagar");
    }

  }

  public ContaBanco() {
    this.saldo = (float) 0;
    this.status = false;
  }

  public void setNumConta(int numConta) {
    this.numConta = numConta;
  }

  public int getNumConta() {
    return this.numConta;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getTipo() {
    return this.tipo;
  }

  public void setDono(String dono) {
    this.dono = dono;
  }

  public String getDono() {
    return this.dono;
  }

  public void setSaldo(float f) {
    this.saldo = f;
  }

  public float getSaldo() {
    return this.saldo;
  }

  public void setStatus(Boolean status) {
    this.status = status;
  }

  public Boolean getStatus() {
    return this.status;
  }
}

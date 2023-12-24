package Aula05;

public class ContaBancoMain {
  public static void main(String[] args) {
    ContaBanco pessoa1 = new ContaBanco();
    pessoa1.setNumConta(0001);
    pessoa1.setDono("Otis");

    ContaBanco pessoa2 = new ContaBanco();
    pessoa2.setNumConta(0002);
    pessoa2.setDono("Filomena");

    pessoa1.abrirConta("CC");
    pessoa1.depositar(200);
    pessoa1.sacar(25);
    pessoa1.pagarMensal();
    pessoa1.fecharConta();

    pessoa2.abrirConta("CP");
    pessoa2.depositar(150);
    pessoa2.sacar(300);
    // pessoa2.pagarMensal();
    pessoa2.fecharConta();

    pessoa1.estadoAtual();
    pessoa2.estadoAtual();

  }
}

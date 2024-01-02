package Aula07;

import java.util.Random;

public class Luta {
  private Lutador desafiado;
  private Lutador desafiante;
  private int rounds;
  private boolean aprovada;

  public void marcarLuta(Lutador lutador1, Lutador lutador2) {
    if ((lutador1.getCategoria() == lutador2.getCategoria()) && (lutador1 != lutador2)) {
      setAprovada(true);
      setDesafiado(lutador1);
      setDesafiante(lutador2);
    } else {
      setAprovada(false);
      setDesafiado(null);
      setDesafiante(null);
    }
  }

  public void lutar() {
    if (this.getAprovada()) {
      System.out.println("### DESAFIADO ###");
      getDesafiado().apresentar();
      System.out.println("### DESAFIANTE ###");
      getDesafiante().apresentar();
      Random aleatorio = new Random();
      int vencedor = aleatorio.nextInt(3);
      System.out.println("### RESULTADO ###");

      switch (vencedor) {
        case 0:
          System.out.println("=====EMPATE=====");
          getDesafiado().empatarLuta();
          getDesafiante().empatarLuta();
          break;
        case 1:
          System.out.println("=====VITORIA DO " + getDesafiado().getNome() + "======");
          getDesafiado().ganharLuta();
          getDesafiante().perderLuta();
          break;
        case 2:
          System.out.println("=====VITORIA DO " + getDesafiante().getNome() + "=====");
          getDesafiado().perderLuta();
          getDesafiante().ganharLuta();
          break;
      }
      System.out.println("===============================");
    }
  }

  public void setDesafiado(Lutador desafiado) {
    this.desafiado = desafiado;
  }

  public Lutador getDesafiado() {
    return this.desafiado;
  }

  public void setDesafiante(Lutador desafiante) {
    this.desafiante = desafiante;
  }

  public Lutador getDesafiante() {
    return this.desafiante;
  }

  public void setRounds(int rounds) {
    this.rounds = rounds;
  }

  public int getRounds() {
    return this.rounds;
  }

  public void setAprovada(boolean aprovada) {
    this.aprovada = aprovada;
  }

  public boolean getAprovada() {
    return this.aprovada;
  }
}

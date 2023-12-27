package Aula07;

public class Luta {
  private Lutador desafiado;
  private Lutador desafiante;
  private int rounds;
  private boolean aprovada;

  public void marcarLuta() {
  }

  public void lutar() {

  }

  public Luta(Lutador desafiado, Lutador desafiante, int rounds, boolean aprovada) {
    setDesafiado(desafiado);
    setDesafiante(desafiante);
    setRounds(rounds);
    setAprovada(aprovada);
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

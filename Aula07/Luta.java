package Aula07;

public class Luta {
  private String desafiado;
  private String desafiante;
  private int rounds;
  private boolean aprovada;

  public void marcarLuta() {
  }

  public void lutar() {

  }

  public Luta(String desafiado, String desafiante, int rounds, boolean aprovada) {
    setDesafiado(desafiado);
    setDesafiante(desafiante);
    setRounds(rounds);
    setAprovada(aprovada);
  }

  public void setDesafiado(String desafiado) {
    this.desafiado = desafiado;
  }

  public String getDesafiado() {
    return this.desafiado;
  }

  public void setDesafiante(String desafiante) {
    this.desafiante = desafiante;
  }

  public String getDesafiante() {
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

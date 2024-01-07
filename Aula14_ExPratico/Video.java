package Aula14_ExPratico;

public class Video implements AcoesVideo {
  private String titulo;
  private int avaliacao;
  private int views;
  private int curtidas;
  private boolean reproduzindo;

  @Override
  public void play() {
    if (!reproduzindo) {
      setReproduzindo(true);
      System.out.println("Play, Esta reproduzindo");
    } else {
      setReproduzindo(false);
      System.out.println("Pause, video pausado");
    }
  }

  @Override
  public void pause() {
    if (reproduzindo) {
      setReproduzindo(false);
      System.out.println("Pause, video pausado");
    } else {
      setReproduzindo(true);
      System.out.println("Play, Esta reproduzindo");
    }
  }

  @Override
  public void like() {
    setCurtidas(getCurtidas() + 1);
    System.out.println("Video curtido");
  }

  public Video(String titulo) {
    setTitulo(titulo);
    setViews(0);
    setCurtidas(0);
    setReproduzindo(false);
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public int getAvaliacao() {
    return avaliacao;
  }

  public void setAvaliacao(int avaliacao) {
    int novaAv = 0;
    novaAv = (int) ((this.avaliacao + avaliacao) / this.views);
    this.avaliacao = novaAv;
  }

  public int getViews() {
    return views;
  }

  public void setViews(int views) {
    this.views = views;
  }

  public int getCurtidas() {
    return curtidas;
  }

  public void setCurtidas(int curtidas) {
    this.curtidas = curtidas;
  }

  public boolean isReproduzindo() {
    return reproduzindo;
  }

  public void setReproduzindo(boolean reproduzindo) {
    this.reproduzindo = reproduzindo;
  }

  @Override
  public String toString() {
    return "Video [titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas
        + ", reproduzindo=" + reproduzindo + "]";
  }

}

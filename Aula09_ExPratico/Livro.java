package Aula09_ExPratico;

public class Livro implements Publicacao {
  private String titulo, autor;
  private int totalPag, pagAtual;
  private boolean aberto;
  private Pessoa leitor;

  public void detalhes() {
    if (getAberto()) {
      System.out.println("O leitor " + getLeitor().getNome());
      System.out.println("Ele tem " + getLeitor().getIdade() + " de idade");
      System.out.println("Esta lendo o livro " + getTitulo());
      System.out.println("Escrito por " + getAutor());
      System.out.println("O livro tem " + getTotalPag());
      System.out.println("E ele esta na pagina " + getPagAtual());
    } else {
      System.out.println("O livro esta fechado");
    }
  }

  @Override
  public void abrir() {
    if (!this.getAberto()) {
      System.out.println("Livro aberto");
      this.setAberto(true);
    } else {
      System.out.println("O livro ja esta aberto");
    }
  }

  @Override
  public void fechar() {
    if (this.getAberto()) {
      this.setAberto(false);
      System.out.println("Livro fechado");
    } else {
      System.out.println("O livro ja esta fechado");
    }
  }

  @Override
  public void folhear() {
    int pagina = 0;
    if (this.getAberto()) {
      while (pagina < this.getPagAtual()) {
        pagina++;
        System.out.println("Voce esta na pagina " + getPagAtual());
        break;
      }
      while (pagina > this.getPagAtual()) {
        pagina--;
        System.out.println("Voce esta na pagina " + getPagAtual());
        break;
      }
    } else {
      System.out.println("O livro esta fechado");
    }
  }

  @Override
  public void avancarPag() {
    this.setPagAtual(this.getPagAtual() + 1);
  }

  @Override
  public void voltarPag() {
    this.setPagAtual(this.getPagAtual() - 1);
  }

  public Livro(String titulo, String autor, int totalPag, int pagAtual, boolean aberto, Pessoa leitor) {
    this.setTitulo(titulo);
    this.setAutor(autor);
    this.setTotalPag(totalPag);
    this.setPagAtual(pagAtual);
    this.setAberto(aberto);
    this.setLeitor(leitor);
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getTitulo() {
    return this.titulo;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getAutor() {
    return this.autor;
  }

  public void setTotalPag(int totalPag) {
    this.totalPag = totalPag;
  }

  public int getTotalPag() {
    return this.totalPag;
  }

  public void setPagAtual(int pagAtual) {
    this.pagAtual = pagAtual;
  }

  public int getPagAtual() {
    return this.pagAtual;
  }

  public void setAberto(boolean aberto) {
    this.aberto = aberto;
  }

  public boolean getAberto() {
    return this.aberto;
  }

  public void setLeitor(Pessoa leitor) {
    this.leitor = leitor;
  }

  public Pessoa getLeitor() {
    return this.leitor;
  }
}

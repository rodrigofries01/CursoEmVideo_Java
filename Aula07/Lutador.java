package Aula07;

public class Lutador {
  private String nome, nacionalidade, categoria;
  private float altura, peso;
  private int idade, vitorias, derrotas, empates;

  public void apresentar() {
    System.out.println("Lutador: " + this.getNome());
    System.out.println("Origem: " + this.getNacionalidade());
    System.out.println("Idade: " + this.getIdade());
    System.out.println("Altura: " + this.getAltura() + " M de altura");
    System.out.println("Peso: " + this.getPeso() + " Kg");
    System.out.println("Ganhou: " + this.getVitorias());
    System.out.println("Perdeu: " + this.getDerrotas());
    System.out.println("Empatou: " + this.getEmpates());
  }

  public void status() {
    System.out.println("==============================");
    System.out.print(this.getNome());
    System.out.println(" é um peso " + this.getCategoria());
    System.out.println(this.getVitorias() + " Vitórias");
    System.out.println(this.getDerrotas() + " Derrotas");
    System.out.println(this.getEmpates() + " Empates");
  }

  public void ganharLuta() {
    this.setVitorias(this.getVitorias() + 1);
  }

  public void perderLuta() {
    this.setDerrotas(this.getDerrotas() + 1);
  }

  public void empatarLuta() {
    this.setEmpates(this.getEmpates() + 1);
  }

  public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias,
      int derrotas, int empates) {
    this.setNome(nome);
    this.setNacionalidade(nacionalidade);
    this.setIdade(idade);
    this.setAltura(altura);
    this.setPeso(peso);
    this.setVitorias(vitorias);
    this.setDerrotas(derrotas);
    this.setEmpates(empates);
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
  }

  public String getNacionalidade() {
    return this.nacionalidade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public int getIdade() {
    return this.idade;
  }

  public void setAltura(float altura) {
    this.altura = altura;
  }

  public float getAltura() {
    return this.altura;
  }

  public void setPeso(float peso) {
    this.peso = peso;
    this.setCategoria();
  }

  public float getPeso() {
    return this.peso;
  }

  private void setCategoria() {
    if (this.peso < 52.2) {
      this.categoria = "Invalido";
    } else if (this.peso <= 70.3) {
      this.categoria = "Leve";
    } else if (this.peso <= 83.9) {
      this.categoria = "Medio";
    } else if (this.peso <= 120.2) {
      this.categoria = "Pesado";
    } else {
      this.categoria = "Invalido";
    }
  }

  public String getCategoria() {
    return this.categoria;
  }

  public void setVitorias(int vitorias) {
    this.vitorias = vitorias;
  }

  public int getVitorias() {
    return this.vitorias;
  }

  public void setDerrotas(int derrotas) {
    this.derrotas = derrotas;
  }

  public int getDerrotas() {
    return this.derrotas;
  }

  public void setEmpates(int empates) {
    this.empates = empates;
  }

  public int getEmpates() {
    return this.empates;
  }
}

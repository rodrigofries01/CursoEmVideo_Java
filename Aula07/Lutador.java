package Aula07;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public void apresentar() {
    }

    public void status() {
    }

    public void ganharLuta() {
    }

    public void perderLuta() {
    }

    public void empatarLuta() {
    }

    public Lutador(String nome, String nacionalidade, int idade, float peso, String categoria, int vitorias,
            int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.peso = peso;
        this.categoria = categoria;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
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

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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

package Aula10;

public class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    public void cancelarMatricula() {
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }
}

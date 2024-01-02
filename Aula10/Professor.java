package Aula10;

public class Professor extends Pessoa {
    private String especialidade;
    private float salario;

    public void receberAumento() {

    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }
}

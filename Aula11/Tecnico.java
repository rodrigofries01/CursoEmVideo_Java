package Aula11;

public class Tecnico extends Aluno {
  private String registroProfissional;

  public void praticar() {
    System.out.println("O aluno " + getNome() + " esta Praticando ");
  }

  public void setRegistroProfissional(String registroProfissional) {
    this.registroProfissional = registroProfissional;
  }

  public String getRegistroProfissional() {
    return registroProfissional;
  }
}

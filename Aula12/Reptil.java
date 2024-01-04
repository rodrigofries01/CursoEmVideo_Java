package Aula12;

public class Reptil extends Animal {
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Reptil Se alimentando ");
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitindo som de reptil");
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    public String getCorEscama() {
        return corEscama;
    }
}

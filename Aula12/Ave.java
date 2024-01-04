package Aula12;

public class Ave extends Animal {
    private String corPena;

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Ave se alimentando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Ave emitindo som");
    }

    public void fazerNinho() {
        System.out.println("Ave fazendo ninho");
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    public String getCorPena() {
        return corPena;
    }
}

package Aula12;

public class Main {
    public static void main(String[] args) {
        // Animal animal = new Animal(); //não pode ser instanciado
        Mamifero mamifero = new Mamifero();
        Reptil reptil = new Reptil();
        Peixe peixe = new Peixe();
        Ave ave = new Ave();

        mamifero.setPeso(12.4f);
        mamifero.setIdade(2);
        mamifero.setMembros(4);
        System.out.println(mamifero.toString());
        mamifero.locomover();
        mamifero.alimentar();
        mamifero.emitirSom();

        System.out.println("");

        reptil.setPeso(12.4f);
        reptil.setIdade(2);
        reptil.setMembros(4);
        System.out.println(reptil.toString());
        reptil.locomover();
        reptil.alimentar();
        reptil.emitirSom();

        System.out.println("");

        ave.setPeso(12.4f);
        ave.setIdade(2);
        ave.setMembros(4);
        System.out.println(ave.toString());
        ave.locomover();
        ave.alimentar();
        ave.emitirSom();
        ave.fazerNinho();

        System.out.println("");

        peixe.setPeso(12.4f);
        peixe.setIdade(2);
        peixe.setMembros(4);
        System.out.println(peixe.toString());
        peixe.locomover();
        peixe.alimentar();
        peixe.emitirSom();
        peixe.soltarBolhas();
    }
}

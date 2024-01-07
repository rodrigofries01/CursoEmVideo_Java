package Aula14_ExPratico;

public class Main {
  public static void main(String[] args) {
    Video videos[] = new Video[3];
    Gafanhoto gafanhoto = new Gafanhoto("Otis", 6, "M", "Otinho123");

    videos[0] = new Video("Java - aula 1");
    videos[1] = new Video("Java - aula 2");
    videos[2] = new Video("Java - aula 3");

    Visualizacao visualizacao = new Visualizacao(gafanhoto, videos[0]);
    // videos[0].play();
    // videos[1].play();
    // videos[2].play();
    // videos[0].like();
    // videos[1].like();
    System.out.println();
    System.out.println(videos[0].toString());
    visualizacao.avaliar(87.4f);
    System.out.println(visualizacao.toString());
    System.out.println();
    System.out.println(videos[0].toString());
    System.out.println(visualizacao.toString());

  }
}

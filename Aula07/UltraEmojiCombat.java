package Aula07;

public class UltraEmojiCombat {
  public static void main(String[] args) {
    Lutador lutador[] = new Lutador[6];

    lutador[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 3, 1);
    lutador[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.9f, 14, 2, 3);
    lutador[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 79.9f, 12, 2, 1);
    lutador[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
    lutador[4] = new Lutador("UFOCobol", "Brasil", 37, 1.93f, 119.3f, 5, 4, 3);
    lutador[5] = new Lutador("Nerdaart", "EUA", 30, 1.81f, 105.9f, 12, 2, 4);

    lutador[1].ganharLuta();
    lutador[1].apresentar();
    lutador[1].status();
  }
}

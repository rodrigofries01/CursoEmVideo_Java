public class Vetores {
  public static void main(String[] args) {
//    int num[] = new int[4];
//    num[0] = 3;
//    num[1] = 5;
//    num[2] = 8;
//    num[3] = 2;

//    OU

    int num[] = {3, 2, 8, 7, 5, 4};

    System.out.println("Total de casas de num " + num.length);
    for (int cont = 0; cont <= num.length - 1; cont++) {
      System.out.println(cont + " = " + num[cont]);
    }
  }
}

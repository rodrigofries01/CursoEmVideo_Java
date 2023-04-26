public class Metodos {

//  static void soma(int a, int b) {
//    int s = a + b;
//    System.out.println("A soma é " + s);
//  } METODO SEM RETORNO

  static int soma(int a, int b) {
    int s = a + b;
    return s;
  }

  public static void main(String[] args) {
    System.out.println("Começa aqui!");
    int sm = soma(5, 2);
    System.out.println("A soma é " + sm);

//    soma(5, 2);

  }
}

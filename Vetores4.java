import java.util.Arrays;

public class Vetores4 {
  public static <mes> void main(String[] args) {
    int vet[] = {3, 7, 6, 1, 9, 4, 2};
    for (int val : vet) {
      System.out.print(val + " ");
    }
    System.out.println();
    int pos = Arrays.binarySearch(vet, 8);
    System.out.println("Encontrei o valor na posicao " + pos);
  }
}

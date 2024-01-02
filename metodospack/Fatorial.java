package metodospack;

public class Fatorial {
  private int num = 0;
  private int fat = 1;
  private String formula = " ";

  public void setValor(int n) {
    num = n;
    int f = 1;
    String S = " ";
    for (int c = n; c > 1; c--) {
      f *= c;
      S += c + " x ";
    }
    S += "1 = ";
    fat = f;
    formula = S;
  }

  public void setNum(int num) {
    this.num = num;
  }

  public int getNum() {
    return this.num;
  }

  public int getFatorial() {
    return fat;
  }

  public String getFormula() {
    return formula;
  }
}

public class DriverC {
  public static void main(String[] args) {
    String[] equations = {"10 2 +", "-18 2 +"};
    for (int i = 0; i < equations.length; i++) {
      System.out.println(equations[i] + ": " + Calculator.eval(equations[i]));
    }
  }
}

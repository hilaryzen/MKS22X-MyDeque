public class Calculator {
  /*Evaluate a postfix expression stored in s.
   *Assume valid postfix notation, separated by spaces.
  */
  public static double eval(String s){
    String[] args = s.split(" ");
    for (int i = 0; i < args.length; i++) {
      System.out.println(args[i]);
    }
    return 0.0;
  }
}

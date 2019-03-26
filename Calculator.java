public class Calculator {
  /*Evaluate a postfix expression stored in s.
   *Assume valid postfix notation, separated by spaces.
  */
  public static double eval(String s){
    String[] args = s.split(" ");
    MyDeque<Integer> values = new MyDeque<Integer>();

    for (int i = 0; i < args.length; i++) {
      try {
        values.addLast(Integer.parseInt(args[i]));
        System.out.println(values);
      } catch (NumberFormatException e) {

      }
    }

    return 0.0;
  }
}

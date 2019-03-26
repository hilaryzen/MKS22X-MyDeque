public class Calculator {
  /*Evaluate a postfix expression stored in s.
   *Assume valid postfix notation, separated by spaces.
  */
  public static double eval(String s){
    String[] args = s.split(" ");
    MyDeque<Double> values = new MyDeque<Double>();

    for (int i = 0; i < args.length; i++) {
      try {
        values.addLast(Double.parseDouble(args[i]));
        //System.out.println(values);
      } catch (NumberFormatException e) {
        if (args[i].equals("+")) {
          add(values);
        } else if (args[i].equals("-")) {
          subtract(values);
        }
      }
      System.out.println(values);
    }
    System.out.println(values);

    return 0.0;
  }

  public static void add(MyDeque<Double> values) {
    Double i = values.getLast();
    values.removeLast();
    Double j = values.getLast();
    values.removeLast();
    values.addLast(i + j);
  }

  public static void subtract(MyDeque<Double> values) {
    Double i = values.getLast();
    values.removeLast();
    Double j = values.getLast();
    values.removeLast();
    values.addLast(j - i);
  }
}

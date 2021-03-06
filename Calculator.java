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
        } else if (args[i].equals("*")) {
          multiply(values);
        } else if (args[i].equals("/")) {
          divide(values);
        } else if (args[i].equals("%")) {
          mod(values);
        }
      }
      //System.out.println(values);
    }
    //System.out.println(values);

    return values.getLast();
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
    //System.out.println(values);
    Double j = values.getLast();
    values.removeLast();
    //System.out.println(values);
    values.addLast(j - i);
  }

  public static void multiply(MyDeque<Double> values) {
    Double i = values.getLast();
    values.removeLast();
    Double j = values.getLast();
    values.removeLast();
    values.addLast(i * j);
  }

  public static void divide(MyDeque<Double> values) {
    Double i = values.getLast();
    values.removeLast();
    Double j = values.getLast();
    values.removeLast();
    values.addLast(j / i);
  }

  public static void mod(MyDeque<Double> values) {
    Double i = values.getLast();
    values.removeLast();
    Double j = values.getLast();
    values.removeLast();
    values.addLast(j % i);
  }
}

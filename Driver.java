public class Driver {
  public static void main(String[] args) {
    MyDeque<String> data = new MyDeque<String>();
    System.out.println(data.toString());
    System.out.println("Size: " + data.size());

    System.out.println(" ");
    data.addLast("Hi");
    System.out.println(data.toString());
    System.out.println("Size: " + data.size());

    System.out.println(" ");
    data.addLast("Bye");
    System.out.println(data.toString());
    System.out.println("Size: " + data.size());
  }
}

public class Driver {
  public static void main(String[] args) {
    MyDeque<String> data = new MyDeque<String>(5);
    System.out.println(data);
    System.out.println("Size: " + data.size());
    //data.getFirst();

    System.out.println(" ");
    data.addLast("A");
    System.out.println(data);
    System.out.println("Size: " + data.size());

    System.out.println(" ");
    data.addLast("B");
    System.out.println(data);
    System.out.println("Size: " + data.size());
    System.out.println("First element: " + data.getFirst());
    System.out.println("Last element: " + data.getLast());

    System.out.println(" ");
    data.addFirst("C");
    System.out.println(data);
    System.out.println("Size: " + data.size());
    System.out.println("First element: " + data.getFirst());

    /*
    //Testing resize
    System.out.println(" ");
    data.resize(2);
    System.out.println(data);
    System.out.println("Last element: " + data.getLast());
    */
  }
}

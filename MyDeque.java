public class MyDeque<E> {
  private E[] data;
  private int size, start, end;

  @SuppressWarnings("unchecked")
  //Creates an array of size 10
  public MyDeque() {
    data = (E[])new Object[10];
    size = 0;
    start = 0;
    end = 0;
  }

  //Creates an array with the given parameter
  public MyDeque(int initialCapacity) {
    data = (E[])new Object[initialCapacity];
    size = 0;
    start = 0;
    end = 0;
  }

  public String toString() {
    String ans = "{";
    for (int i = 0; i < size; i++) {
      ans = ans + data[start + i] + " ";
    }
    return ans + "}";
  }
}

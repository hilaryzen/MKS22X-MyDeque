import java.util.*;

public class MyDeque<E> {
  public E[] data;
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

  //Returns number of elements in the array
  public int size() {
    return size;
  }

  public String toString() {
    String ans = "{";
    for (int i = 0; i < size; i++) {
      ans = ans + data[start + i] + " ";
    }
    return ans + "}";
  }

  public E getFirst() {
    if (size == 0) {
      throw new NoSuchElementException();
    }
    return data[start];
  }

  public void addLast(E element) {
    if (size > 0) {
      end++;
    }
    data[end] = element;
    size++;
  }
}

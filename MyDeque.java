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
      ans = ans + data[(start + i) % data.length] + " ";
    }
    return ans + "}";
  }

  //Returns first element
  public E getFirst() {
    if (size == 0) {
      throw new NoSuchElementException();
    }
    return data[start];
  }

  //Returns last element
  public E getLast() {
    if (size == 0) {
      throw new NoSuchElementException();
    }
    return data[end];
  }

  public void addFirst(E element) {
    if (size > 0) {
      if (start == 0) {
        if (end == data.length - 1) { //If array is full
          //resize
        } else {
          start = data.length - 1; //Start loops back to the end
        }
      } else {
        start--;
      }
    }
    data[start] = element;
    size++;
  }

  public void addLast(E element) {
    if (size > 0) {
      end++;
    }
    data[end] = element;
    size++;
  }
}

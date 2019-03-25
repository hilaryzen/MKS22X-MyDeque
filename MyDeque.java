import java.util.*;

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

  //Doubles size of data and copies over values
  private void resize(int begin) {
    E[] copy = (E[])new Object[data.length * 2];
    for (int i = 0; i < size; i++) {
      copy[begin + i] = data[(start + i) % data.length];
    }
    data = copy;
    start = begin;
    end = start + size - 1;
  }

  public void addFirst(E element) {
    if (size > 0) {
      if (size == data.length) { //If array is full
        resize(1);
        start--;
      } else if (start == 0) {
        start = data.length - 1; //Loops around to the end
      } else {
        start--;
      }
    }
    data[start] = element;
    size++;
  }

  public void addLast(E element) {
    if (size > 0) {
      if (size == data.length) { //If array is full, resize
        resize(0);
        end++;
      } else if (end == data.length - 1) {
        end = 0; //Loops around to the front
      } else {
        end++; //Moves end forward
      }
    }
    data[end] = element;
    size++;
  }
}

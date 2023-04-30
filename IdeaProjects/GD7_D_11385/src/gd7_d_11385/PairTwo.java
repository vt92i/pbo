package gd7_d_11385;

public class PairTwo<T, V> {
  private final T value1;
  private final V value2;

  public PairTwo(T value1, V value2) {
    this.value1 = value1;
    this.value2 = value2;
  }

  public T getValue1() {
    return value1;
  }

  public V getValue2() {
    return value2;
  }
}

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    String[] name = "Anjolie".split("");
    System.out.println("Bubble Sort:");
    bubbleSort(name);

    System.out.println();

    System.out.println("Selection Sort:");
    selectionSort(name);
  }

  private static void bubbleSort(String[] arr) {
    int n = arr.length;
    System.out.println(Arrays.toString(arr) + " -> Initial");
    for (int i = 0; i < n; i++) {
      for (int j = 1; j < (n - i); j++) {
        if (arr[j - 1].compareTo(arr[j]) > 0) {
          System.out.print(Arrays.toString(arr) + " -> Swapping " + arr[j - 1] + " and " + arr[j] + " -> ");
          String temp = arr[j - 1];
          arr[j - 1] = arr[j];
          arr[j] = temp;
          System.out.println(Arrays.toString(arr));
        } else System.out.println(Arrays.toString(arr) + " -> Not Swapping " + arr[j - 1] + " and " + arr[j]);
      }
    }
    System.out.println(Arrays.toString(arr) + " -> Sorted");
  }

  private static void selectionSort(String[] arr) {
    int n = arr.length;
    System.out.println(Arrays.toString(arr) + " -> Initial");
    for (int i = 0; i < n - 1; i++) {
      int min = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[j].compareTo(arr[min]) < 0) {
          min = j;
        }
      }
      if (min != i) {
        System.out.print(Arrays.toString(arr) + " -> Swapping " + arr[i] + " and " + arr[min] + " -> ");
        String temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
        System.out.println(Arrays.toString(arr));
      } else System.out.println(Arrays.toString(arr) + " -> Not Swapping " + arr[i] + " and " + arr[min]);
    }
    System.out.println(Arrays.toString(arr) + " -> Sorted");
  }
}

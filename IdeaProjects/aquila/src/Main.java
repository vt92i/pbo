import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
//    knapsackProblem();
    insertionSort();
    selectionSort();
    travellingSalesmanProblem();
  }

  public static void knapsackProblem() {
    String[] items = {"A1", "A2", "A3", "A4"};
    int[] values = {12, 10, 18, 20};
    int[] weights = {20, 25, 9, 15};
    int capacity = 30;

    int[][] matrix = new int[values.length + 1][capacity + 1];

    for (int i = 1; i < matrix.length; i++) {
      for (int j = 1; j < matrix[i].length; j++) {
        if (weights[i - 1] <= j) {
          matrix[i][j] = Math.max(matrix[i - 1][j], values[i - 1] + matrix[i - 1][j - weights[i - 1]]);
        } else {
          matrix[i][j] = matrix[i - 1][j];
        }
      }
    }

    int i = values.length;
    int j = capacity;
    while (i > 0 && j > 0) {
      if (matrix[i][j] != matrix[i - 1][j]) {
        System.out.println("Value (profit)\t: " + values[i - 1] + "\t | \tWeight (kg)\t\t: " + weights[i - 1] + " | Item : " + items[i - 1]);
        j -= weights[i - 1];
      }
      i--;
    }
    System.out.println("Total profit\t: " + matrix[values.length][capacity] + "\t | \tTotal weight\t: " + (capacity - j));
  }

  public static void insertionSort() {
    String str = "Anjolie";
    char[] chars = str.toCharArray();
    System.out.println(Arrays.toString(chars) + " | Initial");
    for (int i = 1; i < chars.length; i++) {
      char temp = chars[i];
      int j = i - 1;
      while (j >= 0 && chars[j] > temp) {
        chars[j + 1] = chars[j];
        System.out.println(Arrays.toString(chars) + " | Place marker at " + j + " and move " + chars[j] + " to " + (j + 1) + "");
        j--;
      }
      chars[j + 1] = temp;
    }
    System.out.println(Arrays.toString(chars) + " | Final");
  }

  public static void selectionSort() {
    String str = "Anjolie";
    char[] chars = str.toCharArray();
    System.out.println(Arrays.toString(chars) + " | Initial");
    for (int i = 0; i < chars.length - 1; i++) {
      int minIndex = i;
      for (int j = i + 1; j < chars.length; j++) {
        if (chars[j] < chars[minIndex]) {
          minIndex = j;
        }
      }
      char temp = chars[minIndex];
      chars[minIndex] = chars[i];
      chars[i] = temp;
      System.out.println(Arrays.toString(chars) + " | Swap " + chars[minIndex] + " with " + chars[i]);
    }
    System.out.println(Arrays.toString(chars) + " | Final");
  }

  public static void travellingSalesmanProblem() {
    TSPBruteForce tsp = new TSPBruteForce(
            new int[][]{
                    {0, 4, 0, 6, 0, 9, 0},
                    {4, 0, 8, 0, 0, 5, 0},
                    {0, 8, 0, 0, 10, 5, 4},
                    {6, 0, 0, 0, 6, 3, 0},
                    {0, 0, 10, 6, 0, 6, 7},
                    {9, 5, 5, 3, 6, 0, 5},
                    {0, 0, 4, 0, 7, 5, 0}
            }
    );

    System.out.println("[ Adjacency List ]");
    tsp.printAdjacencyList();

    System.out.println();

    System.out.println("[ TSP BruteForce (20 iterations) ]");
    tsp.printTSPBruteForce(20);
  }
}



import java.util.*;

public class TSPBruteForce {
  private final int[][] distance;
  private final int numCities;

  public TSPBruteForce(int[][] distance) {
    this.distance = distance;
    this.numCities = distance.length;
  }

  public void printTSPBruteForce(int numOfIterations) {
    List<Integer> shortestPath = null;
    int shortestDistance = Integer.MAX_VALUE;

    List<Integer> cities = new ArrayList<>();
    for (int i = 0; i < numCities; i++) {
      cities.add(i);
    }

    int iterations = 0;
    for (List<Integer> permutation : generatePermutations(cities)) {
      int distance = calculateDistance(permutation);
      if (distance < shortestDistance) {
        shortestDistance = distance;
      }
      iterations++;

      System.out.print("Iteration " + iterations + ": ");
      System.out.print(permutation);
      System.out.println(" | " + "Total distance: " + distance);

      if (iterations >= numOfIterations) {
        break;
      }
    }
  }

  private List<List<Integer>> generatePermutations(List<Integer> cities) {
    List<List<Integer>> permutations = new ArrayList<>();
    generatePermutationsHelper(cities, permutations, new ArrayList<>());
    return permutations;
  }

  private void generatePermutationsHelper(List<Integer> cities, List<List<Integer>> permutations, List<Integer> currentPermutation) {
    if (cities.isEmpty()) {
      permutations.add(currentPermutation);
      return;
    }

    for (int i = 0; i < cities.size(); i++) {
      int city = cities.get(i);
      List<Integer> remainingCities = new ArrayList<>(cities);
      remainingCities.remove(i);

      List<Integer> newPermutation = new ArrayList<>(currentPermutation);
      newPermutation.add(city);

      generatePermutationsHelper(remainingCities, permutations, newPermutation);
    }
  }

  public int calculateDistance(List<Integer> path) {
    int distance = 0;
    for (int i = 0; i < path.size() - 1; i++) {
      int fromCity = path.get(i);
      int toCity = path.get(i + 1);
      distance += this.distance[fromCity][toCity];
    }
    distance += this.distance[path.get(path.size() - 1)][path.get(0)];
    return distance;
  }

  public void printAdjacencyList() {
    for (int i = 0; i < numCities; i++) {
      System.out.print((i + 1) + ": ");
      for (int j = 0; j < numCities; j++) {
        if (distance[i][j] != 0) {
          System.out.print((j + 1) + "(" + distance[i][j] + ") ");
        }
      }
      System.out.println();
    }
  }

  public int getNumCities() {
    return numCities;
  }
}

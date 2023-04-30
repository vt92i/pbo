package Exception;

public class InputNegativeException extends Exception {
  public void showMessage() {
    System.out.println("Panjang atau Lebar tidak boleh negatif!");
  }
}

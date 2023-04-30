package Exception;

public class InvalidPanjangLebarException extends Exception {
  public void showMessage() {
    System.out.println("Panjang dan Lebar harus lebih besar dari 0!");
  }
}

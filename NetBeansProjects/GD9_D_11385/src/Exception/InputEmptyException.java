package Exception;

public class InputEmptyException extends Exception {

  public String getMessage() {
    return "Input tidak boleh kosong!";
  }
}

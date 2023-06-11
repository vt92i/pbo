package Exception;

public class InputEmptyException extends Exception {

  @Override
  public String getMessage() {
    return "Input tidak boleh kosong!";
  }
}

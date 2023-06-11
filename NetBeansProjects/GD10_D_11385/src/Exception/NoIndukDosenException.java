package Exception;

public class NoIndukDosenException extends Exception {

  @Override
  public String getMessage() {
    return "Nomor Induk Dosen harus terdiri dari 5 karakter!";
  }
}

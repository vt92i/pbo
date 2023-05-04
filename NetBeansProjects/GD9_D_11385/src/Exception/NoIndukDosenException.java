package Exception;

public class NoIndukDosenException extends Exception {

  public String getMessage() {
    return "Nomor Induk Dosen harus terdiri dari 5 karakter!";
  }
}

package Exception;

public class ExceptionNomor extends Exception {
  public void showMessageNovel() {
    System.out.println("[!] Nomor ISBN harus 13 digit [!]");
  }

  public void showMessageJurnal() {
    System.out.println("[!] Nomor ISSN harus 8 digit [!]");
  }
}

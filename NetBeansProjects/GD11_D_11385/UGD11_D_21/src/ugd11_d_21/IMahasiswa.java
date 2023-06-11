package ugd11_d_21;

public interface IMahasiswa {
  default void pinjamBuku() {
    System.out.println("Anda boleh meminjam buku.");
  }

  default void pinjamJurnal() {
    System.out.println("Anda boleh meminjam jurnal.");
  }

  default void pinjamMajalah() {
    System.out.println("Anda boleh meminjam majalah.");
  }

  void showMahasiswa();
}

package ugd11_d_21;

public interface IDosen {
  default void pinjamBuku() {
    System.out.println("Anda boleh meminjam buku.");
  }

  default void pinjamJurnal() {
    System.out.println("Anda boleh meminjam jurnal.");
  }

  void showDosen();
}

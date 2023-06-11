package ugd11_d_21;

public interface IPemustakaLuar {
  default void pinjamBuku() {
    System.out.println("Anda boleh meminjam buku.");
  }

  void showPemustakaLuar();
}

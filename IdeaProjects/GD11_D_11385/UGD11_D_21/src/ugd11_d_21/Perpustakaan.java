package ugd11_d_21;

import java.util.ArrayList;

public class Perpustakaan {
  private final ArrayList<Pengunjung> daftarPengunjung = new ArrayList<>();
  private final String namaPerpustakaan, alamatPerpustakaan;

  public Perpustakaan(String namaPerpustakaan, String alamatPerpustakaan) {
    this.namaPerpustakaan = namaPerpustakaan;
    this.alamatPerpustakaan = alamatPerpustakaan;
  }

  public void addPengunjung(Pengunjung p) {
    daftarPengunjung.add(p);
  }

  public void showPerpustakaan() {
    System.out.println("Nama Perpustakaan: " + namaPerpustakaan);
    System.out.println("Alamat Perpustakaan: " + alamatPerpustakaan);
  }

  public void showPengunjung() {
    for (Pengunjung pengunjung : daftarPengunjung) {
      switch (pengunjung.getClass().getSimpleName()) {
        case "Mahasiswa":
          System.out.println("[ PENGUNJUNG MAHASISWA ]");
          ((Mahasiswa) pengunjung).showMahasiswa();
          break;
        case "Dosen":
          System.out.println("[ PENGUNJUNG DOSEN ]");
          ((Dosen) pengunjung).showDosen();
          break;
        case "PemustakaLuar":
          System.out.println("[ PENGUNJUNG PEMUSTAKA LUAR ]");
          ((PemustakaLuar) pengunjung).showPemustakaLuar();
          break;
      }
      System.out.println();
    }
  }
}

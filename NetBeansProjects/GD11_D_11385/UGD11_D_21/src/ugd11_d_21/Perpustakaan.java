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
    System.out.println("Nama Perpustakaan\t: " + namaPerpustakaan);
    System.out.println("Alamat Perpustakaan\t: " + alamatPerpustakaan);
    for (int i = 0; i < daftarPengunjung.size(); i++) {
      System.out.println("Pengunjung ke-" + ((i) + 1));
      switch (daftarPengunjung.get(i).getClass().getSimpleName()) {
        case "Mahasiswa":
          System.out.println("\t=== PENGUNJUNG MAHASISWA ===");
          ((Mahasiswa) daftarPengunjung.get(i)).showMahasiswa();
          break;
        case "Dosen":
          System.out.println("\t=== PENGUNJUNG DOSEN ===");
          ((Dosen) daftarPengunjung.get(i)).showDosen();
          break;
        case "PemustakaLuar":
          System.out.println("\t=== PENGUNJUNG PEMUSTAKA LUAR ===");
          ((PemustakaLuar) daftarPengunjung.get(i)).showPemustakaLuar();
          break;
      }
    }
  }
}

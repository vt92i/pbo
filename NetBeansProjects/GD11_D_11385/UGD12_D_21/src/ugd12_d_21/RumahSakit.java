package ugd12_d_21;

import java.util.ArrayList;
import java.util.List;

public class RumahSakit {

  private final String namaRumahSakit, alamat;
  private final List<TenagaKesehatan> tenagaKesehatan;
  private double danaRumahSakit = 1_000_000_000;
  private Dokter direktur = null;

  public RumahSakit(String namaRumahSakit, String alamat) {
    this.namaRumahSakit = namaRumahSakit;
    this.alamat = alamat;
    this.tenagaKesehatan = new ArrayList<>();
  }

  public void TampilDaftarTenagaKesehatan() {
    System.out.println(this.namaRumahSakit);
    System.out.println(this.alamat);
    System.out.println("Total dana: Rp. " + this.danaRumahSakit);
    direktur.ShowData();
  }

  public void RegisterObserver(TenagaKesehatan tenagaKesehatan) {
    this.tenagaKesehatan.add(tenagaKesehatan);
  }

  public void NotifyObserver(double jumlah) {
    tenagaKesehatan.forEach((TenagaKesehatan tk) -> {
      tk.Update(jumlah);
    });
  }

  public void PulangkanPasien(double biaya, int jumlahPasien) {
    double bonus = biaya * jumlahPasien;
    double keuntungan = bonus * 10;

    System.out.println(TenagaKesehatan.space + "Memulangkan " + jumlahPasien + " pasien dengan biaya perawatan " + biaya + "/pasien");
    TenagaKesehatan.space.append("   ");
    System.out.println("\t\tDana Rumah Sakit bertambah: " + keuntungan);
    this.danaRumahSakit += keuntungan;
    NotifyObserver(bonus);
    TenagaKesehatan.space.setLength(TenagaKesehatan.space.length() - 3);
  }

  public void SetDirektur(Dokter dokter) {
    this.direktur = dokter;
  }

  public double getDanaRumahSakit() {
    return danaRumahSakit;
  }

  public void setDanaRumahSakit(double danaRumahSakit) {
    this.danaRumahSakit = danaRumahSakit;
  }
}

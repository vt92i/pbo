package ugd12_d_21;

public class Perawat extends TenagaKesehatan {

  private final int pengalaman;

  public Perawat(RumahSakit rumahSakit, String nama, double pendapatan, int pengalaman) {
    super(rumahSakit, nama, pendapatan);
    this.pengalaman = pengalaman;
  }

  @Override
  public void ShowData() {
    System.out.println("[Perawat] " + nama + " - " + "Total Pendapatan: " + pendapatan);
  }

  @Override
  public void Update(double jumlah) {
    double bonusPerawat = (jumlah * pengalaman) / 10;
    System.out.println("\t--- Pendapatan " + nama + " bertambah: " + bonusPerawat);
    this.pendapatan += bonusPerawat;
  }
}

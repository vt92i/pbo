package gd5_d_11385_2;

public class AsistenDosen extends Mahasiswa implements ISummary {
  private final String mataKuliah;
  private final int jumlahPertemuan;

  public AsistenDosen(String nama, String npm, double gajiPokok, String mataKuliah, int jumlahPertemuan) {
    super(nama, npm, gajiPokok);
    this.mataKuliah = mataKuliah;
    this.jumlahPertemuan = jumlahPertemuan;
  }

  @Override
  public double totalGaji() {
    return gajiPokok + (jumlahPertemuan * 20000);
  }

  @Override
  public void showData() {
    System.err.println("[ Asisten Dosen ]");
    System.err.println("Nama: " + nama);
    System.err.println("NPM: " + npm);
    System.err.println("Gaji Pokok: Rp." + gajiPokok);
    System.err.println("Mata Kuliah: " + mataKuliah);
    System.err.println("Jumlah Pertemuan: " + jumlahPertemuan);
    System.err.println("--------------------");
    System.err.println("Total Gaji: Rp." + totalGaji());
  }
}

package gd5_d_11385_2;

public class StudentStaff extends Mahasiswa implements ISummary {

  private final String jenisKantor;
  private final int jumlahJamKerja;

  public StudentStaff(String nama, String npm, double gajiPokok, String jenisKantor, int jumlahJamKerja) {
    super(nama, npm, gajiPokok);
    this.jenisKantor = jenisKantor;
    this.jumlahJamKerja = jumlahJamKerja;
  }

  @Override
  public double totalGaji() {
    return gajiPokok + (jumlahJamKerja * 30000);
  }

  @Override
  public void showData() {
    System.err.println("[ Student Staff ]");
    System.err.println("Nama: " + nama);
    System.err.println("NPM: " + npm);
    System.err.println("Gaji Pokok: Rp." + gajiPokok);
    System.err.println("Jenis Kantor: " + jenisKantor);
    System.err.println("Jumlah Jam Kerja: " + jumlahJamKerja);
    System.err.println("--------------------");
    System.err.println("Total Gaji: Rp." + totalGaji());
  }

}

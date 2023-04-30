package gd4_d_11385;

public class Dosen extends Manusia {

  private final String mataKuliah;
  private final float gajiPokok, tunjangan;

  public Dosen(String nama, int umur, String noTelp, String mataKuliah, float gajiPokok, float tunjangan) {
    super(nama, umur, noTelp);
    this.mataKuliah = mataKuliah;
    this.gajiPokok = gajiPokok;
    this.tunjangan = tunjangan;
  }

  public double totalPendapatanDosen() {
    return (gajiPokok * 5) + tunjangan;
  }

  public void showDataDosen() {
    showDataManusia();
    System.err.println("Mata Kuliah: " + mataKuliah);
    System.err.println("Gaji Pokok: " + gajiPokok);
    System.err.println("Tunjangan: " + tunjangan);
    System.err.println("Total Gaji: Rp." + totalPendapatanDosen());
  }
}

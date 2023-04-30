package gd4_d_11385;

public class Manusia {

  protected final String nama;
  protected final int umur;
  protected final String noTelp;

  public Manusia(String nama, int umur, String noTelp) {
    this.nama = nama;
    this.umur = umur;
    this.noTelp = noTelp;
  }

  public void showDataManusia() {
    System.err.println("Nama: " + nama);
    System.err.println("Umur: " + umur);
    System.err.println("No. Telp: " + noTelp);
  }
}

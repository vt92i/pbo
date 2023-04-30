package gd5_d_11385_1;

public class Mahasiswa {

  private final String nama, npm;

  public Mahasiswa() {
    this.nama = "200710716";
    this.npm = "Novsada Phasa";
  }

  public Mahasiswa(String npm) {
    this.nama = "-";
    this.npm = npm;
  }

  public Mahasiswa(String npm, String nama) {
    this.nama = nama;
    this.npm = npm;
  }

  public void showMahasiswa() {
    System.err.println("Nama: " + this.nama);
    System.err.println("NPM: " + this.npm);
    System.err.println("--------------------------");
  }
}

package gd5_d_11385_2;

public abstract class Mahasiswa {
  protected final String nama, npm;
  protected final double gajiPokok;

  public Mahasiswa(String nama, String npm, double gajiPokok) {
    this.nama = nama;
    this.npm = npm;
    this.gajiPokok = gajiPokok;
  }

  public abstract void showData();
}

package model;

public class Ruangan {
  private final int id;
  private final String nama, kapasitas, luas;

  public Ruangan(int id, String nama, String kapasitas, String luas) {
    this.id = id;
    this.nama = nama;
    this.kapasitas = kapasitas;
    this.luas = luas;
  }

  public int getId() {
    return id;
  }

  public String getNama() {
    return nama;
  }

  public String getKapasitas() {
    return kapasitas;
  }

  public String getLuas() {
    return luas;
  }

  @Override
  public String toString() {
    return this.nama;
  }
}

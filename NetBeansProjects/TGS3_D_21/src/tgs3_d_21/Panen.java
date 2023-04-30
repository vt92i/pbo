package tgs3_d_21;

import java.time.LocalDate;

public class Panen {

  private LocalDate tanggalPanen;
  private String jenisTanaman;
  private double berat;
  private int hargaPerKg;

  public Panen() {
    this.tanggalPanen = LocalDate.of(2020, 1, 24);
    this.jenisTanaman = "Padi";
    this.berat = 114.5;
    this.hargaPerKg = 8_000;
  }

  public Panen(LocalDate tanggalPanen, String jenisTanaman, double berat, int hargaPerKg) {
    this.tanggalPanen = tanggalPanen;
    this.jenisTanaman = jenisTanaman;
    this.berat = berat;
    this.hargaPerKg = hargaPerKg;
  }

  public LocalDate getTanggalPanen() {
    return this.tanggalPanen;
  }

  public void setTanggalPanen(LocalDate tanggalPanen) {
    this.tanggalPanen = tanggalPanen;
  }

  public String getJenisTanaman() {
    return this.jenisTanaman;
  }

  public void setJenisTanaman(String jenisTanaman) {
    this.jenisTanaman = jenisTanaman;
  }

  public double getBerat() {
    return this.berat;
  }

  public void setBerat(double berat) {
    this.berat = berat;
  }

  public int getHargaPerKg() {
    return this.hargaPerKg;
  }

  public void setHargaPerKg(int hargaPerKg) {
    this.hargaPerKg = hargaPerKg;
  }

  public double keuntungan() {
    return this.berat * this.hargaPerKg;
  }

  public void print() {
    System.out.println("Tanggal Panen: " + this.tanggalPanen);
    System.out.println("Jenis Tanaman: " + this.jenisTanaman);
    System.out.println("Berat: " + this.berat);
    System.out.println("Harga Per Kg: " + this.hargaPerKg);
    System.out.println("Keuntungan: " + this.keuntungan());
  }
}

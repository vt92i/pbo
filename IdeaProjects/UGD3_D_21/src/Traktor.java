public class Traktor {
  private String merk;
  private double kapasitasBensin;
  private int tahunPembuatan, hargaSewa;

  public Traktor() {
    this.merk = "John Deere";
    this.kapasitasBensin = 100.5;
    this.tahunPembuatan = 2010;
    this.hargaSewa = 100_000;
  }

  public Traktor(String merk, double kapasitasBensin, int tahunPembuatan, int hargaSewa) {
    this.merk = merk;
    this.kapasitasBensin = kapasitasBensin;
    this.tahunPembuatan = tahunPembuatan;
    this.hargaSewa = hargaSewa;
  }

  public String getMerk() {
    return this.merk;
  }

  public void setMerk(String merk) {
    this.merk = merk;
  }

  public double getKapasitasBensin() {
    return this.kapasitasBensin;
  }

  public void setKapasitasBensin(double kapasitasBensin) {
    this.kapasitasBensin = kapasitasBensin;
  }

  public int getTahunPembuatan() {
    return this.tahunPembuatan;
  }

  public void setTahunPembuatan(int tahunPembuatan) {
    this.tahunPembuatan = tahunPembuatan;
  }

  public int getHargaSewa() {
    return this.hargaSewa;
  }

  public void setHargaSewa(int hargaSewa) {
    this.hargaSewa = hargaSewa;
  }

  public int biayaSewa(int hari) {
    return this.hargaSewa * hari;
  }

  public double biayaBensin(int hari, double hargaBensinPerLiter) {
    return (this.kapasitasBensin * hargaBensinPerLiter * hari);
  }

  public void print() {
    System.out.println("Merk: " + this.merk);
    System.out.println("Kapasitas Bensin: " + this.kapasitasBensin);
    System.out.println("Tahun Pembuatan: " + this.tahunPembuatan);
    System.out.println("Harga Sewa: " + this.hargaSewa);
    System.out.println("Biaya Sewa: " + this.biayaSewa(3));
    System.out.println("Biaya Bensin: " + this.biayaBensin(3, 10_000));
  }
}

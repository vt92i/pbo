public class Petani {
  private String nama;
  private int umur, jamKerja, upah;

  public Petani() {
    this.nama = "Vila";
    this.umur = 20;
    this.jamKerja = 8;
    this.upah = 10_000;
  }

  public Petani(String nama, int umur, int jamKerja, int upah) {
    this.nama = nama;
    this.umur = umur;
    this.jamKerja = jamKerja;
    this.upah = upah;
  }

  public String getNama() {
    return this.nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public int getUmur() {
    return this.umur;
  }

  public void setUmur(int umur) {
    this.umur = umur;
  }

  public int getJamKerja() {
    return this.jamKerja;
  }

  public void setJamKerja(int jamKerja) {
    this.jamKerja = jamKerja;
  }

  public int getUpah() {
    return this.upah;
  }

  public void setUpah(int upah) {
    this.upah = upah;
  }

  public int upahHarian() {
    return this.jamKerja * this.upah;
  }

  public void print() {
    System.out.println("Nama: " + this.nama);
    System.out.println("Umur: " + this.umur);
    System.out.println("Jam Kerja: " + this.jamKerja);
    System.out.println("Upah: " + this.upah);
    System.out.println("Upah Harian: " + this.upahHarian());
  }
}

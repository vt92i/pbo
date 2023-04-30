package tgs3_d_21;

public class Sawah {

  private int panjang, lebar;
  private String jenisTanaman, pemilik;

  public Sawah() {
    this.panjang = 110;
    this.lebar = 70;
    this.jenisTanaman = "Padi";
    this.pemilik = "Vila";
  }

  public Sawah(int panjang, int lebar, String jenisTanaman, String pemilik) {
    this.panjang = panjang;
    this.lebar = lebar;
    this.jenisTanaman = jenisTanaman;
    this.pemilik = pemilik;
  }

  public int getPanjang() {
    return this.panjang;
  }

  public void setPanjang(int panjang) {
    this.panjang = panjang;
  }

  public int getLebar() {
    return this.lebar;
  }

  public void setLebar(int lebar) {
    this.lebar = lebar;
  }

  public String getJenisTanaman() {
    return this.jenisTanaman;
  }

  public void setJenisTanaman(String jenisTanaman) {
    this.jenisTanaman = jenisTanaman;
  }

  public String getPemilik() {
    return this.pemilik;
  }

  public void setPemilik(String pemilik) {
    this.pemilik = pemilik;
  }

  public int luas() {
    return this.panjang * this.lebar;
  }

  public int keliling() {
    return 2 * (this.panjang + this.lebar);
  }

  public void print() {
    System.out.println("Panjang: " + this.panjang);
    System.out.println("Lebar: " + this.lebar);
    System.out.println("Jenis Tanaman: " + this.jenisTanaman);
    System.out.println("Pemilik: " + this.pemilik);
    System.out.println("Luas: " + this.luas());
    System.out.println("Keliling: " + this.keliling());
  }
}

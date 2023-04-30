package tgs4_d_21;

public class Elektronik {

  protected String merek;
  protected float harga, berat;

  public Elektronik(String merek, float harga, float berat) {
    this.merek = merek;
    this.harga = harga;
    this.berat = berat;
  }

  public void showDataElektronik() {
    System.err.println("Merk: " + this.merek);
    System.err.println("Harga: " + this.harga);
    System.err.println("Berat: " + this.berat);
  }
}

package tgs4_d_21;

public class Smartphone extends Elektronik {
  protected int kapasitasBaterai, kapasitasMemori;

  public Smartphone(String merek, float harga, float berat, int kapasitasBaterai, int kapasitasMemori) {
    super(merek, harga, berat);
    this.kapasitasBaterai = kapasitasBaterai;
    this.kapasitasMemori = kapasitasMemori;
  }

  public int getKapasitasBaterai() {
    return this.kapasitasBaterai;
  }

  public void setKapasitasBaterai(int kapasitasBaterai) {
    this.kapasitasBaterai = kapasitasBaterai;
  }

  public int getKapasitasMemori() {
    return this.kapasitasMemori;
  }

  public void setKapasitasMemori(int kapasitasMemori) {
    this.kapasitasMemori = kapasitasMemori;
  }

  public float diskonSmartphone() {
    return (this.harga - 2000) / 2;
  }

  public void showDataSmartphone() {
    showDataElektronik();
    System.err.println("Kapasitas Baterai: " + this.kapasitasBaterai);
    System.err.println("Kapasitas Memori: " + this.kapasitasMemori);
    System.err.println("Diskon: " + diskonSmartphone());
    System.err.println();
  }
}

package tgs4_d_21;

public class Laptop extends Elektronik {
  protected String tipeProsesor, jenisBaterai;

  public Laptop(String merek, float harga, float berat, String tipeProsesor, String jenisBaterai) {
    super(merek, harga, berat);
    this.tipeProsesor = tipeProsesor;
    this.jenisBaterai = jenisBaterai;
  }

  public String getTipeProsesor() {
    return this.tipeProsesor;
  }

  public void setTipeProsesor(String tipeProsesor) {
    this.tipeProsesor = tipeProsesor;
  }

  public String getJenisBaterai() {
    return this.jenisBaterai;
  }

  public void setJenisBaterai(String jenisBaterai) {
    this.jenisBaterai = jenisBaterai;
  }

  public void showRekomendasi() {
    if (this.harga <= 15000000 && this.berat >= 3 && this.berat <= 5) {
      System.err.println("Merek " + merek + " direkomendasikan untuk mahasiswa");
    } else {
      System.err.println("Merek " + merek + " tidak direkomendasikan untuk mahasiswa");
    }
  }

  public void showDataLaptop() {
    showDataElektronik();
    System.err.println("Tipe Prosesor: " + this.tipeProsesor);
    System.err.println("Jenis Baterai: " + this.jenisBaterai);
    showRekomendasi();
    System.err.println();
  }
}

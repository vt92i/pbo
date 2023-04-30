package tgs5_d_21;

public abstract class Paket {
  protected String nomorResi, tujuan, waktuPengiriman, waktuTiba;
  protected double berat, tarifBerat;

  public Paket(String nomorResi, String tujuan, String waktuPengiriman, String waktuTiba, double berat, double tarifBerat) {
    this.nomorResi = nomorResi;
    this.tujuan = tujuan;
    this.waktuPengiriman = waktuPengiriman;
    this.waktuTiba = waktuTiba;
    this.berat = berat;
    this.tarifBerat = tarifBerat;
  }

  public abstract void showDataPaket();
}

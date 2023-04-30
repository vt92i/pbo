package tgs4_d_21;

public class SmartTV extends Televisi {

  private final String sistemOperasi, jenisPanel;

  public SmartTV(String merk, float harga, float berat, float ukuranLayar, float resolusiLayar, String sistemOperasi, String jenisPanel) {
    super(merk, harga, berat, ukuranLayar, resolusiLayar);
    this.sistemOperasi = sistemOperasi;
    this.jenisPanel = jenisPanel;
  }

  public float biayaTambahan() {
    switch (this.jenisPanel) {
      case "LCD":
        return this.harga * 0.1f;
      case "LED":
        return this.harga * 0.2f;
      case "OLED":
        return this.harga * 0.4f;
      default:
        return 0;
    }
  }

  public void showDataSmartTV() {
    showDataTelevisi();
    System.err.println("Sistem Operasi: " + this.sistemOperasi);
    System.err.println("Jenis Panel: " + this.jenisPanel);
    System.err.println("Biaya Tambahan: " + biayaTambahan());
    System.err.println();
  }
}

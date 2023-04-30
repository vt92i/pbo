package tgs4_d_21;

public class Android extends Smartphone {
  private final int resolusiKamera;
  private final String chipset;

  public Android(String merk, float harga, float berat, int kapasitasBaterai, int kapasitasMemori, int resolusiKamera, String chipset) {
    super(merk, harga, berat, kapasitasBaterai, kapasitasMemori);
    this.resolusiKamera = resolusiKamera;
    this.chipset = chipset;
  }

  public void tingkatanResolusiKamera() {
    if (this.resolusiKamera <= 50)
      System.err.println("good");
    if (this.resolusiKamera > 50 && this.resolusiKamera <= 150)
      System.err.println("excellent");
    if (this.resolusiKamera > 150 && this.resolusiKamera <= 200)
      System.err.println("amazing");

  }

  public void showDataAndroid() {
    showDataSmartphone();
    System.err.println("Resolusi Kamera: " + this.resolusiKamera);
    System.err.println("Chipset: " + this.chipset);
    System.err.print("Tingkatan Resolusi Kamera: ");
    tingkatanResolusiKamera();
    System.err.println();
  }
}

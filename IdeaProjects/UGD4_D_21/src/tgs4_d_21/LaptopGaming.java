package tgs4_d_21;

public class LaptopGaming extends Laptop {
  private final String bahanBody;

  public LaptopGaming(String merk, float harga, float berat, String tipeProsesor, String jenisBaterai, String bahanBody) {
    super(merk, harga, berat, tipeProsesor, jenisBaterai);
    this.bahanBody = bahanBody;
  }

  public void bonusAksesoris() {
    switch (this.bahanBody) {
      case "Carbon":
        System.err.println("Mouse");
        break;
      case "Aluminium":
        System.err.println("Mouse, Headset");
        break;
      case "Magnesium":
        System.err.println("Mouse, Headset, Keyboard");
        break;
    }
  }

  public void showDataLaptopGaming() {
    showDataLaptop();
    System.err.println("Bahan Body: " + this.bahanBody);
    System.err.print("Bonus Aksesoris: ");
    bonusAksesoris();
    System.err.println();
  }
}

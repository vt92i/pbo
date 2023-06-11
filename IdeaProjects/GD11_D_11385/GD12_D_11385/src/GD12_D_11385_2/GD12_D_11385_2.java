package GD12_D_11385_2;

public class GD12_D_11385_2 {
  public static void main(String[] args) {
    Perusahaan perus = new Perusahaan("Perusahaan DP1");
    System.out.println("[ Sebelum Remove ]");
    Observer pgw1 = new Marketing(10000, 40000, "Market", perus);
    Observer pgw2 = new IT(30000, 3, "IT", perus);
    perus.TambahBonus(5000);
    perus.RemoveObserver(pgw2);
    System.out.println();
    System.out.println("[ Setelah Remove ]");
    perus.TambahBonus(2000);
  }
}

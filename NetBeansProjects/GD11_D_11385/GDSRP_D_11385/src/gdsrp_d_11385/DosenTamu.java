package gdsrp_d_11385;

public class DosenTamu implements IMengajar {

  private final String namaDosen;
  private final double honor, jumlahJamKerja;

  public DosenTamu(String namaDosen, double honor, double jumlahJamKerja) {
    this.namaDosen = namaDosen;
    this.honor = honor;
    this.jumlahJamKerja = jumlahJamKerja;
  }

  public void showDosenTamu() {
    System.out.println("Dosen: " + namaDosen + " - " + honor + " - " + jumlahJamKerja);
    MengajarTeori();
    MengajarPraktikum();
    System.out.println();
  }

  @Override
  public void MengajarTeori() {
    System.out.println("Dosen " + namaDosen + " mengajar teori");
  }

  @Override
  public void MengajarPraktikum() {
    System.out.println("Dosen " + namaDosen + " mengajar praktikum");
  }

}

package gdsrp_d_11385;

public class DosenTetap implements IMengajar {

  private final String namaDosen;
  private final double gajiPokok, tunjangan;

  public DosenTetap(String namaDosen, double gajiPokok, double tunjangan) {
    this.namaDosen = namaDosen;
    this.gajiPokok = gajiPokok;
    this.tunjangan = tunjangan;
  }

  public void showDosenTetap() {
    System.out.println("Dosen: " + namaDosen + " - " + gajiPokok + " - " + tunjangan);
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

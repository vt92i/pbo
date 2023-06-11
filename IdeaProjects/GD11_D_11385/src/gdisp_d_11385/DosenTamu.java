package gdisp_d_11385;

public class DosenTamu extends Pengajar implements IMengajarTeori, IMengajarPraktikum {
  private final double honor, jumlahJamKerja;

  public DosenTamu(String namaDosen, double honor, double jumlahJamKerja) {
    super(namaDosen);
    this.honor = honor;
    this.jumlahJamKerja = jumlahJamKerja;
  }

  @Override
  public void showPengajar() {
    System.out.println("Dosen: " + namaPengajar + " - " + honor + " - " + jumlahJamKerja);
    MengajarTeori();
    MengajarPraktikum();
    System.out.println();
  }

  @Override
  public void MengajarTeori() {
    System.out.println("Dosen " + namaPengajar + " mengajar teori");
  }

  @Override
  public void MengajarPraktikum() {
    System.out.println("Dosen " + namaPengajar + " mengajar praktikum");
  }

}

package gdold_d_11385;

public class DosenTetap extends Pengajar implements IMengajar {

  private final double gajiPokok, tunjangan;

  public DosenTetap(String namaDosen, double gajiPokok, double tunjangan) {
    super(namaDosen);
    this.gajiPokok = gajiPokok;
    this.tunjangan = tunjangan;
  }

  @Override
  public void showPengajar() {
    System.out.println("Dosen: " + namaPengajar + " - " + gajiPokok + " - " + tunjangan);
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

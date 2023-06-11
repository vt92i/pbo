package gdold_d_11385;

public class AsistenDosen extends Pengajar implements IMengajar {

  private final int jumlahPertemuan, jumlahModul;

  public AsistenDosen(String namaAsisten, int jumlahPertemuan, int jumlahModul) {
    super(namaAsisten);
    this.jumlahPertemuan = jumlahPertemuan;
    this.jumlahModul = jumlahModul;
  }

  @Override
  public void showPengajar() {
    System.out.println("Asisten Dosen: " + namaPengajar + " - " + jumlahPertemuan + " - " + jumlahModul + " modul");
    MengajarPraktikum();
    System.out.println();
  }

  @Override
  public void MengajarTeori() {
  }

  @Override
  public void MengajarPraktikum() {
    System.out.println("Asisten " + namaPengajar + " mengajar praktikum");
  }
}

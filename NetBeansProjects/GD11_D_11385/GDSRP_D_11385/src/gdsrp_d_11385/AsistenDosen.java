package gdsrp_d_11385;

public class AsistenDosen implements IMengajar {

  private final String namaAsisten;
  private final int jumlahPertemuan, jumlahModul;

  public AsistenDosen(String namaAsisten, int jumlahPertemuan, int jumlahModul) {
    this.namaAsisten = namaAsisten;
    this.jumlahPertemuan = jumlahPertemuan;
    this.jumlahModul = jumlahModul;
  }

  public void showAsistenDosen() {
    System.out.println("Asisten Dosen: " + namaAsisten + " - " + jumlahPertemuan + " - " + jumlahModul + " modul");
    MengajarPraktikum();
    System.out.println();
  }

  @Override
  public void MengajarTeori() {
  }

  @Override
  public void MengajarPraktikum() {
    System.out.println("Asisten " + namaAsisten + " mengajar praktikum");
  }
}

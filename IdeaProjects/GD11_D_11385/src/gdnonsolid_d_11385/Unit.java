package gdnonsolid_d_11385;

public class Unit {
  private final String namaProdi, namaKaprodi;
  private final String namaKepalaTU;
  private DosenTetap dosenTetap;
  private String jamLayananTU;

  public Unit(String namaProdi, String namaKaprodi, String namaKepalaTU, String jamLayananTU) {
    this.namaProdi = namaProdi;
    this.namaKaprodi = namaKaprodi;
    this.namaKepalaTU = namaKepalaTU;
    this.jamLayananTU = jamLayananTU;
  }

  public void showProdi() {
    System.out.println("Prodi: " + namaProdi);
    System.out.println("Kaprodi: " + namaKaprodi);
    dosenTetap.showDosenTetap();
  }

  public void setDosenTetap(DosenTetap dosenTetap) {
    this.dosenTetap = dosenTetap;
  }

  public void showTU() {
    System.out.println("Kepala TU: " + namaKepalaTU);
    System.out.println("Jam layanan TU: " + jamLayananTU);
    System.out.println();
  }

  public void setJamLayananTU(String jamLayananTU) {
    this.jamLayananTU = jamLayananTU;
  }
}

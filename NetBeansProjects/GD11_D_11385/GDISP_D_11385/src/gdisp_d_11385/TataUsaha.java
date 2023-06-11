package gdisp_d_11385;

public class TataUsaha {
  private final String namaKepalaTU;
  private String jamLayananTU;

  public TataUsaha(String namaKepalaTU, String jamLayananTU) {
    this.namaKepalaTU = namaKepalaTU;
    this.jamLayananTU = jamLayananTU;
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

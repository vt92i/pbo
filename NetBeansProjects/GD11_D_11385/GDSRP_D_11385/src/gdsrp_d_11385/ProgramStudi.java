package gdsrp_d_11385;

public class ProgramStudi {

  private final String namaProdi, namaKaprodi;
  private DosenTetap dosenTetap;
  private DosenTamu dosenTamu;
  private AsistenDosen asistenDosen;

  public ProgramStudi(String namaProdi, String namaKaprodi) {
    this.namaProdi = namaProdi;
    this.namaKaprodi = namaKaprodi;
  }

  public void showProdi() {
    System.out.println("Prodi: " + namaProdi);
    System.out.println("Kaprodi: " + namaKaprodi);
    dosenTetap.showDosenTetap();
    dosenTamu.showDosenTamu();
    asistenDosen.showAsistenDosen();
  }

  public void setDosenTetap(DosenTetap dosenTetap) {
    this.dosenTetap = dosenTetap;
  }

  public void setDosenTamu(DosenTamu dosenTamu) {
    this.dosenTamu = dosenTamu;
  }

  public void setAsistenDosen(AsistenDosen asistenDosen) {
    this.asistenDosen = asistenDosen;
  }
}

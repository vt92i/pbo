package gdsrp_d_11385;

public class GDSRP_D_11385 {
  public static void main(String[] args) {
    TataUsaha TU = new TataUsaha("Agustinus Kris", "07.30 - 14.45");
    TU.setJamLayananTU("09.00 - 17.00");
    TU.showTU();

    ProgramStudi P1 = new ProgramStudi("Informatika", "Thomas Adi");
    DosenTetap DT1 = new DosenTetap("Stephanie Pamela", 3000000, 1000000);

    P1.setDosenTetap(DT1);

    DosenTamu DU = new DosenTamu("Yulius Denny", 500000, 10);
    P1.setDosenTamu(DU);

    AsistenDosen AD = new AsistenDosen("Michael Edward", 16, 2);
    P1.setAsistenDosen(AD);

    P1.showProdi();
  }
}

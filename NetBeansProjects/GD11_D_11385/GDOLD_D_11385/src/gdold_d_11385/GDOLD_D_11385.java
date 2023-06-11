package gdold_d_11385;

public class GDOLD_D_11385 {

  public static void main(String[] args) {
    ProgramStudi P1 = new ProgramStudi("Informatika", "Thomas Adi");
    DosenTetap DT1 = new DosenTetap("Stephanie Pamela", 3000000, 1000000);

    P1.addPengajar(DT1);

    DosenTamu DU = new DosenTamu("Yulius Denny", 500000, 10);
    P1.addPengajar(DU);

    AsistenDosen AD = new AsistenDosen("Michael Edward", 16, 2);
    P1.addPengajar(AD);

    P1.showProdi();
  }
}

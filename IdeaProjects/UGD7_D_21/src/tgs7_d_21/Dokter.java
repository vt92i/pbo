package tgs7_d_21;

public class Dokter<X, Y> {
  private final X namaDokter, spesialisasi;
  private final Y gaji;

  public Dokter(X namaDokter, X spesialisasi, Y gaji) {
    this.namaDokter = namaDokter;
    this.spesialisasi = spesialisasi;
    this.gaji = gaji;
  }

  public void showDokter() {
    System.out.println("\tNama Dokter\t: " + namaDokter);
    System.out.println("\tSpesialisasi\t: " + spesialisasi);
    System.out.println("\tGaji\t: " + gaji);
  }
}

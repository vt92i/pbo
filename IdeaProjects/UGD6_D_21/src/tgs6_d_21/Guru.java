package tgs6_d_21;

public class Guru {
  private final String namaGuru;
  private final float gajiKotor, gajiBersih;
  private final float pajak;

  public Guru(String namaGuru, float gajiKotor, float pajak) {
    this.namaGuru = namaGuru;
    this.gajiKotor = gajiKotor;
    this.pajak = pajak;
    this.gajiBersih = hitungGajiBersih();
  }

  public void showGuru() {
    System.out.println("\t\tNama Guru : " + namaGuru);
    System.out.println("\t\tGaji Kotor : " + gajiKotor);
    System.out.println("\t\tGaji Bersih : " + gajiBersih);
    System.out.println("\t\tPajak : " + pajak);
  }

  public final float hitungGajiBersih() {
    return this.gajiKotor - (this.gajiKotor * this.pajak);
  }
}

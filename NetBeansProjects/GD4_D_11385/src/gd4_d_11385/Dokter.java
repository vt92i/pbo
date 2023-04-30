package gd4_d_11385;

public class Dokter extends Manusia {

  private final String spesialis;
  private final float gajiSpesialis, waktuBekerja;

  public Dokter(String nama, int umur, String noTelp, String spesialis, float gajiSpesialis, float waktuBekerja) {
    super(nama, umur, noTelp);
    this.spesialis = spesialis;
    this.gajiSpesialis = gajiSpesialis;
    this.waktuBekerja = waktuBekerja;
  }

  public double totalPendapatanDokter() {
    return (gajiSpesialis * 6) - (waktuBekerja * 1000);
  }

  public void showDataDokter() {
    showDataManusia();
    System.err.println("Spesialis: " + spesialis);
    System.err.println("Gaji Spesialis: " + gajiSpesialis);
    System.err.println("Waktu Bekerja: " + waktuBekerja);
    System.err.println("Total Gaji: Rp." + totalPendapatanDokter());
  }
}

package gd6_d_11385;

public class Jurusan {
  private final String namaJurusan, kodeJurusan;

  public Jurusan(String namaJurusan, String kodeJurusan) {
    this.namaJurusan = namaJurusan;
    this.kodeJurusan = kodeJurusan;
  }

  public void showJurusan() {
    System.out.println("\tNama Jurusan: " + namaJurusan);
    System.out.println("\tKode Jurusan: " + kodeJurusan);
  }
}

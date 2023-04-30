package gd6_d_11385;

public class Fakultas {
  private final String namaFakultas, kodeFakultas;
  private final Jurusan[] jurusan;
  private int counter = 0;

  public Fakultas(String namaFakultas, String kodeFakultas) {
    this.namaFakultas = namaFakultas;
    this.kodeFakultas = kodeFakultas;
    this.jurusan = new Jurusan[2];
  }

  public void addJurusan(String namaJurusan, String kodeJurusan) {
    this.jurusan[counter] = new Jurusan(namaJurusan, kodeJurusan);
    this.counter++;
  }

  public void showFakultas() {
    System.out.println("Nama Fakultas: " + namaFakultas);
    System.out.println("Kode Fakultas: " + kodeFakultas);
    System.out.println("Jumlah Jurusan: " + counter);
    for (int i = 0; i < counter; i++) {
      System.out.println("\t[ Tampil Jurusan ]");
      System.out.println("\tJurusan ke-" + (i + 1));
      jurusan[i].showJurusan();
    }
  }
}

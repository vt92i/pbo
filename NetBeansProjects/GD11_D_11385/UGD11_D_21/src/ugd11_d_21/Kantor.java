package ugd11_d_21;

public class Kantor {
  private final String namaKantor, namaKepalaKantor, jamLayananKantor;

  public Kantor(String namaKantor, String namaKepalaKantor, String jamLayananKantor) {
    this.namaKantor = namaKantor;
    this.namaKepalaKantor = namaKepalaKantor;
    this.jamLayananKantor = jamLayananKantor;
  }

  public void showKantor() {
    System.out.println("Nama Kantor\t: " + namaKantor);
    System.out.println("Nama Kepala Kantor\t: " + namaKepalaKantor);
    System.out.println("Jam Layanan Kantor\t: " + jamLayananKantor);
  }
}

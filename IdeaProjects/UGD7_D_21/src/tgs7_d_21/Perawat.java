package tgs7_d_21;

public class Perawat<J, K> {
  private final J kodePerawat;
  private final K namaPerawat;

  public Perawat(J kodePerawat, K namaPerawat) {
    this.kodePerawat = kodePerawat;
    this.namaPerawat = namaPerawat;
  }

  public void showPerawat() {
    System.out.println("\tKode Perawat : " + kodePerawat);
    System.out.println("\tNama Perawat : " + namaPerawat);
  }
}

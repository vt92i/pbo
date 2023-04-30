package tgs7_d_21;

public class Pasien<T> {
  private final T namaPasien, golonganDarah;

  public Pasien(T namaPasien, T golonganDarah) {
    this.namaPasien = namaPasien;
    this.golonganDarah = golonganDarah;
  }

  public void showPasien() {
    System.out.println("\tNama Pasien : " + namaPasien);
    System.out.println("\tGologan Darah : " + golonganDarah);
  }
}

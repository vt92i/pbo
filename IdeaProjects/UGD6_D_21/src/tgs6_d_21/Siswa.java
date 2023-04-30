package tgs6_d_21;

public class Siswa {
  public final String namaSiswa, alamatSiswa;
  public final int umur;

  public Siswa(String namaSiswa, String alamatSiswa, int umur) {
    this.namaSiswa = namaSiswa;
    this.alamatSiswa = alamatSiswa;
    this.umur = umur;
  }

  public void showSiswa() {
    System.out.println("\t\tNama Siswa : " + namaSiswa);
    System.out.println("\t\tAlamat Siswa : " + alamatSiswa);
    System.out.println("\t\tUmur Siswa : " + umur);
  }
}

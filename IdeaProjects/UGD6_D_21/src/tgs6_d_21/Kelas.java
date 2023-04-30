package tgs6_d_21;

public class Kelas {
  public final String namaKelas, letak;
  public final int jumlahSiswa;
  public final Siswa[] siswa;
  public int counterKelas = 0;

  public Kelas(String namaKelas, String letak, int jumlahSiswa) {
    this.namaKelas = namaKelas;
    this.letak = letak;
    this.jumlahSiswa = jumlahSiswa;
    this.siswa = new Siswa[jumlahSiswa];
  }

  public void addSiswa(String namaSiswa, String alamatSiswa, int umur) {
    siswa[counterKelas] = new Siswa(namaSiswa, alamatSiswa, umur);
    counterKelas++;
  }

  public void showKelas() {
    System.out.println("\tNama Kelas : " + namaKelas);
    System.out.println("\tLetak Kelas : " + letak);
    System.out.println("\tJumlah Siswa : " + jumlahSiswa);
  }
}

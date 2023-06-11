package ugd11_d_21;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mahasiswa extends Pengunjung implements IMahasiswa {
  String namaMahasiswa, NPM;
  int tahunMasuk, semester;

  public Mahasiswa(LocalDate tanggalPeminjaman, LocalDate tanggalPengembalian, String namaMahasiswa, String NPM, int tahunMasuk, int semester) {
    super(tanggalPeminjaman, tanggalPengembalian);
    this.BATAS_HARI_PEMINJAMAN = 7;
    this.DENDA_PER_HARI = 2000;
    this.namaMahasiswa = namaMahasiswa;
    this.NPM = NPM;
    this.tahunMasuk = tahunMasuk;
    this.semester = semester;
  }

  @Override
  public void showMahasiswa() {
    System.out.println("Nama Pengunjung: " + namaMahasiswa);
    System.out.println("Nomor Identitas: " + NPM);
    System.out.println("Tahun Masuk: " + tahunMasuk);
    System.out.println("Semester: " + semester);
    System.out.println("Yang anda bisa lakukan: ");
    pinjamBuku();
    System.out.println("\t");
    pinjamMajalah();
    System.out.println("\t");
    pinjamJurnal();
    System.out.println("Waktu peminjaman: " + tanggalPeminjaman.format(DateTimeFormatter.ofPattern("dd MMMM yyyy")));
    System.out.println("Waktu pengembalian: " + tanggalPengembalian.format(DateTimeFormatter.ofPattern("dd MMMM yyyy")));
    cekDenda();
  }
}

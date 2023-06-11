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
    System.out.println("Nama pengunjung: " + namaMahasiswa);
    System.out.println("NPM: " + NPM);
    System.out.println("Tahun masuk: " + tahunMasuk);
    System.out.println("Semester: " + semester);
    System.out.println("Yang Anda bisa lakukan: ");
    System.out.print("\t");
    pinjamBuku();
    System.out.print("\t");
    pinjamMajalah();
    System.out.print("\t");
    pinjamJurnal();
    System.out.println("Waktu peminjaman: " + tanggalPeminjaman.format(DateTimeFormatter.ofPattern("dd MMMM yyyy")));
    System.out.println("Waktu pengembalian: " + tanggalPengembalian.format(DateTimeFormatter.ofPattern("dd MMMM yyyy")));
    cekDenda();
  }
}

package ugd11_d_21;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dosen extends Pengunjung implements IDosen {
  String namaDosen, NPP, asalProdi;
  int lamaBekerja;

  public Dosen(LocalDate tanggalPeminjaman, LocalDate tanggalPengembalian, String namaDosen, String NPP, String asalProdi, int lamaBekerja) {
    super(tanggalPeminjaman, tanggalPengembalian);
    this.BATAS_HARI_PEMINJAMAN = 10;
    this.DENDA_PER_HARI = 3000;
    this.namaDosen = namaDosen;
    this.NPP = NPP;
    this.asalProdi = asalProdi;
    this.lamaBekerja = lamaBekerja;
  }

  @Override
  public void showDosen() {
    System.out.println("Nama dosen: " + namaDosen);
    System.out.println("NPP: " + NPP);
    System.out.println("Asal prodi: " + asalProdi);
    System.out.println("Lama bekerja: " + lamaBekerja);
    System.out.println("Yang Anda bisa lakukan:");
    System.out.print("\t");
    pinjamBuku();
    System.out.print("\t");
    pinjamJurnal();
    System.out.println("Waktu peminjaman: " + tanggalPeminjaman.format(DateTimeFormatter.ofPattern("dd MMMM yyyy")));
    System.out.println("Waktu pengembalian: " + tanggalPengembalian.format(DateTimeFormatter.ofPattern("dd MMMM yyyy")));
    cekDenda();
  }
}

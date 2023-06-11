package ugd11_d_21;

import java.time.Duration;
import java.time.LocalDate;

public abstract class Pengunjung {
  LocalDate tanggalPeminjaman, tanggalPengembalian;
  
  int DENDA_PER_HARI;
  int BATAS_HARI_PEMINJAMAN;

  public Pengunjung(LocalDate tanggalPeminjaman, LocalDate tanggalPengembalian) {
    this.tanggalPeminjaman = tanggalPeminjaman;
    this.tanggalPengembalian = tanggalPengembalian;
  }

  public double cekTerlambat() {
    if (Duration.between(tanggalPeminjaman.atStartOfDay(), tanggalPengembalian.atStartOfDay()).toDays() > BATAS_HARI_PEMINJAMAN)
      return (Duration.between(tanggalPeminjaman.atStartOfDay(), tanggalPengembalian.atStartOfDay()).toDays() - BATAS_HARI_PEMINJAMAN);
    else
      return 0;
  }

  public void cekDenda() {
    if (cekTerlambat() > 0) {
      System.out.println("Anda terlambat mengembalikan buku selama " + String.format("%.0f", cekTerlambat()) + " hari.");
      System.out.println("Denda yang harus dibayar: Rp" + (cekTerlambat() * DENDA_PER_HARI));
    } else {
      System.out.println("Anda tidak dikenakan denda.");
    }
  }
}

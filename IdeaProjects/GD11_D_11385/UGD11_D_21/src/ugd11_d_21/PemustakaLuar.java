package ugd11_d_21;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PemustakaLuar extends Pengunjung implements IPemustakaLuar {
  String namaPemustaka, nomorPemustaka, asalDaerahPemustaka, asalInstitusiPemustaka;

  public PemustakaLuar(LocalDate tanggalPeminjaman, LocalDate tanggalPengembalian, String namaPemustaka, String nomorPemustaka, String asalDaerahPemustaka, String asalInstitusiPemustaka) {
    super(tanggalPeminjaman, tanggalPengembalian);
    this.BATAS_HARI_PEMINJAMAN = 14;
    this.DENDA_PER_HARI = 3500;
    this.namaPemustaka = namaPemustaka;
    this.nomorPemustaka = nomorPemustaka;
    this.asalDaerahPemustaka = asalDaerahPemustaka;
    this.asalInstitusiPemustaka = asalInstitusiPemustaka;
  }

  @Override
  public void showPemustakaLuar() {
    System.out.println("Nama pemustaka: " + namaPemustaka);
    System.out.println("Nomor pemustaka: " + nomorPemustaka);
    System.out.println("Asal daerah pemustaka: " + asalDaerahPemustaka);
    System.out.println("Asal institusi pemustaka: " + asalInstitusiPemustaka);
    System.out.println("Yang Anda bisa lakukan:");
    System.out.print("\t");
    pinjamBuku();
    System.out.println("Waktu peminjaman: " + tanggalPeminjaman.format(DateTimeFormatter.ofPattern("dd MMMM yyyy")));
    System.out.println("Waktu pengembalian: " + tanggalPengembalian.format(DateTimeFormatter.ofPattern("dd MMMM yyyy")));
    cekDenda();
  }
}

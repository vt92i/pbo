package ugd11_d_21;

import java.time.LocalDate;

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

  }
}

package model;

public class PeminjamanRuangan {
  private final int id;
  private final String tanggal, lamaPeminjaman, fasilitas;
  private final Karyawan karyawan;
  private final Ruangan ruangan;

  public PeminjamanRuangan(int id, String tanggal, String lamaPeminjaman, String fasilitas, Karyawan karyawan, Ruangan ruangan) {
    this.id = id;
    this.tanggal = tanggal;
    this.lamaPeminjaman = lamaPeminjaman;
    this.fasilitas = fasilitas;
    this.karyawan = karyawan;
    this.ruangan = ruangan;
  }

  public int getId() {
    return id;
  }

  public String getTanggal() {
    return tanggal;
  }

  public String getLamaPeminjaman() {
    return lamaPeminjaman;
  }

  public String getFasilitas() {
    return fasilitas;
  }

  public Karyawan getKaryawan() {
    return karyawan;
  }

  public Ruangan getRuangan() {
    return ruangan;
  }
}

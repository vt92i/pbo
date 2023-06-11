package Model;

public class MataKuliah {
  private int id;
  private String nama, deskripsi, metodePembelajaran, kelas;
  private Dosen dosen;

  public MataKuliah(int id, String nama, String deskripsi, String metodePembelajaran, String kelas, Dosen dosen) {
    this.id = id;
    this.nama = nama;
    this.deskripsi = deskripsi;
    this.metodePembelajaran = metodePembelajaran;
    this.kelas = kelas;
    this.dosen = dosen;
  }

  public MataKuliah(String nama, String deskripsi, String metodePembelajaran, String kelas, Dosen dosen) {
    this.nama = nama;
    this.deskripsi = deskripsi;
    this.metodePembelajaran = metodePembelajaran;
    this.kelas = kelas;
    this.dosen = dosen;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public String getDeskripsi() {
    return deskripsi;
  }

  public void setDeskripsi(String deskripsi) {
    this.deskripsi = deskripsi;
  }

  public String getMetodePembelajaran() {
    return metodePembelajaran;
  }

  public void setMetodePembelajaran(String metodePembelajaran) {
    this.metodePembelajaran = metodePembelajaran;
  }

  public String getKelas() {
    return kelas;
  }

  public void setKelas(String kelas) {
    this.kelas = kelas;
  }

  public Dosen getDosen() {
    return dosen;
  }

  public void setDosen(Dosen dosen) {
    this.dosen = dosen;
  }
}

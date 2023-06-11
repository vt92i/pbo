package GD12_D_11385_1;

public class Karyawan implements IComposite {
  private final String namaKaryawan, jabatan;

  public Karyawan(String namaKaryawan, String jabatan) {
    this.namaKaryawan = namaKaryawan;
    this.jabatan = jabatan;
  }

  @Override
  public void showData() {
    System.out.println(namaKaryawan + " - " + jabatan);
  }
}

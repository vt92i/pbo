package GD12_D_11385_1;

public class GD12_D_11385_1 {

  public static void main(String[] args) {
    Kepala direktur = new Kepala("Direktur Vila");
    Kepala manager = new Kepala("Manager Vila");

    Karyawan asisten = new Karyawan("Bobi", "Asisten Direktur");
    Karyawan cs = new Karyawan("Mari", "Customer Service");
    Karyawan sekret = new Karyawan("Studi", "Sekretaris");

    direktur.tambahBawahan(manager);
    direktur.tambahBawahan(asisten);

    manager.tambahBawahan(cs);
    manager.tambahBawahan(sekret);

    direktur.showData();
  }
}

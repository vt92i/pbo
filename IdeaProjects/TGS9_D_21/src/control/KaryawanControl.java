package control;

import dao.KaryawanDAO;
import model.Karyawan;

// Kelompok 21 - PBO D
// Anggota:
// - 210711401 - Simon Andrian Agis
// - 210711385 - Benidiktus Violaz Morello Anjolie

public class KaryawanControl {
  private final KaryawanDAO karyawanDAO = new KaryawanDAO();

  public void insertDataKaryawan(Karyawan k) {
    karyawanDAO.insertKaryawan(k);
  }

  public void updateDataKaryawan(Karyawan k, String id) {
    karyawanDAO.updateKaryawan(k, id);
  }

  public void deleteDataKaryawan(String id) {
    karyawanDAO.deleteKaryawan(id);
  }

  public Karyawan fetchDataKaryawan(String id) {
    return karyawanDAO.fetchKaryawan(id);
  }

  public String showAllDataKaryawan() {
    var karyawanList = karyawanDAO.fetchAllKaryawan();
    StringBuilder result = new StringBuilder();
    for (Karyawan k : karyawanList)
      result.append(k.showData()).append("\n");
    return result.toString();
  }

  public String showAllDataDosen() {
    var karyawanList = karyawanDAO.fetchAllDosen();
    StringBuilder result = new StringBuilder();
    for (Karyawan k : karyawanList)
      result.append(k.showData()).append("\n");
    return result.toString();
  }

  public String showAllDataStaff() {
    var karyawanList = karyawanDAO.fetchAllStaff();
    StringBuilder result = new StringBuilder();
    for (Karyawan k : karyawanList)
      result.append(k.showData()).append("\n");
    return result.toString();
  }
}

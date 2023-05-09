package Control;

import DAO.DosenDAO;
import Model.Dosen;

public class DosenControl {
  private final DosenDAO dosenDAO = new DosenDAO();

  public void insertDataDosen(Dosen d) {
    dosenDAO.insertDosen(d);
  }

  public void updateDataDosen(Dosen d, String nomorIndukDosen) {
    dosenDAO.updateDosen(d, nomorIndukDosen);
  }

  public void deleteDataDosen(String nomorIndukDosen) {
    dosenDAO.deleteDosen(nomorIndukDosen);
  }

  public Dosen fetchDataDosen(String nomorIndukDosen) {
    return dosenDAO.fetchDosen(nomorIndukDosen);
  }

  public String showAllDataDosen() {
    var dosenList = dosenDAO.fetchAllDosen();
    StringBuilder result = new StringBuilder();
    for (Dosen d : dosenList) {
      result.append(d.showDataDosen()).append("\n");
    }
    return result.toString();
  }
}

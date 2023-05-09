package Control;

import DAO.MataKuliahDAO;
import Model.MataKuliah;
import Table.TableMataKuliah;

import java.util.List;

public class MataKuliahControl {
  private final MataKuliahDAO mataKuliahDAO = new MataKuliahDAO();

  public void insertDataMataKuliah(MataKuliah m) {
    mataKuliahDAO.insertMataKuliah(m);
  }

  public TableMataKuliah showMataKuliah(String query) {
    List<MataKuliah> mataKuliahList = mataKuliahDAO.fetchMataKuliah(query);
    return new TableMataKuliah(mataKuliahList);
  }

  public void updateDataMataKuliah(MataKuliah m) {
    mataKuliahDAO.updateMataKuliah(m);
  }

  public void deleteDataMataKuliah(int id) {
    mataKuliahDAO.deleteMataKuliah(id);
  }
}

package control;

import dao.PeminjamanDAO;
import model.PeminjamanRuangan;
import table.TablePeminjaman;

import java.sql.SQLException;
import java.util.List;

public class PeminjamanControl {
  private final PeminjamanDAO peminjamanDAO = new PeminjamanDAO();

  public void insertDataPeminjaman(PeminjamanRuangan p) {
    peminjamanDAO.insertPeminjaman(p);
  }

  public void updateDataPeminjaman(PeminjamanRuangan p) {
    peminjamanDAO.updatePeminjaman(p);
  }

  public void deleteDataPeminjaman(int id) {
    peminjamanDAO.deletePeminjaman(id);
  }

  public TablePeminjaman showPeminjaman(String q) throws SQLException {
    List<PeminjamanRuangan> daftarPeminjamanan = peminjamanDAO.fetchAllPeminjaman(q);
    return new TablePeminjaman(daftarPeminjamanan);
  }

}

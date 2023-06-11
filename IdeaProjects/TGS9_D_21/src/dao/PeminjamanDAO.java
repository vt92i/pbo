package dao;

import connection.DbConnection;
import control.KaryawanControl;
import model.PeminjamanRuangan;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

// Kelompok 21 - PBO D
// Anggota:
// - 210711401 - Simon Andrian Agis
// - 210711385 - Benidiktus Violaz Morello Anjolie

public class PeminjamanDAO {
  private final DbConnection dbConnection = new DbConnection();
  private final KaryawanControl karyawanControl = new KaryawanControl();
  private final RuanganDAO ruanganDAO = new RuanganDAO();

  public List<PeminjamanRuangan> fetchAllPeminjaman(String query) throws SQLException {
    List<PeminjamanRuangan> daftarPeminjaman = new ArrayList<>();

    Connection connection = dbConnection.makeConnection();
    String sql = "SELECT * from peminjaman_ruangan pr INNER JOIN karyawan k ON k.id = pr.id_karyawan INNER JOIN ruangan r ON r.id = pr.id_ruangan WHERE pr.id LIKE '%" + query + "%' OR pr.id_karyawan LIKE '%" + query + "%' OR pr.id_ruangan LIKE '%" + query + "%' OR pr.tanggal LIKE '%" + query + "%' OR pr.lama_peminjaman LIKE '%" + query + "%' OR pr.fasilitas LIKE '%" + query + "%' OR k.nama LIKE '%" + query + "%' OR k.jenis LIKE '%" + query + "%' OR k.tahun_masuk LIKE '%" + query + "%' OR k.no_telepon LIKE '%" + query + "%' OR k.beban_mengajar LIKE '%" + query + "%' OR k.jam_kerja LIKE '%" + query + "%' OR r.nama LIKE '%" + query + "%' OR r.kapasitas LIKE '%" + query + "%' OR r.luas LIKE '%" + query + "%'";

    Statement statement = connection.createStatement();
    statement.execute(sql);
    var resultSet = statement.getResultSet();

    while (resultSet.next()) {
      PeminjamanRuangan pr = new PeminjamanRuangan(
              resultSet.getInt("id"),
              resultSet.getString("tanggal"),
              resultSet.getString("lama_peminjaman"),
              resultSet.getString("fasilitas"),
              karyawanControl.fetchDataKaryawan(resultSet.getString("id_karyawan")),
              ruanganDAO.fetchRuangan(resultSet.getInt("id_ruangan"))
      );
      daftarPeminjaman.add(pr);
    }

    statement.close();
    return daftarPeminjaman;
  }

  public void insertPeminjaman(PeminjamanRuangan pr) {
    Connection connection = dbConnection.makeConnection();

    String query = "INSERT INTO peminjaman_ruangan(id_karyawan, id_ruangan, tanggal, lama_peminjaman, fasilitas) VALUES ('" + pr.getKaryawan().getId() + "', '" + pr.getRuangan().getId() + "', '" + pr.getTanggal() + "', '" + pr.getLamaPeminjaman() + "', '" + pr.getFasilitas() + "')";
    System.out.println("Adding new peminjaman...");

    try {
      Statement statement = connection.createStatement();
      int result = statement.executeUpdate(query);
      System.out.println("Added " + result + " peminjaman!");
      statement.close();
    } catch (Exception e) {
      System.out.println("Error while trying to add new peminjaman!");
      System.out.println(e.getMessage());
    } finally {
      dbConnection.closeConnection();
    }
  }

  public void updatePeminjaman(PeminjamanRuangan pr) {
    Connection connection = dbConnection.makeConnection();

    String query = "UPDATE peminjaman_ruangan SET id_karyawan = '" + pr.getKaryawan().getId() + "', id_ruangan = '" + pr.getRuangan().getId() + "', tanggal = '" + pr.getTanggal() + "', lama_peminjaman = '" + pr.getLamaPeminjaman() + "', fasilitas = '" + pr.getFasilitas() + "' WHERE id = '" + pr.getId() + "'";
    System.out.println("Updating peminjaman...");

    try {
      Statement statement = connection.createStatement();
      int result = statement.executeUpdate(query);
      System.out.println("Updated " + result + " peminjaman!");
      statement.close();
    } catch (Exception e) {
      System.out.println("Error while trying to update peminjaman!");
      System.out.println(e.getMessage());
    } finally {
      dbConnection.closeConnection();
    }

  }

  public void deletePeminjaman(int id) {
    Connection connection = dbConnection.makeConnection();

    String query = "DELETE FROM peminjaman_ruangan WHERE id = '" + id + "'";
    System.out.println("Deleting peminjaman...");

    try {
      Statement statement = connection.createStatement();
      int result = statement.executeUpdate(query);
      System.out.println("Deleted " + result + " peminjaman!");
      statement.close();
    } catch (Exception e) {
      System.out.println("Error while trying to delete peminjaman!");
      System.out.println(e.getMessage());
    } finally {
      dbConnection.closeConnection();
    }
  }
}

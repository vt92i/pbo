package DAO;

import Connection.DBConnection;
import Model.Dosen;
import Model.MataKuliah;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MataKuliahDAO {

  private final DBConnection dbConnection = new DBConnection();

  //  id                  Primary     int(11)
  //  nomor_induk_dosen 	Foreign Key varchar(5)
  //  nama 	                          varchar(255)
  //  deskripsi                       varchar(255)
  //  metode_pembelajaran             varchar(7)
  //  kelas                           varchar(6)
  public void insertMataKuliah(MataKuliah m) {
    Connection connection = dbConnection.makeConnection();

    String query = "INSERT INTO mata_kuliah(nomor_induk_dosen, nama, deskripsi, metode_pembelajaran, kelas) VALUES ('" + m.getDosen().getNomorIndukDosen() + "', '" + m.getNama() + "', '" + m.getDeskripsi() + "', '" + m.getMetodePembelajaran() + "', '" + m.getKelas() + "')";
    System.out.println("Adding new mata kuliah...");

    try {
      try (Statement statement = connection.createStatement()) {
        int result = statement.executeUpdate(query);
        System.out.println("Added " + result + " mata kuliah!");
      }
    } catch (SQLException e) {
      System.out.println("Error while trying to add new mata kuliah!");
      System.out.println(e.getMessage());
    } finally {
      dbConnection.closeConnection();
    }
  }

  public List<MataKuliah> fetchMataKuliah(String query) {
    Connection connection = dbConnection.makeConnection();

    String sql = "SELECT mk.*, d.* FROM mata_kuliah mk JOIN dosen d ON mk.nomor_induk_dosen = d.nomor_induk_dosen WHERE mk.nama LIKE '%" + query + "%' OR mk.deskripsi LIKE '%" + query + "%' OR mk.metode_pembelajaran LIKE '%" + query + "%' OR mk.kelas LIKE '%" + query + "%' OR d.nama LIKE '%" + query + "%'";
    System.out.println("Fetching mata kuliah...");

    List<MataKuliah> mataKuliahList = new ArrayList<>();

    try {
      Statement statement = connection.createStatement();
      statement.execute(sql);
      var resultSet = statement.getResultSet();

      while (resultSet.next()) {
        Dosen d = new Dosen(
                resultSet.getString("d.nomor_induk_dosen"),
                resultSet.getString("d.nama"),
                resultSet.getString("d.email"),
                resultSet.getString("d.no_handphone")
        );
        MataKuliah mk = new MataKuliah(
                resultSet.getInt("mk.id"),
                resultSet.getString("mk.nama"),
                resultSet.getString("mk.deskripsi"),
                resultSet.getString("mk.metode_pembelajaran"),
                resultSet.getString("mk.kelas"),
                d);
        mataKuliahList.add(mk);
      }

    } catch (SQLException e) {
      System.out.println("Error while trying to fetch mata kuliah!");
      System.out.println(e.getMessage());
    } finally {
      dbConnection.closeConnection();
    }

    return mataKuliahList;
  }

  public void updateMataKuliah(MataKuliah mk) {
    Connection connection = dbConnection.makeConnection();

    String query = "UPDATE mata_kuliah SET nomor_induk_dosen = '" + mk.getDosen().getNomorIndukDosen() + "', nama = '" + mk.getNama() + "', deskripsi = '" + mk.getDeskripsi() + "', metode_pembelajaran = '" + mk.getMetodePembelajaran() + "', kelas = '" + mk.getKelas() + "' WHERE id = " + mk.getId();
    System.out.println("Updating mata kuliah...");

    try {
      try (Statement statement = connection.createStatement()) {
        int result = statement.executeUpdate(query);
        System.out.println("Updated " + result + " mata kuliah!");
      }
    } catch (SQLException e) {
      System.out.println("Error while trying to update mata kuliah!");
      System.out.println(e.getMessage());
    } finally {
      dbConnection.closeConnection();
    }
  }

  public void deleteMataKuliah(int id) {
    Connection connection = dbConnection.makeConnection();

    String query = "DELETE FROM mata_kuliah WHERE id = " + id;
    System.out.println("Deleting mata kuliah...");

    try {
      try (Statement statement = connection.createStatement()) {
        int result = statement.executeUpdate(query);
        System.out.println("Deleted " + result + " mata kuliah!");
      }
    } catch (SQLException e) {
      System.out.println("Error while trying to delete mata kuliah!");
      System.out.println(e.getMessage());
    } finally {
      dbConnection.closeConnection();
    }
  }
}

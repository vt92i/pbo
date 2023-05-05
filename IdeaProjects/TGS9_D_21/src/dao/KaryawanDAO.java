package dao;

import connection.DbConnection;
import exception.InvalidJenisKaryawanException;
import exception.InvalidKaryawanIDException;
import model.Karyawan;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

// Kelompok 21 - PBO D
// Anggota:
// - 210711401 - Simon Andrian Agis
// - 210711385 - Benidiktus Violaz Morello Anjolie

public class KaryawanDAO {
  private final DbConnection dbConnection = new DbConnection();

  //  id  Primary     varchar(8)
  //  nama            varchar(255)
  //  jenis           varchar(255)
  //  tahun_masuk     int(5)
  //  no_telepon      varchar(25)
  //  beban_mengajar	varchar(25)
  //  jam_kerja       int(2)

  private Karyawan fetch(String query, Connection connection) throws SQLException, InvalidJenisKaryawanException, InvalidKaryawanIDException {
    Karyawan k = null;

    Statement statement = connection.createStatement();
    statement.execute(query);
    var resultSet = statement.getResultSet();

    while (resultSet.next()) {
      k = new Karyawan(
              resultSet.getString("id"),
              resultSet.getString("nama"),
              resultSet.getString("jenis"),
              resultSet.getString("no_telepon"),
              resultSet.getString("beban_mengajar"),
              resultSet.getInt("tahun_masuk"),
              resultSet.getInt("jam_kerja")
      );
    }

    statement.close();
    return k;
  }

  private List<Karyawan> fetchAll(String query, Connection connection) throws SQLException, InvalidJenisKaryawanException, InvalidKaryawanIDException {
    List<Karyawan> karyawanList = new ArrayList<>();

    Statement statement = connection.createStatement();
    statement.execute(query);
    var resultSet = statement.getResultSet();

    while (resultSet.next()) {
      Karyawan k = new Karyawan(
              resultSet.getString("id"),
              resultSet.getString("nama"),
              resultSet.getString("jenis"),
              resultSet.getString("no_telepon"),
              resultSet.getString("beban_mengajar"),
              resultSet.getInt("tahun_masuk"),
              resultSet.getInt("jam_kerja")
      );
      karyawanList.add(k);
    }

    statement.close();
    return karyawanList;
  }

  public void insertKaryawan(Karyawan k) {
    Connection connection = dbConnection.makeConnection();

    String query = "INSERT INTO karyawan VALUES ('" + k.getId() + "', '" + k.getNama() + "', '" + k.getJenis() + "', '" + k.getTahunMasuk() + "', '" + k.getNoTelepon() + "', '" + k.getBebanMengajar() + "', '" + k.getJamKerja() + "')";
    System.out.println("Adding new karyawan...");

    try {
      Statement statement = connection.createStatement();
      int result = statement.executeUpdate(query);
      System.out.println("Added " + result + " karyawan!");
      statement.close();
    } catch (Exception e) {
      System.out.println("Error while trying to add new karyawan!");
      System.out.println(e.getMessage());
    } finally {
      dbConnection.closeConnection();
    }
  }

  public List<Karyawan> fetchAllKaryawan() {
    Connection connection = dbConnection.makeConnection();

    String query = "SELECT * FROM karyawan ORDER BY SUBSTRING(id, 1, 3), CAST(SUBSTRING(id, 5, 4) AS UNSIGNED)";
    System.out.println("Fetching all karyawan...");

    List<Karyawan> karyawanList = new ArrayList<>();

    try {
      karyawanList = fetchAll(query, connection);
    } catch (Exception e) {
      System.out.println("Error while trying to fetch karyawan!");
      System.out.println(e.getMessage());
    } finally {
      dbConnection.closeConnection();
    }
    return karyawanList;
  }

  public Karyawan fetchKaryawan(String id) {
    Connection connection = dbConnection.makeConnection();

    String query = "SELECT * FROM karyawan WHERE id = '" + id + "'";
    System.out.println("Fetching karyawan...");

    Karyawan k = null;

    try {
      k = fetch(query, connection);
    } catch (Exception e) {
      System.out.println("Error while trying to fetch karyawan!");
      System.out.println(e.getMessage());
    } finally {
      dbConnection.closeConnection();
    }
    return k;
  }

  public void updateKaryawan(Karyawan k, String id) {
    Connection connection = dbConnection.makeConnection();

    String query = "UPDATE karyawan SET id = '" + k.getId() + "', nama = '" + k.getNama() + "', jenis = '" + k.getJenis() + "', tahun_masuk = '" + k.getTahunMasuk() + "', no_telepon = '" + k.getNoTelepon() + "', beban_mengajar = '" + k.getBebanMengajar() + "', jam_kerja = '" + k.getJamKerja() + "' WHERE id = '" + id + "'";
    System.out.println("Updating karyawan...");

    try {
      Statement statement = connection.createStatement();
      int result = statement.executeUpdate(query);
      System.out.println("Updated " + result + " karyawan!");
      statement.close();
    } catch (Exception e) {
      System.out.println("Error while trying to update karyawan!");
      System.out.println(e.getMessage());
    } finally {
      dbConnection.closeConnection();
    }
  }

  public void deleteKaryawan(String id) {
    Connection connection = dbConnection.makeConnection();

    String query = "DELETE FROM karyawan WHERE id = '" + id + "'";
    System.out.println("Deleting karyawan...");

    try {
      Statement statement = connection.createStatement();
      int result = statement.executeUpdate(query);
      System.out.println("Deleted " + result + " karyawan!");
      statement.close();
    } catch (Exception e) {
      System.out.println("Error while trying to delete karyawan!");
      System.out.println(e.getMessage());
    } finally {
      dbConnection.closeConnection();
    }
  }

  public List<Karyawan> fetchAllDosen() {
    Connection connection = dbConnection.makeConnection();

    String query = "SELECT * FROM karyawan WHERE jenis = 'Dosen' ORDER BY CAST(SUBSTRING(id, 5, 4) AS UNSIGNED)";
    System.out.println("Fetching all dosen...");

    List<Karyawan> karyawanList = new ArrayList<>();

    try {
      karyawanList = fetchAll(query, connection);
    } catch (Exception e) {
      System.out.println("Error while trying to fetch dosen!");
      System.out.println(e.getMessage());
    } finally {
      dbConnection.closeConnection();
    }
    return karyawanList;
  }

  public Karyawan fetchDosen(String id) {
    Connection connection = dbConnection.makeConnection();

    String query = "SELECT * FROM karyawan WHERE id = '" + id + "' AND jenis = 'Dosen'";
    System.out.println("Fetching dosen...");

    Karyawan k = null;

    try {
      k = fetch(query, connection);
    } catch (Exception e) {
      System.out.println("Error while trying to fetch dosen!");
      System.out.println(e.getMessage());
    } finally {
      dbConnection.closeConnection();
    }
    return k;
  }

  public List<Karyawan> fetchAllStaff() {
    Connection connection = dbConnection.makeConnection();

    String query = "SELECT * FROM karyawan WHERE jenis = 'Staff TU' ORDER BY CAST(SUBSTRING(id, 5, 4) AS UNSIGNED)";
    System.out.println("Fetching all staff...");

    List<Karyawan> karyawanList = new ArrayList<>();

    try {
      karyawanList = fetchAll(query, connection);
    } catch (Exception e) {
      System.out.println("Error while trying to fetch staff!");
      System.out.println(e.getMessage());
    } finally {
      dbConnection.closeConnection();
    }
    return karyawanList;
  }

  public Karyawan fetchStaff(String id) {
    Connection connection = dbConnection.makeConnection();

    String query = "SELECT * FROM karyawan WHERE id = '" + id + "' AND jenis = 'Staff TU'";
    System.out.println("Fetching staff...");

    Karyawan k = null;

    try {
      k = fetch(query, connection);
    } catch (Exception e) {
      System.out.println("Error while trying to fetch staff!");
      System.out.println(e.getMessage());
    } finally {
      dbConnection.closeConnection();
    }
    return k;
  }
}

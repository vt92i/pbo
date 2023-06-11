package DAO;

import Connection.DBConnection;
import Model.Dosen;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DosenDAO {

  private final DBConnection dbConnection = new DBConnection();

  //  nomor_induk_dosen   varchar(5)
  //  nama                varchar(255)
  //  email               archar(255)
  //  no_handphone        varchar(14)
  public void insertDosen(Dosen d) {
    Connection connection = dbConnection.makeConnection();

    String query = "INSERT INTO dosen VALUES ('" + d.getNomorIndukDosen() + "', '" + d.getNama() + "', '" + d.getEmail() + "', '" + d.getNoHandphone() + "')";
    System.out.println("Adding new dosen...");

    try {
      try (Statement statement = connection.createStatement()) {
        int result = statement.executeUpdate(query);
        System.out.println("Added " + result + " dosen!");
      }
    } catch (SQLException e) {
      System.out.println("Error while trying to add new dosen!");
      System.out.println(e.getMessage());
    } finally {
      dbConnection.closeConnection();
    }
  }

  public List<Dosen> fetchAllDosen() {
    Connection connection = dbConnection.makeConnection();

    String query = "SELECT * FROM dosen";
    System.out.println("Fetching all dosen...");

    List<Dosen> dosenList = new ArrayList<>();

    try {
      try (Statement statement = connection.createStatement()) {
        statement.execute(query);
        var resultSet = statement.getResultSet();

        while (resultSet.next()) {
          Dosen d = new Dosen(
                  resultSet.getString("nomor_induk_dosen"),
                  resultSet.getString("nama"),
                  resultSet.getString("email"),
                  resultSet.getString("no_handphone")
          );
          dosenList.add(d);
        }
      }
    } catch (SQLException e) {
      System.out.println("Error while trying to fetch dosen!");
      System.out.println(e.getMessage());
    } finally {
      dbConnection.closeConnection();
    }
    return dosenList;
  }

  public Dosen fetchDosen(String noInduk) {
    Connection connection = dbConnection.makeConnection();

    String query = "SELECT * FROM dosen WHERE nomor_induk_dosen = '" + noInduk + "'";
    System.out.println("Fetching dosen...");

    Dosen d = null;

    try {
      try (Statement statement = connection.createStatement()) {
        statement.execute(query);
        var resultSet = statement.getResultSet();

        while (resultSet.next()) {
          d = new Dosen(
                  resultSet.getString("nomor_induk_dosen"),
                  resultSet.getString("nama"),
                  resultSet.getString("email"),
                  resultSet.getString("no_handphone")
          );
        }
      }
    } catch (SQLException e) {
      System.out.println("Error while trying to fetch dosen!");
      System.out.println(e.getMessage());
    } finally {
      dbConnection.closeConnection();
    }
    return d;
  }

  public void updateDosen(Dosen d, String noInduk) {
    Connection connection = dbConnection.makeConnection();

    String query = "UPDATE dosen SET nomor_induk_dosen = '" + d.getNomorIndukDosen() + "', nama = '" + d.getNama() + "', email = '" + d.getEmail() + "', no_handphone = '" + d.getNoHandphone() + "' WHERE nomor_induk_dosen = '" + noInduk + "'";
    System.out.println("Updating dosen...");

    try {
      try (Statement statement = connection.createStatement()) {
        int result = statement.executeUpdate(query);
        System.out.println("Updated " + result + " dosen!");
      }
    } catch (SQLException e) {
      System.out.println("Error while trying to update dosen!");
      System.out.println(e.getMessage());
    } finally {
      dbConnection.closeConnection();
    }
  }

  public void deleteDosen(String noInduk) {
    Connection connection = dbConnection.makeConnection();

    String query = "DELETE FROM dosen WHERE nomor_induk_dosen = '" + noInduk + "'";
    System.out.println("Deleting dosen...");

    try {
      try (Statement statement = connection.createStatement()) {
        int result = statement.executeUpdate(query);
        System.out.println("Deleted " + result + " dosen!");
      }
    } catch (SQLException e) {
      System.out.println("Error while trying to delete dosen!");
      System.out.println(e.getMessage());
    } finally {
      dbConnection.closeConnection();
    }
  }
}

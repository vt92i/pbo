package dao;

import connection.DbConnection;
import model.Ruangan;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RuanganDAO {
  private final DbConnection dbConnection = new DbConnection();

  public List<Ruangan> fetchAllRuangan() {
    Connection connection = dbConnection.makeConnection();

    String query = "SELECT * from ruangan";
    System.out.println("Fetching all ruangan...");

    List<Ruangan> ruanganList = new ArrayList<>();

    try {
      Statement statement = connection.createStatement();
      statement.execute(query);
      var resultSet = statement.getResultSet();

      while (resultSet.next()) {
        Ruangan k = new Ruangan(
                resultSet.getInt("id"),
                resultSet.getString("nama"),
                resultSet.getString("kapasitas"),
                resultSet.getString("luas")
        );
        ruanganList.add(k);
      }

      statement.close();
    } catch (Exception e) {
      System.out.println("Error while trying to fetch ruangan!");
      System.out.println(e.getMessage());
    } finally {
      dbConnection.closeConnection();
    }
    return ruanganList;
  }

  public Ruangan fetchRuangan(int id) {
    Connection connection = dbConnection.makeConnection();

    String query = "SELECT * from ruangan WHERE id = '" + id + "'";
    System.out.println("Fetching ruangan...");

    Ruangan ruangan = null;

    try {
      Statement statement = connection.createStatement();
      statement.execute(query);
      var resultSet = statement.getResultSet();

      while (resultSet.next()) {
        ruangan = new Ruangan(
                resultSet.getInt("id"),
                resultSet.getString("nama"),
                resultSet.getString("kapasitas"),
                resultSet.getString("luas")
        );
      }

      statement.close();
    } catch (Exception e) {
      System.out.println("Error while trying to fetch ruangan!");
      System.out.println(e.getMessage());
    } finally {
      dbConnection.closeConnection();
    }
    return ruangan;
  }
}

package Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
  public static Connection CON;
  public static final String URL = "jdbc:mysql://";
  private static final String HOST = "127.0.0.1";
  private static final String PORT = "3306";
  private static final String USERNAME = "root";
  private static final String PASSWORD = "root";
  private static final String DB = "object-persistence-1";
  public static final String DB_URL = URL + HOST + ":" + PORT + "/" + DB;

  public Connection makeConnection() {
    System.out.println("Opening database connection.");
    try {
      CON = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
      System.out.println("Database connection opened.");
    } catch (Exception e) {
      System.err.println("Unable to open database connection.");
      System.err.println(e.getMessage());
    }
    return CON;
  }

  public void closeConnection() {
    System.out.println("Closing database connection.");
    try {
      CON.close();
      System.out.println("Database connection closed.");
    } catch (Exception e) {
      System.err.println("Unable to close database connection.");
      System.err.println(e.getMessage());
    }
  }

}

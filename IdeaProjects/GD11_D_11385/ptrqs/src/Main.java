import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
  public static void main(String[] args) {
    Date date = new Date();
    System.out.println(DateTimeFormatter.ofPattern("yyyy-MM-dd").format(java.time.LocalDate.now()));
    System.out.println(java.sql.Date.valueOf(date.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate()));
  }
}

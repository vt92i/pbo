import exception.InvalidJenisKaryawanException;
import exception.InvalidKaryawanIDException;

import java.sql.SQLException;

public class Main {
  public static void main(String[] args) throws InvalidJenisKaryawanException, SQLException, InvalidKaryawanIDException {
    String fasilitas = "Mic, Projector, Dispenser";

    String[] fArray = fasilitas.split(", ");

    System.out.println(fArray[2]);

  }
}

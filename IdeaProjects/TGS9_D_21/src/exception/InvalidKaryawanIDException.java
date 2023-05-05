package exception;

// Kelompok 21 - PBO D
// Anggota:
// - 210711401 - Simon Andrian Agis
// - 210711385 - Benidiktus Violaz Morello Anjolie

public class InvalidKaryawanIDException extends Exception {
  public String getMessage() {
    return "ID Karyawan harus diawali dengan DSN atau STU dan antara 5-8 digit!";
  }
}

package exception;

// Kelompok 21 - PBO D
// Anggota:
// - 210711401 - Simon Andrian Agis
// - 210711385 - Benidiktus Violaz Morello Anjolie

public class InvalidJenisKaryawanException extends Exception {
  public String getMessage() {
    return "Jenis Karyawan harus 'Dosen' atau 'Staff TU'!";
  }
}

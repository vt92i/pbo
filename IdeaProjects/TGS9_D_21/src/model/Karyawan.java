package model;

import connection.DbConnection;
import exception.InvalidJenisKaryawanException;
import exception.InvalidKaryawanIDException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

// Kelompok 21 - PBO D
// Anggota:
// - 210711401 - Simon Andrian Agis
// - 210711385 - Benidiktus Violaz Morello Anjolie

public class Karyawan {
  private String id, nama, jenis, noTelepon, bebanMengajar;
  private int tahunMasuk, jamKerja;

  public Karyawan(String nama, String jenis, String noTelepon, String bebanMengajar, int tahunMasuk, int jamKerja) throws InvalidKaryawanIDException, InvalidJenisKaryawanException, SQLException {
    if (!jenis.equals("Dosen") && !jenis.equals("Staff TU"))
      throw new InvalidJenisKaryawanException();

    DbConnection dbConnection = new DbConnection();
    Connection connection = dbConnection.makeConnection();
    Statement statement = connection.createStatement();
    String query = String.format("SELECT id FROM karyawan WHERE jenis = '%s' ORDER BY CAST(SUBSTRING(id, 5, 4) AS UNSIGNED) DESC LIMIT 1;", jenis);
    statement.execute(query);
    var resultSet = statement.getResultSet();

    if (!resultSet.next())
      this.id = jenis.equals("Dosen") ? "DSN-1" : "STU-1";
    else
      this.id = String.format("%s%d", jenis.equals("Dosen") ? "DSN-" : "STU-", (Integer.parseInt(resultSet.getString("id").split("-")[1])) + 1);

    statement.close();

    if (this.id.length() < 5 || this.id.length() > 8 || !this.id.matches("^(DSN|STU)-[0-9]{0,4}$"))
      throw new InvalidKaryawanIDException();

    this.nama = nama;
    this.jenis = jenis;
    this.noTelepon = noTelepon;
    this.bebanMengajar = bebanMengajar;
    this.tahunMasuk = tahunMasuk;
    this.jamKerja = jamKerja;
  }

  public Karyawan(String id, String nama, String jenis, String noTelepon, String bebanMengajar, int tahunMasuk, int jamKerja) throws InvalidKaryawanIDException, InvalidJenisKaryawanException {
    if (id.length() < 5 || id.length() > 8 || !id.matches("^(DSN|STU)-[0-9]{0,4}$"))
      throw new InvalidKaryawanIDException();

    if (!jenis.equals("Dosen") && !jenis.equals("Staff TU"))
      throw new InvalidJenisKaryawanException();

    this.id = id;
    this.nama = nama;
    this.jenis = jenis;
    this.noTelepon = noTelepon;
    this.bebanMengajar = bebanMengajar;
    this.tahunMasuk = tahunMasuk;
    this.jamKerja = jamKerja;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public String getJenis() {
    return jenis;
  }

  public void setJenis(String jenis) {
    this.jenis = jenis;
  }

  public String getNoTelepon() {
    return noTelepon;
  }

  public void setNoTelepon(String noTelepon) {
    this.noTelepon = noTelepon;
  }

  public String getBebanMengajar() {
    return bebanMengajar;
  }

  public void setBebanMengajar(String bebanMengajar) {
    this.bebanMengajar = bebanMengajar;
  }

  public int getTahunMasuk() {
    return tahunMasuk;
  }

  public void setTahunMasuk(int tahunMasuk) {
    this.tahunMasuk = tahunMasuk;
  }

  public int getJamKerja() {
    return jamKerja;
  }

  public void setJamKerja(int jamKerja) {
    this.jamKerja = jamKerja;
  }

  public String showData() {
    String data = "";
    data += "ID: " + this.id + "\n";
    data += "Nama: " + this.nama + "\n";
//    data += "Jenis: " + this.jenis + "\n";
    data += "No Telepon: " + this.noTelepon + "\n";
    data += "Tahun Masuk: " + this.tahunMasuk + "\n";
    if (this.jenis.equals("Dosen"))
      data += "Beban Mengajar: " + this.bebanMengajar + "\n";
    else
      data += "Jam Kerja: " + this.jamKerja + "\n";
    return data;
  }

  @Override
  public String toString() {
    return this.nama;
  }
}

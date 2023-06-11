package Model;

public class Dosen {

  private String nomorIndukDosen, nama, email, noHandphone;

  public Dosen(String nomorIndukDosen, String nama, String email, String noHandphone) {
    this.nomorIndukDosen = nomorIndukDosen;
    this.nama = nama;
    this.email = email;
    this.noHandphone = noHandphone;
  }

  public String getNomorIndukDosen() {
    return nomorIndukDosen;
  }

  public void setNomorIndukDosen(String nomorIndukDosen) {
    this.nomorIndukDosen = nomorIndukDosen;
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getNoHandphone() {
    return noHandphone;
  }

  public void setNoHandphone(String noHandphone) {
    this.noHandphone = noHandphone;
  }

  public String showDataDosen() {
    return this.nomorIndukDosen + " | " + this.nama + " | " + this.email + " | " + this.noHandphone;
  }

  @Override
  public String toString() {
    return this.nama;
  }
}

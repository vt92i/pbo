package gd6_d_11385;

public class Penulis {

  private final String namaPena, email;

  public Penulis(String namaPena, String email) {
    this.namaPena = namaPena;
    this.email = email;
  }

  public void showPenulis() {
    System.out.println("\tNama Pena: " + namaPena);
    System.out.println("\tEmail: " + email);
  }
}

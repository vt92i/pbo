package gd6_d_11385;

public class Buku {
  private final String judulBuku, ISBN;
  private final Penulis[] penulis;
  private int counter = 0;

  public Buku(String judulBuku, String ISBN) {
    this.judulBuku = judulBuku;
    this.ISBN = ISBN;
    this.penulis = new Penulis[2];
  }

  public void addPenulis(Penulis penulis) {
    this.penulis[counter] = penulis;
    this.counter++;
  }

  public void showBuku() {
    System.out.println("Judul Buku: " + judulBuku);
    System.out.println("ISBN: " + ISBN);
    System.out.println("Jumlah Penulis: " + counter);
    for (int i = 0; i < penulis.length; i++) {
      System.out.println("\t[ Tampil Penulis ]");
      System.out.println("\tPenulis ke-" + (i + 1));
      penulis[i].showPenulis();
    }
  }
}

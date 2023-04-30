package gd6_d_11385;

public class Perpustakaan {
  private final String namaPerpus, alamatPerpus;
  private int counter = 0;
  private final Buku[] buku;

  public Perpustakaan(String namaPerpus, String alamatPerpus) {
    this.namaPerpus = namaPerpus;
    this.alamatPerpus = alamatPerpus;
    this.buku = new Buku[2];
  }

  public void addBuku(Buku buku) {
    this.buku[counter] = buku;
    this.counter++;
  }

  public void showPerpustakaan(int menu) {
    System.out.println("Nama Perpustakaan: " + namaPerpus);
    System.out.println("Alamat Perpustakaan: " + alamatPerpus);
    System.out.println("Jumlah Buku: " + counter);
    for (int i = 0; i < buku.length; i++) {
      System.out.println("\t[ Tampil Buku ]");
      System.out.println("\tBuku ke-" + (i + 1));
      buku[i].showBuku();
    }
  }
}

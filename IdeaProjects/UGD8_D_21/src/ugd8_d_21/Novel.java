package ugd8_d_21;

import Exception.*;

public class Novel extends Buku implements IHarga {
  private final String kodeNovel, nomorISBN;

  public Novel(String judulBuku, String namaPenerbit, double harga, String kodeNovel, String nomorISBN) throws ExceptionJudul, ExceptionKode, ExceptionNama, ExceptionHarga, ExceptionNomor {
    super(judulBuku, namaPenerbit, harga);

    if (!kodeNovel.contains("NOV-")) throw new ExceptionKode();
    else this.kodeNovel = kodeNovel;

    if (nomorISBN.length() != 13) throw new ExceptionNomor();
    else this.nomorISBN = nomorISBN;
  }

  public void showData() {
    System.out.println("Judul Buku: " + judulBuku);
    System.out.println("Nama Penerbit: " + namaPenerbit);
    System.out.println("Harga: " + harga);
    System.out.println("Kode Novel: " + kodeNovel);
    System.out.println("Nomor ISBN: " + nomorISBN);
  }

  public double totalHarga() {
    return harga + (harga * 0.12);
  }
}

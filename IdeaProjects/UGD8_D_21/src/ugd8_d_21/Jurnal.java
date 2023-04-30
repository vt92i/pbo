package ugd8_d_21;

import Exception.*;

public class Jurnal extends Buku implements IHarga {
  private final String kodeJurnal, nomorISSN;

  public Jurnal(String judulBuku, String namaPenerbit, double harga, String kodeJurnal, String nomorISSN) throws ExceptionJudul, ExceptionKode, ExceptionNama, ExceptionHarga, ExceptionNomor {
    super(judulBuku, namaPenerbit, harga);

    if (!kodeJurnal.contains("JUR-")) throw new ExceptionKode();
    else this.kodeJurnal = kodeJurnal;

    if (nomorISSN.length() != 8) throw new ExceptionNomor();
    else this.nomorISSN = nomorISSN;
  }

  public void showData() {
    System.out.println("Judul Buku: " + judulBuku);
    System.out.println("Nama Penerbit: " + namaPenerbit);
    System.out.println("Harga: " + harga);
    System.out.println("Kode Jurnal: " + kodeJurnal);
    System.out.println("Nomor ISSN: " + nomorISSN);
  }

  public double totalHarga() {
    return harga + (harga * 0.1);
  }
}

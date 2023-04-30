package ugd8_d_21;

import Exception.ExceptionHarga;
import Exception.ExceptionJudul;
import Exception.ExceptionNama;

public abstract class Buku {
  protected final String judulBuku, namaPenerbit;
  protected final double harga;

  public Buku(String judulBuku, String namaPenerbit, double harga) throws ExceptionNama, ExceptionHarga, ExceptionJudul {
    if (judulBuku.equals("")) throw new ExceptionJudul();
    else this.judulBuku = judulBuku;

    if (namaPenerbit.equals("")) throw new ExceptionNama();
    else this.namaPenerbit = namaPenerbit;

    if (harga < 15000) throw new ExceptionHarga();
    else this.harga = harga;
  }

  public void showData() {
  }
}

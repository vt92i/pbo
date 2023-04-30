package tgs4_d_21;

public class Televisi extends Elektronik {
  protected float ukuranLayar, resolusiLayar;

  public Televisi(String merek, float harga, float berat, float ukuranLayar, float resolusiLayar) {
    super(merek, harga, berat);
    this.ukuranLayar = ukuranLayar;
    this.resolusiLayar = resolusiLayar;
  }

  public float getHarga() {
    return this.harga;
  }

  public void setHarga(float harga) {
    this.harga = harga;
  }

  public float getUkuranLayar() {
    return this.ukuranLayar;
  }

  public void setUkuranLayar(float ukuranLayar) {
    this.ukuranLayar = ukuranLayar;
  }

  public float getResolusiLayar() {
    return this.resolusiLayar;
  }

  public void setResolusiLayar(float resolusiLayar) {
    this.resolusiLayar = resolusiLayar;
  }

  public float keuntunganPenjualanTV() {
    return (this.harga * 6) - 1000;
  }

  public void showDataTelevisi() {
    showDataElektronik();
    System.err.println("Ukuran Layar: " + this.ukuranLayar);
    System.err.println("Resolusi Layar: " + this.resolusiLayar);
    System.err.println("Keuntungan Penjualan: " + keuntunganPenjualanTV());
    System.err.println();
  }
}

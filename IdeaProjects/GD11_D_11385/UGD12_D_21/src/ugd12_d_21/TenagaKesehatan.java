package ugd12_d_21;

public abstract class TenagaKesehatan {
  public static StringBuffer space = new StringBuffer();
  protected String nama;
  protected double pendapatan;
  protected RumahSakit rumahSakit;

  public TenagaKesehatan(RumahSakit rumahSakit, String nama, double pendapatan) {
    this.nama = nama;
    this.pendapatan = pendapatan;
    this.rumahSakit = rumahSakit;
    this.rumahSakit.RegisterObserver(this);
//    this.rumahSakit.setDanaRumahSakit(this.pendapatan + this.rumahSakit.getDanaRumahSakit());
  }

  public abstract void ShowData();

  public abstract void Update(double jumlah);
}

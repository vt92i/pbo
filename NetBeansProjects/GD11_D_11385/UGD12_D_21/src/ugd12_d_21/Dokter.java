package ugd12_d_21;

import java.util.ArrayList;

public class Dokter extends TenagaKesehatan {

  private final String jenis;
  private final ArrayList<TenagaKesehatan> perawat = new ArrayList<>();
  private int jumlahBawahan = 0;

  public Dokter(RumahSakit rumahSakit, String nama, double pendapatan, String jenis) {
    super(rumahSakit, nama, pendapatan);
    this.jenis = jenis;
  }

  @Override
  public void ShowData() {
    System.out.println(TenagaKesehatan.space + "[Dokter] " + nama + " - " + "Total Pendapatan: " + pendapatan);
    TenagaKesehatan.space.append("   ");

    for (TenagaKesehatan tk : perawat) {
      System.out.print(TenagaKesehatan.space + "{Bawahan " + nama + "} ");
      tk.ShowData();
    }
    TenagaKesehatan.space.setLength(TenagaKesehatan.space.length() - 3);
  }

  @Override
  public void Update(double jumlah) {
    double bonusDokter;
    if (this.jenis.equals("Umum")) {
      bonusDokter = (jumlah * 1.5 + jumlahBawahan) / 5;
    } else {
      bonusDokter = (jumlah * 2 + jumlahBawahan) / 5;
    }
    System.out.println("\t--- Pendapatan " + nama + " bertambah: " + bonusDokter);
    this.pendapatan += bonusDokter;
  }

  public void RekrutBawahan(TenagaKesehatan tk) {
    perawat.add(tk);
    this.jumlahBawahan++;
  }
}

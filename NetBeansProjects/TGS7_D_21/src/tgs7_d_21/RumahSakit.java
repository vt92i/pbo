package tgs7_d_21;

import java.util.ArrayList;
import java.util.List;

public class RumahSakit<X> {

  private final String namaRumahSakit;
  private List<X> daftarX;

  public RumahSakit(String namaRumahSakit) {
    this.namaRumahSakit = namaRumahSakit;
    this.daftarX = new ArrayList<>();
  }

  public void addX(X part) {
    daftarX.add(part);
  }

  public String getNamaRumahSakit() {
    return namaRumahSakit;
  }

  public List<X> getDaftarX() {
    return daftarX;
  }
}

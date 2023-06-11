package GD12_D_11385_2;

import java.util.ArrayList;

public class Perusahaan {
  private final String namaPerusahaan;
  private final ArrayList<Observer> pegawai;
  private float bonus;

  public Perusahaan(String namaPerusahaan) {
    this.namaPerusahaan = namaPerusahaan;
    this.bonus = 0;
    this.pegawai = new ArrayList<>();
  }

  public void RegisterObserver(Observer obs) {
    pegawai.add(obs);
  }

  public void RemoveObserver(Observer obs) {
    pegawai.remove(obs);
  }

  public void NotifyObserver(float bonus) {
    for (Observer obs : pegawai)
      obs.update(bonus);
  }

  public void TambahBonus(float bonus) {
    this.bonus = bonus;
    NotifyObserver(bonus);
  }
}

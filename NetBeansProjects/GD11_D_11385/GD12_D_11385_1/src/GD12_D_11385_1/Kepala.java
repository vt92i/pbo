package GD12_D_11385_1;

import java.util.ArrayList;

public class Kepala implements IComposite {

  private final String namaKepala;
  private final ArrayList<IComposite> bawahan;

  public Kepala(String namaKepala) {
    this.namaKepala = namaKepala;
    this.bawahan = new ArrayList<>();
  }

  public void tambahBawahan(IComposite bawahan) {
    this.bawahan.add(bawahan);
  }

  @Override
  public void showData() {
    System.out.println(IComposite.space + "Bapak Kepala " + namaKepala);
    IComposite.space.append("   ");

    for (IComposite comp : this.bawahan) {
      System.out.print(IComposite.space + "Bawahan dari " + namaKepala + ": ");
      comp.showData();
    }

    IComposite.space.setLength(IComposite.space.length() - 3);
  }
}

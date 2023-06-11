package gdisp_d_11385;

import java.util.ArrayList;

public class ProgramStudi {
  private final String namaProdi, namaKaprodi;
  ArrayList<Pengajar> listPengajar = new ArrayList<>();

  public ProgramStudi(String namaProdi, String namaKaprodi) {
    this.namaProdi = namaProdi;
    this.namaKaprodi = namaKaprodi;
  }

  public void showProdi() {
    System.out.println("Prodi: " + namaProdi);
    System.out.println("Kaprodi: " + namaKaprodi);
    for (int i = 0; i < listPengajar.size(); i++) {
      System.out.println("Pengajar ke- " + (i + 1));
      listPengajar.get(i).showPengajar();
    }
  }

  public void addPengajar(Pengajar pengajar) {
    listPengajar.add(pengajar);
  }
}

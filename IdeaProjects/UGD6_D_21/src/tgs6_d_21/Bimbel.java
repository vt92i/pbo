package tgs6_d_21;

public class Bimbel {
  public final String namaBimbel, jenisBimbel;
  public final int jumlahKelas;
  public final Kelas[] kelas;
  public final Guru[] guru;
  public int counterKelas = 0;
  public int counterGuru = 0;

  public Bimbel(String namaBimbel, String jenisBimbel, int jumlahKelas, int jumlahGuru) {
    this.namaBimbel = namaBimbel;
    this.jenisBimbel = jenisBimbel;
    this.jumlahKelas = jumlahKelas;
    this.kelas = new Kelas[jumlahKelas];
    this.guru = new Guru[jumlahGuru];
  }

  public void addKelas(String namaKelas, String letak, int jumlahSiswa) {
    kelas[counterKelas] = new Kelas(namaKelas, letak, jumlahSiswa);
    counterKelas++;
  }

  public void addGuru(String namaGuru, float gajiKotor, float pajak) {
    guru[counterGuru] = new Guru(namaGuru, gajiKotor, pajak);
    counterGuru++;
  }

  public float hitungTotalGaji() {
    float totalGaji = 0;
    for (Guru g : guru)
      totalGaji += g.hitungGajiBersih();
    return totalGaji;
  }

  public void showBimbel() {
    System.out.println("[ Data Bimbel ]");
    System.out.println("Nama Bimbel : " + namaBimbel);
    System.out.println("Jenis Bimbel : " + jenisBimbel);
    System.out.println("Jumlah Kelas : " + jumlahKelas);
    System.out.println("Jumlah Guru : " + guru.length);
    System.out.println("Total Gaji : " + hitungTotalGaji());
    for (int i = 0; i < jumlahKelas; i++) {
      System.out.printf("\t[ Data Kelas ke-%d ]\n", i + 1);
      kelas[i].showKelas();
      for (int j = 0; j < kelas[i].jumlahSiswa; j++) {
        System.out.printf("\t\t[ Data Siswa ke-%d ]\n", j + 1);
        kelas[i].siswa[j].showSiswa();
      }
    }
    for (int i = 0; i < guru.length; i++) {
      System.out.printf("\t[ Data Guru ke-%d ]\n", i + 1);
      guru[i].showGuru();
    }
  }
}

package ugd12_d_21;

public class UGD12_D_21 {

  public static void main(String[] args) {
    RumahSakit rumahSakitNovacare = new RumahSakit("Rumah Sakit Novacare", "Jl. Diponegoro No.441");
    Dokter direkturMaya = new Dokter(rumahSakitNovacare, "Maya", 150_000_000, "Spesialis");
    rumahSakitNovacare.SetDirektur(direkturMaya);

    Dokter dokterSamuel = new Dokter(rumahSakitNovacare, "Samuel", 10_000_000, "Spesialis");
    Perawat perawatEmily = new Perawat(rumahSakitNovacare, "Emily", 4_000_000, 1);
    Perawat perawatDavid = new Perawat(rumahSakitNovacare, "David", 5_000_000, 2);
    dokterSamuel.RekrutBawahan(perawatEmily);
    dokterSamuel.RekrutBawahan(perawatDavid);

    Dokter dokterSarah = new Dokter(rumahSakitNovacare, "Sarah", 5_000_000, "Umum");
    Perawat perawatAnna = new Perawat(rumahSakitNovacare, "Anna", 8_000_000, 6);
    Perawat perawatMaria = new Perawat(rumahSakitNovacare, "Maria", 4_500_000, 2);
    dokterSarah.RekrutBawahan(perawatAnna);
    dokterSarah.RekrutBawahan(perawatMaria);

    direkturMaya.RekrutBawahan(dokterSamuel);
    direkturMaya.RekrutBawahan(dokterSarah);

    rumahSakitNovacare.TampilDaftarTenagaKesehatan();
    rumahSakitNovacare.PulangkanPasien(100_000, 4);
    rumahSakitNovacare.TampilDaftarTenagaKesehatan();
  }
}

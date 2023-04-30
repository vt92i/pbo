import java.time.LocalDate;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("[ Petani 1]");
    Petani petani = new Petani();
    System.out.println("Nama: " + petani.getNama());
    System.out.println("Umur: " + petani.getUmur());
    System.out.println("Jam Kerja: " + petani.getJamKerja());
    System.out.println("Upah: " + petani.getUpah());
    System.out.println("Upah Harian: " + petani.upahHarian());

    System.out.println();
    System.out.println("[ Petani 2]");
    Petani petaniX = new Petani();
    System.out.print("Nama: ");
    petaniX.setNama(scanner.nextLine());
    System.out.print("Umur: ");
    petaniX.setUmur(scanner.nextInt());
    System.out.print("Jam Kerja: ");
    petaniX.setJamKerja(scanner.nextInt());
    System.out.print("Upah: ");
    petaniX.setUpah(scanner.nextInt());
    System.out.println("[ Petani 2 (Hasil)]");
    petaniX.print();

    System.out.println();
    System.out.println("[ Sawah 1]");
    Sawah sawah = new Sawah();
    sawah.print();

    System.out.println();
    System.out.println("[ Sawah 2]");
    Sawah sawahX = new Sawah();
    System.out.print("Panjang: ");
    sawahX.setPanjang(scanner.nextInt());
    System.out.print("Lebar: ");
    sawahX.setLebar(scanner.nextInt());
    System.out.println("Jenis Tanaman: ");
    sawahX.setJenisTanaman(scanner.nextLine());
    System.out.println("Pemilik: ");
    sawahX.setPemilik(scanner.nextLine());
    System.out.println("[ Sawah 2 (Hasil)]");
    sawahX.print();

    System.out.println();
    System.out.println("[ Traktor 1]");
    Traktor traktor = new Traktor();
    traktor.print();

    System.out.println();
    System.out.println("[ Traktor 2]");
    Traktor traktorX = new Traktor();
    System.out.print("Merk: ");
    traktorX.setMerk(scanner.nextLine());
    System.out.print("Kapasitas Bensin: ");
    traktorX.setKapasitasBensin(scanner.nextInt());
    System.out.print("Tahun Pembuatan: ");
    traktorX.setTahunPembuatan(scanner.nextInt());
    System.out.print("Harga Sewa: ");
    traktorX.setHargaSewa(scanner.nextInt());
    System.out.println("[ Traktor 2 (Hasil)]");
    traktorX.print();

    System.out.println();
    System.out.println("[ Panen 1]");
    Panen panen = new Panen();
    panen.print();

    System.out.println();
    System.out.println("[ Panen 2]");
    Panen panenX = new Panen();
    panenX.setTanggalPanen(LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
    System.out.print("Jenis Tanaman: ");
    panenX.setJenisTanaman(scanner.nextLine());
    System.out.print("Berat: ");
    panenX.setBerat(scanner.nextInt());
    System.out.print("Harga per Kg: ");
    panenX.setHargaPerKg(scanner.nextInt());
    System.out.println("[ Panen 2 (Hasil)]");
    panenX.print();
  }
}

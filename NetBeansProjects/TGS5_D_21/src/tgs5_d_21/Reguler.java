package tgs5_d_21;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Reguler extends Paket implements IBiaya, IDurasi {

  private final double tarifPacking, tarifAngkutanReguler;

  public Reguler(String nomorResi, String tujuan, String waktuPengiriman, String waktuTiba, double berat, double tarifBerat, double tarifPacking, double tarifAngkutanReguler) {
    super(nomorResi, tujuan, waktuPengiriman, waktuTiba, berat, tarifBerat);
    this.tarifPacking = tarifPacking;
    this.tarifAngkutanReguler = tarifAngkutanReguler;
  }

  @Override
  public double hitungBiaya() {
    return (tarifBerat * berat) + tarifPacking + tarifAngkutanReguler;
  }

  public double hitungBiaya(double persenPajakPengiriman) {
    return hitungBiaya() + (hitungBiaya() * persenPajakPengiriman);
  }

  @Override
  public double hitungDurasi() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    Duration durasi = Duration.between(LocalDateTime.parse(waktuPengiriman, formatter), LocalDateTime.parse(waktuTiba, formatter));
    return durasi.toSeconds();
  }

  @Override
  public void showDataPaket() {
    System.err.println("Nomor Resi : " + nomorResi);
    System.err.println("Tujuan : " + tujuan);
    System.err.println("Berat : " + berat + " kg");
    System.err.println("Tarif Berat : Rp. " + tarifBerat);
    System.err.println("Tarif Packing : Rp. " + tarifPacking);
    System.err.println("Tarif Angkutan Reguler : Rp. " + tarifAngkutanReguler);
    System.err.println("Biaya : Rp. " + hitungBiaya());
    System.err.println("Biaya Pajak : 15.0%");
    System.err.println("Biaya + Pajak : Rp. " + hitungBiaya(0.15));
    printDurasi();
    System.err.println();
  }

  private void printDurasi() {
    long durasi = (long) hitungDurasi();
    long hari = durasi / 86400;
    long jam = (durasi % 86400) / 3600;
    long menit = ((durasi % 86400) % 3600) / 60;
    long detik = ((durasi % 86400) % 3600) % 60;
    System.err.println("Durasi : " + hari + " hari " + jam + " jam " + menit + " menit " + detik + " detik");
    System.err.println("Durasi : " + durasi / 3600 + " jam " + menit + " menit ");
  }
}

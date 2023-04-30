package tgs5_d_21;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Express extends Paket implements IBiaya, IDurasi {

  private final double tarifJemput, tarifAngkutanPrioritas;

  public Express(String nomorResi, String tujuan, String waktuPengiriman, String waktuTiba, double berat, double tarifBerat, double tarifJemput, double tarifAngkutanPrioritas) {
    super(nomorResi, tujuan, waktuPengiriman, waktuTiba, berat, tarifBerat);
    this.tarifJemput = tarifJemput;
    this.tarifAngkutanPrioritas = tarifAngkutanPrioritas;
  }

  @Override
  public double hitungBiaya() {
    return (tarifBerat * berat) + tarifJemput + tarifAngkutanPrioritas;
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
    System.err.println("Tarif Jemput : Rp. " + tarifJemput);
    System.err.println("Tarif Angkutan Prioritas : Rp. " + tarifAngkutanPrioritas);
    System.err.println("Biaya : Rp. " + hitungBiaya());
    System.err.println("Biaya Pajak : 20.5%");
    System.err.println("Biaya + Pajak : Rp. " + hitungBiaya(0.205));
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

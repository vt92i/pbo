/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tgs7_d_21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author fikaa
 */
public class TGS7_D_21 {

  public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) throws IOException {
    // Rumah sakit 1
    RumahSakit<Dokter> rumahSakit1 = new RumahSakit<>("Rumah Sakit 1 - Kelompok 21");
    rumahSakit1.addX(new Dokter<>("Steven King", "Saraf", 4100000));

    // Rumah sakit 2
    RumahSakit<Pasien> rumahSakit2 = new RumahSakit<>("Rumah Sakit 2 - Kelompok 21");
    rumahSakit2.addX(new Pasien<>("David Austin", "AB"));

    // Rumah sakit 3
    RumahSakit<Perawat> rumahSakit3 = new RumahSakit<>("Rumah Sakit 3 - Kelompok 21");
    rumahSakit3.addX(new Perawat<>(1, "Nancy Greenberg"));

    // Input dokter 2
    System.out.println("Masukkan Nama Dokter\t:");
    String namaDokter = br.readLine();
    System.out.println("Masukkan Gaji\t: ");
    double gajiDokter = Double.parseDouble(br.readLine());
    System.out.println("Masukkan Spesialis");
    String spesialis = br.readLine();
    Dokter<String, Double> dokter2 = new Dokter<>(namaDokter, spesialis, gajiDokter);
    rumahSakit1.addX(dokter2);
    System.out.println();

    // Input pasien 2
    System.out.println("Masukkan Nama Pasien\t: ");
    String namaPasien = br.readLine();
    System.out.println("Masukkan Golongan Darah\t: ");
    String goldar = br.readLine();
    Pasien<String> pasien2 = new Pasien<>(namaPasien, goldar);
    rumahSakit2.addX(pasien2);
    System.out.println();

    // Input perawat 2
    System.out.println("Masukkan Kode Perawat\t: ");
    int kodePerawat = Integer.parseInt(br.readLine());
    System.out.println("Masukkan Nama Perawat\t: ");
    String namaPerawat = br.readLine();
    Perawat<Integer, String> perawat2 = new Perawat<>(kodePerawat, namaPerawat);
    rumahSakit3.addX(perawat2);
    System.out.println();

    // Show data rumah sakit 1
    System.out.println("=========================================");
    System.out.println(rumahSakit1.getNamaRumahSakit());
    System.out.println("\t\t[ Data Dokter ]");
    for (Dokter dokter : rumahSakit1.getDaftarX()) {
      dokter.showDokter();
      System.out.println();
    }

    // Show data rumah sakit 2
    System.out.println("=========================================");
    System.out.println(rumahSakit2.getNamaRumahSakit());
    System.out.println("\t\t[ Data Pasien ]");
    for (Pasien pasien : rumahSakit2.getDaftarX()) {
      pasien.showPasien();
      System.out.println();
    }

    // Show data rumah sakit 3
    System.out.println("=========================================");
    System.out.println(rumahSakit3.getNamaRumahSakit());
    System.out.println("\t\t[ Data Perawat ]");
    for (Perawat perawat : rumahSakit3.getDaftarX()) {
      perawat.showPerawat();
      System.out.println();
    }
  }
}

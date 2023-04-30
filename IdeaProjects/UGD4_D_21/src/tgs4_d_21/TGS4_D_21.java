/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tgs4_d_21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author fikaa
 */
public class TGS4_D_21 {
  public static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) throws IOException {
    // TODO code application logic here
    int counter = 0;
    int totalProduk = 9;

    String merek, jenis;
    float harga, berat;

    Televisi[] tv = new Televisi[2];
    Smartphone[] sp = new Smartphone[2];
    Laptop[] lp = new Laptop[2];

    SmartTV stv = null;
    Android ad = null;
    LaptopGaming lg = null;

    while (counter < totalProduk) {
      System.err.println("Merk elektronik: ");
      merek = input.readLine();

      System.err.println("Harga elektronik: ");
      harga = Float.parseFloat(input.readLine());

      System.err.println("Berat elektronik: ");
      berat = Float.parseFloat(input.readLine());

      System.err.println("Jenis elektronik (televisi/smartphone/laptop/smarttv/android/laptopgaming): ");
      jenis = input.readLine();

      while (!jenis.equals("televisi") && !jenis.equals("smartphone") && !jenis.equals("laptop") && !jenis.equals("smarttv") && !jenis.equals("android") && !jenis.equals("laptopgaming")) {
        System.err.println("[ERROR] Jenis elektronik tidak valid");
        System.err.println("Jenis elektronik (televisi/smartphone/laptop/smarttv/android/laptopgaming): ");
        jenis = input.readLine();
      }

      switch (jenis) {
        case "televisi":
          if (tv[tv.length - 1] != null) System.err.println("[ERROR] Maksimal 2 televisi.");
          for (int i = 0; i < tv.length; i++) {
            if (tv[i] == null) {
              System.err.println("Ukuran layar: ");
              float ukuranLayar = Float.parseFloat(input.readLine());

              System.err.println("Resolusi layar: ");
              float resolusiLayar = Float.parseFloat(input.readLine());

              tv[i] = new Televisi(merek, harga, berat, ukuranLayar, resolusiLayar);
              counter++;
              break;
            }
          }
          break;
        case "smartphone":
          if (sp[sp.length - 1] != null) System.err.println("[ERROR] Maksimal 2 smartphone.");
          for (int i = 0; i < sp.length; i++) {
            if (sp[i] == null) {
              System.err.println("Kapasitas baterai: ");
              int kapasitasBaterai = Integer.parseInt(input.readLine());

              System.err.println("Kapasitas memori: ");
              int kapasitasMemori = Integer.parseInt(input.readLine());

              sp[i] = new Smartphone(merek, harga, berat, kapasitasBaterai, kapasitasMemori);
              counter++;
              break;
            }
          }
          break;
        case "laptop":
          if (lp[lp.length - 1] != null) System.err.println("[ERROR] Maksimal 2 laptop.");
          for (int i = 0; i < lp.length; i++) {
            if (lp[i] == null) {
              System.err.println("Tipe prosesor: ");
              String tipeProsesor = input.readLine();

              System.err.println("Jenis baterai: ");
              String jenisBaterai = input.readLine();

              lp[i] = new Laptop(merek, harga, berat, tipeProsesor, jenisBaterai);
              counter++;
              break;
            }
          }
          break;
        case "smarttv":
          if (stv == null) {
            System.err.println("Ukuran layar: ");
            float ukuranLayar = Float.parseFloat(input.readLine());

            System.err.println("Resolusi layar: ");
            float resolusiLayar = Float.parseFloat(input.readLine());

            System.err.println("Sistem operasi: ");
            String sistemOperasi = input.readLine();

            System.err.println("Jenis panel (lcd/led/oled): ");
            String jenisPanel = input.readLine();

            while (!jenisPanel.equals("lcd") && !jenisPanel.equals("led") && !jenisPanel.equals("oled")) {
              System.err.println("[ERROR] Jenis panel tidak valid");
              System.err.println("Jenis panel (lcd/led/oled): ");
              jenisPanel = input.readLine();
            }

            stv = new SmartTV(merek, harga, berat, ukuranLayar, resolusiLayar, sistemOperasi, jenisPanel);
            counter++;
          } else System.err.println("[ERROR] Maksimal 1 smarttv.");
          break;
        case "android":
          if (ad == null) {
            System.err.println("Kapasitas baterai: ");
            int kapasitasBaterai = Integer.parseInt(input.readLine());

            System.err.println("Kapasitas memori: ");
            int kapasitasMemori = Integer.parseInt(input.readLine());

            System.err.println("Resolusi kamera: ");
            int resolusiKamera = Integer.parseInt(input.readLine());

            System.err.println("Chipset: ");
            String chipset = input.readLine();

            ad = new Android(merek, harga, berat, kapasitasBaterai, kapasitasMemori, resolusiKamera, chipset);
            counter++;
          } else System.err.println("[ERROR] Maksimal 1 android.");
          break;
        case "laptopgaming":
          if (lg == null) {
            System.err.println("Tipe prosesor: ");
            String tipeProsesor = input.readLine();

            System.err.println("Jenis baterai: ");
            String jenisBaterai = input.readLine();

            System.err.println("Bahan body (Carbon/Aluminium/Magnesium): ");
            String jenisPanel = input.readLine();

            while (!jenisPanel.equals("Carbon") && !jenisPanel.equals("Aluminium") && !jenisPanel.equals("Magnesium")) {
              System.err.println("[ERROR] Bahan body tidak valid");
              System.err.println("Bahan body (Carbon/Aluminium/Magnesium): ");
              jenisPanel = input.readLine();
            }

            lg = new LaptopGaming(merek, harga, berat, tipeProsesor, jenisBaterai, jenisPanel);
            counter++;
          } else System.err.println("[ERROR] Maksimal 1 laptop gaming.");
          break;
        default:
          System.err.println("[ERROR] Jenis elektronik tidak ditemukan.");
          break;
      }
      System.err.println();
    }

    System.err.println("[ Data Televisi ]");
    for (Televisi t : tv)
      if (t != null) t.showDataTelevisi();


    System.err.println("[ Data Smartphone ]");
    for (Smartphone s : sp)
      if (s != null) s.showDataSmartphone();


    System.err.println("[ Data Laptop ]");
    for (Laptop l : lp)
      if (l != null) l.showDataLaptop();


    System.err.println("[ Data SmartTV ]");
    if (stv != null) stv.showDataSmartTV();

    System.err.println("[ Data Android ]");
    if (ad != null) ad.showDataAndroid();

    System.err.println("[ Data Laptop Gaming ]");
    if (lg != null) lg.showDataLaptopGaming();

  }

}


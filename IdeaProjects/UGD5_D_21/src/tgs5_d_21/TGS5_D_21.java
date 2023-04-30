/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tgs5_d_21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @author fikaa
 */
public class TGS5_D_21 {
  public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) throws IOException {
    ArrayList<Paket> paket = new ArrayList<>();
    int counter;

    while (true) {
      System.err.println("Selamat Datang di Fast Track.");
      System.err.println("[ Pilihan Paket ]");
      System.err.println("1. Express");
      System.err.println("2. Reguler");
      System.err.println("3. Cargo");
      System.err.println("4. Lihat Data Paket");
      System.err.println("0. Keluar");
      System.err.print("Pilihan : ");

      switch (Integer.parseInt(br.readLine())) {
        case 1:
          System.err.println();
          System.err.println("Jumlah paket Express yang ingin diinput : ");
          counter = Integer.parseInt(br.readLine());
          for (int i = 0; i < counter; i++) {
            System.err.printf("[ Paket ke-%d ]%n", i + 1);
            System.err.print("Nomor Resi : ");
            String nomorResi = br.readLine();
            System.err.print("Tujuan : ");
            String tujuan = br.readLine();
            System.err.print("Berat : ");
            double berat = Double.parseDouble(br.readLine());
            System.err.print("Tarif Berat : ");
            double tarifBerat = Double.parseDouble(br.readLine());
            System.err.print("Tarif Jemput : ");
            double tarifJemput = Double.parseDouble(br.readLine());
            System.err.print("Tarif Angkutan Prioritas : ");
            double tarifAngkutanPrioritas = Double.parseDouble(br.readLine());
            System.err.print("Waktu Pengiriman : ");
            String waktuPengiriman = br.readLine();
            System.err.print("Waktu Tiba : ");
            String waktuTiba = br.readLine();
            paket.add(new Express(nomorResi, tujuan, waktuPengiriman, waktuTiba, berat, tarifBerat, tarifJemput, tarifAngkutanPrioritas));
          }
          System.err.println("Berhasil isi data paket!\n");
          break;
        case 2:
          System.err.println();
          System.err.println("Jumlah paket reguler yang ingin diinput : ");
          counter = Integer.parseInt(br.readLine());
          for (int i = 0; i < counter; i++) {
            System.err.printf("[ Paket ke-%d ]%n", i + 1);
            System.err.print("Nomor Resi : ");
            String nomorResi = br.readLine();
            System.err.print("Tujuan : ");
            String tujuan = br.readLine();
            System.err.print("Berat : ");
            double berat = Double.parseDouble(br.readLine());
            System.err.print("Tarif Berat : ");
            double tarifBerat = Double.parseDouble(br.readLine());
            System.err.print("Tarif Packing : ");
            double tarifPacking = Double.parseDouble(br.readLine());
            System.err.print("Tarif Angkutan Reguler : ");
            double tarifAngkutanReguler = Double.parseDouble(br.readLine());
            System.err.print("Waktu Pengiriman : ");
            String waktuPengiriman = br.readLine();
            System.err.print("Waktu Tiba : ");
            String waktuTiba = br.readLine();
            paket.add(new Reguler(nomorResi, tujuan, waktuPengiriman, waktuTiba, berat, tarifBerat, tarifPacking, tarifAngkutanReguler));
          }
          System.err.println("Berhasil isi data paket!\n");
          break;
        case 3:
          System.err.println();
          System.err.println("Jumlah paket cargo yang ingin diinput : ");
          counter = Integer.parseInt(br.readLine());
          for (int i = 0; i < counter; i++) {
            System.err.printf("[ Paket ke-%d ]%n", i + 1);
            System.err.print("Nomor Resi : ");
            String nomorResi = br.readLine();
            System.err.print("Tujuan : ");
            String tujuan = br.readLine();
            System.err.print("Berat : ");
            double berat = Double.parseDouble(br.readLine());
            System.err.print("Tarif Berat : ");
            double tarifBerat = Double.parseDouble(br.readLine());
            System.err.print("Tarif Asuransi : ");
            double tarifAsuransi = Double.parseDouble(br.readLine());
            System.err.print("Tarif Extra Packing : ");
            double tarifExtraPacking = Double.parseDouble(br.readLine());
            System.err.print("Waktu Pengiriman : ");
            String waktuPengiriman = br.readLine();
            System.err.print("Waktu Tiba : ");
            String waktuTiba = br.readLine();
            paket.add(new Cargo(nomorResi, tujuan, waktuPengiriman, waktuTiba, berat, tarifBerat, tarifAsuransi, tarifExtraPacking));
          }
          break;
        case 4:
          System.err.println();
          System.err.println("[ Data Paket ]");
          for (int i = 0; i < paket.size(); i++) {
            System.err.printf("[ Paket ke-%d ]%n", i + 1);
            System.err.printf("[ %s ]%n", paket.get(i).getClass().getSimpleName());
            paket.get(i).showDataPaket();
          }
          break;
        case 0:
          System.err.println();
          System.err.println("Terima kasih telah menggunakan layanan kami.");
          System.exit(0);
          break;
        default:
          System.err.println("Pilihan tidak ada.");
          break;
      }
    }
  }

}

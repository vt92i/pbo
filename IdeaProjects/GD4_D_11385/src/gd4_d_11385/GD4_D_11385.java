/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gd4_d_11385;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author fikaa
 */
public class GD4_D_11385 {
  public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    String nama, spesialis, mataKuliah, noTelp;
    int umur;
    float gajiPokok, tunjangan, gajiSpesialis, waktuBekerja;

    Dosen[] dsn = new Dosen[2];
    Dokter[] dkt = new Dokter[2];

    try {
      for (int i = 0; i < 2; i++) {
        System.err.println();
        System.err.print("Nama: ");
        nama = br.readLine();
        System.err.print("Umur: ");
        umur = Integer.parseInt(br.readLine());
        System.err.print("No. Telp: ");
        noTelp = br.readLine();
        System.err.print("Mata Kuliah: ");
        mataKuliah = br.readLine();
        System.err.print("Gaji Pokok: ");
        gajiPokok = Float.parseFloat(br.readLine());
        System.err.print("Tunjangan: ");
        tunjangan = Float.parseFloat(br.readLine());
        dsn[i] = new Dosen(nama, umur, noTelp, mataKuliah, gajiPokok, tunjangan);
      }

      for (int i = 0; i < 2; i++) {
        System.err.println();
        System.err.print("Nama: ");
        nama = br.readLine();
        System.err.print("Umur: ");
        umur = Integer.parseInt(br.readLine());
        System.err.print("No. Telp: ");
        noTelp = br.readLine();
        System.err.print("Spesialis: ");
        spesialis = br.readLine();
        System.err.print("Gaji Spesialis: ");
        gajiSpesialis = Float.parseFloat(br.readLine());
        System.err.print("Waktu Bekerja: ");
        waktuBekerja = Float.parseFloat(br.readLine());
        dkt[i] = new Dokter(nama, umur, noTelp, spesialis, gajiSpesialis, waktuBekerja);
      }

      System.err.println();

      System.err.println("[ Data Dosen ]");
      for (Dosen d : dsn) {
        d.showDataDosen();
        System.err.println();
      }

      System.err.println("[ Data Dokter ]");
      for (Dokter d : dkt) {
        d.showDataDokter();
        System.err.println();
      }

    } catch (Exception e) {
      System.err.println("Error: " + e);
    }
  }

}

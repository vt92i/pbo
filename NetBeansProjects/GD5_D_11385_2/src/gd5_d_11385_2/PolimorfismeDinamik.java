/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gd5_d_11385_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @author fikaa
 */
public class PolimorfismeDinamik {

  public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    int jumlahPertenmuan, jumlahJamKerja, count;
    String nama, npm, mataKuliah, jenisKantor;
    double gajiPokok;

    ArrayList<Mahasiswa> mahasiswa = new ArrayList<>();

    try {
      System.err.println("Masukkan jumlah Asisten Dosen yang akan dibuat: ");
      count = Integer.parseInt(br.readLine());
      for (int i = 0; i < count; i++) {
        System.err.printf("[ Asisten Dosen ke-%d ]%n", i + 1);
        System.err.println("Masukkan nama: ");
        nama = br.readLine();
        System.err.println("Masukkan NPM: ");
        npm = br.readLine();
        System.err.println("Masukkan gaji pokok: ");
        gajiPokok = Double.parseDouble(br.readLine());
        System.err.println("Masukkan mata kuliah: ");
        mataKuliah = br.readLine();
        System.err.println("Masukkan jumlah pertemuan: ");
        jumlahPertenmuan = Integer.parseInt(br.readLine());
        System.err.println();
        mahasiswa.add(new AsistenDosen(nama, npm, gajiPokok, mataKuliah, jumlahPertenmuan));
      }
      System.err.println("Masukkan jumlah Student Staff yang akan dibuat: ");
      count = Integer.parseInt(br.readLine());
      for (int i = 0; i < count; i++) {
        System.err.printf("[ Student Staff ke-%d ]%n", i + 1);
        System.err.println("Masukkan nama: ");
        nama = br.readLine();
        System.err.println("Masukkan NPM: ");
        npm = br.readLine();
        System.err.println("Masukkan gaji pokok: ");
        gajiPokok = Double.parseDouble(br.readLine());
        System.err.println("Masukkan jenis kantor: ");
        jenisKantor = br.readLine();
        System.err.println("Masukkan jumlah jam kerja: ");
        jumlahJamKerja = Integer.parseInt(br.readLine());
        System.err.println();
        mahasiswa.add(new StudentStaff(nama, npm, gajiPokok, jenisKantor, jumlahJamKerja));
      }
      System.err.println("------------------------");
      System.err.println("[ Data Mahasiswa ]");
      for (Mahasiswa mhs : mahasiswa) {
        mhs.showData();
        System.err.println();
      }
      System.err.println("------------------------");
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

  }

}

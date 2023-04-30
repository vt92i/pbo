/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tgs6_d_21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author fikaa
 */
public class TGS6_D_21 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("[ Input Data Bimbel ]");
    System.out.print("Nama Bimbel : ");
    String namaBimbel = br.readLine();
    System.out.print("Jenis Bimbel : ");
    String jenisBimbel = br.readLine();
    System.out.print("Jumlah Kelas : ");
    int jumlahKelas = Integer.parseInt(br.readLine());
    System.out.print("Jumlah Guru : ");
    int jumlahGuru = Integer.parseInt(br.readLine());
    Bimbel bimbel = new Bimbel(namaBimbel, jenisBimbel, jumlahKelas, jumlahGuru);

    System.out.println("\t[ Input Data Kelas ]");
    for (int i = 0; i < jumlahKelas; i++) {
      System.out.println("\tKelas " + (i + 1));
      System.out.print("\tNama Kelas : ");
      String namaKelas = br.readLine();
      System.out.print("\tLetak Kelas : ");
      String letakKelas = br.readLine();
      System.out.print("\tJumlah Siswa : ");
      int jmlhSiswa = Integer.parseInt(br.readLine());
      bimbel.addKelas(namaKelas, letakKelas, jmlhSiswa);

      System.out.println("\t\t[ Input Data Siswa ]");
      for (int j = 0; j < jmlhSiswa; j++) {
        System.out.println("\t\tSiswa " + (j + 1));
        System.out.print("\t\tNama Siswa : ");
        String namaSiswa = br.readLine();
        System.out.print("\t\tAlamat Siswa : ");
        String alamatSiswa = br.readLine();
        System.out.print("\t\tUmur Siswa : ");
        int umur = Integer.parseInt(br.readLine());
        bimbel.kelas[i].addSiswa(namaSiswa, alamatSiswa, umur);
      }
    }

    System.out.println("\t[ Input Data Guru ]");
    for (int i = 0; i < jumlahGuru; i++) {
      System.out.println("\tGuru " + (i + 1));
      System.out.print("\tNama Guru : ");
      String namaGuru = br.readLine();
      System.out.print("\tGaji Kotor : ");
      float gajiKotor = Float.parseFloat(br.readLine());
      System.out.print("\tPajak : ");
      float pajak = Float.parseFloat(br.readLine());
      bimbel.addGuru(namaGuru, gajiKotor, pajak);
    }

    System.out.println();
    bimbel.showBimbel();
    System.out.println("Adios!");
  }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ugd8_d_21;

import Exception.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author fikaa
 */
public class UGD8_D_21 {

  /**
   * @param args the command line arguments
   */

  public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws IOException {
    // TODO code application logic here

    try {
      System.out.println("Judul jurnal: ");
      String judulBuku = br.readLine();

      System.out.println("Harga jurnal: ");
      double harga = Double.parseDouble(br.readLine());

      System.out.println("Nama penerbit: ");
      String namaPenerbit = br.readLine();

      System.out.println("Kode jurnal: ");
      String kodeJurnal = br.readLine();

      System.out.println("Nomor ISSN: ");
      String nomorISSN = br.readLine();

      Jurnal jurnal = new Jurnal(judulBuku, namaPenerbit, harga, kodeJurnal, nomorISSN);
      jurnal.showData();

      System.out.println("==================================================");

      try {
        System.out.println("Judul Novel: ");
        judulBuku = br.readLine();

        System.out.println("Harga Novel: ");
        harga = Double.parseDouble(br.readLine());

        System.out.println("Nama Penerbit: ");
        namaPenerbit = br.readLine();

        System.out.println("Kode Novel: ");
        kodeJurnal = br.readLine();

        System.out.println("Nomor ISBN: ");
        String nomorISBN = br.readLine();

        Novel novel = new Novel(judulBuku, namaPenerbit, harga, kodeJurnal, nomorISBN);
        novel.showData();
      } catch (ExceptionHarga e) {
        e.showMessage();
      } catch (ExceptionJudul e) {
        e.showMessage();
      } catch (ExceptionKode e) {
        e.showMessageNovel();
      } catch (ExceptionNama e) {
        e.showMessage();
      } catch (ExceptionNomor e) {
        e.showMessageNovel();
      }
    } catch (ExceptionHarga e) {
      e.showMessage();
    } catch (ExceptionJudul e) {
      e.showMessage();
    } catch (ExceptionKode e) {
      e.showMessageJurnal();
    } catch (ExceptionNama e) {
      e.showMessage();
    } catch (ExceptionNomor e) {
      e.showMessageJurnal();
    }

  }

}

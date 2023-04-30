package gd6_d_11385;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GD6_D_11385 {
  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String namaPerpus, alamatPerpus, namaPena, email, namaJurusan, kodeJurusan, judulBuku, ISBN;
    int menu;

    try {
      do {
        System.out.println("[ Menu ]");
        System.out.println("1. Relasi Agregasi dan Asosiasi");
        System.out.println("2. Relasi Komposisi");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu: ");
        menu = Integer.parseInt(br.readLine());

        switch (menu) {
          case 1:
            System.out.println("[ Relasi Agregasi dan Asosiasi ]");
            System.out.print("Nama Perpustakaan: ");
            namaPerpus = br.readLine();
            System.out.print("Alamat Perpustakaan: ");
            alamatPerpus = br.readLine();
            Perpustakaan perpus = new Perpustakaan(namaPerpus, alamatPerpus);

            for (int i = 0; i < 2; i++) {
              System.out.println("\t[ Buku ke-" + (i + 1) + " ]");
              System.out.print("\tJudul Buku: ");
              judulBuku = br.readLine();
              System.out.print("\tISBN: ");
              ISBN = br.readLine();
              Buku buku = new Buku(judulBuku, ISBN);
              perpus.addBuku(buku);

              for (int j = 0; j < 2; j++) {
                System.out.println("\t\t[ Penulis ke-" + (j + 1) + " ]");
                System.out.print("\t\tNama Penulis: ");
                namaPena = br.readLine();
                System.out.print("\t\tEmail: ");
                email = br.readLine();
                System.out.print("\t\tNama Jurusan: ");
                namaJurusan = br.readLine();
                System.out.print("\t\tKode Jurusan: ");
                kodeJurusan = br.readLine();
                Jurusan jurusan = new Jurusan(namaJurusan, kodeJurusan);
                Penulis penulis = new Penulis(namaPena, email);
                buku.addPenulis(penulis);
              }
            }
            perpus.showPerpustakaan(menu);
            break;
          case 2:
            System.out.println("[ Relasi Komposisi ]");
            System.out.print("Nama Fakultas: ");
            String namaFak = br.readLine();
            System.out.print("Kode Fakultas: ");
            String kodeFak = br.readLine();
            Fakultas fakultas = new Fakultas(namaFak, kodeFak);
            for (int i = 0; i < 2; i++) {
              System.out.println("\t[ Jurusan ke-" + (i + 1) + " ]");
              System.out.print("\tNama Jurusan: ");
              namaJurusan = br.readLine();
              System.out.print("\tKode Jurusan: ");
              kodeJurusan = br.readLine();
              fakultas.addJurusan(namaJurusan, kodeJurusan);
            }
            fakultas.showFakultas();
            break;
          case 0:
            System.out.println("Keluar");
            break;
          default:
            System.out.println("Menu tidak tersedia!");
            break;
        }
      } while (menu != 0);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}

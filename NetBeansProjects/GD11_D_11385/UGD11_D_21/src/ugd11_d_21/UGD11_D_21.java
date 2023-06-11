package ugd11_d_21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UGD11_D_21 {
  private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws IOException {
    System.out.println("[ Input Kantor ]");
    System.out.println("Nama Kantor: ");
    String namaKantor = br.readLine();
    System.out.println("Nama Kepala Kantor: ");
    String namaKepalaKantor = br.readLine();
    System.out.println("Jam Pelayanan Kantor: ");
    String jamPelayananKantor = br.readLine();
    Kantor K1 = new Kantor(namaKantor, namaKepalaKantor, jamPelayananKantor);

    System.out.println("[ Input Perpustakaan ] ");
    System.out.println("Nama Perpustakaan: ");
    String namaPerpus = br.readLine();
    System.out.println("Alamat Perpustakaan: ");
    String alamatPerpus = br.readLine();
    Perpustakaan P1 = new Perpustakaan(namaPerpus, alamatPerpus);
    Unit U1 = new Unit(K1, P1);

    System.out.println("[ Input Mahasiswa ]");
    System.out.print("Nama pengunjung: ");
    String namaPengunjung = br.readLine();
    System.out.print("Nomor identitas: ");
    String nomorIdentitas = br.readLine();
    System.out.print("Tahun masuk (yyyy): ");
    int tahunMasuk = Integer.parseInt(br.readLine());
    System.out.print("Semester: ");
    int semester = Integer.parseInt(br.readLine());
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    System.out.print("Tanggal peminjaman (dd/MM/yyyy): ");
    String date = br.readLine();
    LocalDate tanggalPeminjaman = LocalDate.parse(date, formatter);
    System.out.print("Tanggal pengembalian (dd/MM/yyyy): ");
    date = br.readLine();
    LocalDate tanggalPengembalian = LocalDate.parse(date, formatter);
    Mahasiswa M1 = new Mahasiswa(tanggalPeminjaman, tanggalPengembalian, namaPengunjung, nomorIdentitas, tahunMasuk, semester);

//    System.out.println("[ Input Dosen ]");
//    System.out.println("Nama pengunjung: ");
//    namaPengunjung = br.readLine();
//    System.out.println("Nomor identitas: ");
//    nomorIdentitas = br.readLine();
//    System.out.println("Asal prodi: ");
//    String asalProdi = br.readLine();
//    System.out.println("Lama bekerja (tahun): ");
//    int lamaBekerja = Integer.parseInt(br.readLine());
//    System.out.print("Tanggal peminjaman (dd/MM/yyyy): ");
//    date = br.readLine();
//    tanggalPeminjaman = LocalDate.parse(date, formatter);
//    System.out.print("Tanggal pengembalian (dd/MM/yyyy): ");
//    date = br.readLine();
//    tanggalPengembalian = LocalDate.parse(date, formatter);
//    Dosen D1 = new Dosen(tanggalPeminjaman, tanggalPengembalian, namaPengunjung, nomorIdentitas, asalProdi, lamaBekerja);
//
//    System.out.println("[ Input Pemustaka Luar ]");
//    System.out.println("Nama Pengunjung: ");
//    namaPengunjung = br.readLine();
//    System.out.println("Nomor Identitas: ");
//    nomorIdentitas = br.readLine();
//    System.out.println("Asal Institusi: ");
//    String asalInstitusi = br.readLine();
//    System.out.println("Asal Daerah Pemustaka: ");
//    String asalDaerah = br.readLine();
//    System.out.print("Tanggal peminjaman (dd/MM/yyyy): ");
//    date = br.readLine();
//    tanggalPeminjaman = LocalDate.parse(date, formatter);
//    System.out.print("Tanggal pengembalian (dd/MM/yyyy): ");
//    date = br.readLine();
//    tanggalPengembalian = LocalDate.parse(date, formatter);
//    PemustakaLuar PL1 = new PemustakaLuar(tanggalPeminjaman, tanggalPengembalian, namaPengunjung, nomorIdentitas, asalInstitusi, asalDaerah);

    U1.getPerpustakaan().addPengunjung(M1);
//    U1.getPerpustakaan().addPengunjung(D1);
//    U1.getPerpustakaan().addPengunjung(PL1);

    System.out.println("\t=== Tampil Data ===");
    U1.getKantor().showKantor();
    U1.getPerpustakaan().showPerpustakaan();

  }
}

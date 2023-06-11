package ugd11_d_21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UGD11_D_21 {
  private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws IOException {
    System.out.println("[[ Input ]]");
    System.out.println("[ Input Kantor ]");
    System.out.print("Nama Kantor: ");
    String namaKantor = br.readLine();
    System.out.print("Nama Kepala Kantor: ");
    String namaKepalaKantor = br.readLine();
    System.out.print("Jam Pelayanan Kantor: ");
    String jamPelayananKantor = br.readLine();
    Kantor K1 = new Kantor(namaKantor, namaKepalaKantor, jamPelayananKantor);

    System.out.println();

    System.out.println("[ Input Perpustakaan ] ");
    System.out.print("Nama Perpustakaan: ");
    String namaPerpus = br.readLine();
    System.out.print("Alamat Perpustakaan: ");
    String alamatPerpus = br.readLine();
    Perpustakaan P1 = new Perpustakaan(namaPerpus, alamatPerpus);
    Unit U1 = new Unit(K1, P1);

    System.out.println();

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

    System.out.println();

    System.out.println("[ Input Dosen ]");
    System.out.print("Nama pengunjung: ");
    namaPengunjung = br.readLine();
    System.out.print("Nomor identitas: ");
    nomorIdentitas = br.readLine();
    System.out.print("Asal prodi: ");
    String asalProdi = br.readLine();
    System.out.print("Lama bekerja (tahun): ");
    int lamaBekerja = Integer.parseInt(br.readLine());
    System.out.print("Tanggal peminjaman (dd/MM/yyyy): ");
    date = br.readLine();
    tanggalPeminjaman = LocalDate.parse(date, formatter);
    System.out.print("Tanggal pengembalian (dd/MM/yyyy): ");
    date = br.readLine();
    tanggalPengembalian = LocalDate.parse(date, formatter);
    Dosen D1 = new Dosen(tanggalPeminjaman, tanggalPengembalian, namaPengunjung, nomorIdentitas, asalProdi, lamaBekerja);

    System.out.println();

    System.out.println("[ Input Pemustaka Luar ]");
    System.out.print("Nama Pengunjung: ");
    namaPengunjung = br.readLine();
    System.out.print("Nomor Identitas: ");
    nomorIdentitas = br.readLine();
    System.out.print("Asal Institusi: ");
    String asalInstitusi = br.readLine();
    System.out.print("Asal Daerah Pemustaka: ");
    String asalDaerah = br.readLine();
    System.out.print("Tanggal peminjaman (dd/MM/yyyy): ");
    date = br.readLine();
    tanggalPeminjaman = LocalDate.parse(date, formatter);
    System.out.print("Tanggal pengembalian (dd/MM/yyyy): ");
    date = br.readLine();
    tanggalPengembalian = LocalDate.parse(date, formatter);
    PemustakaLuar PL1 = new PemustakaLuar(tanggalPeminjaman, tanggalPengembalian, namaPengunjung, nomorIdentitas, asalInstitusi, asalDaerah);

    U1.getPerpustakaan().addPengunjung(M1);
    U1.getPerpustakaan().addPengunjung(D1);
    U1.getPerpustakaan().addPengunjung(PL1);

    System.out.println();
    System.out.println("[[ Output ]]");
    System.out.println("[ Data Kantor ]");
    U1.getKantor().showKantor();
    System.out.println();

    System.out.println("[ Data Perpustakaan ]");
    U1.getPerpustakaan().showPerpustakaan();
    System.out.println();

    System.out.println("[ Data Pengunjung ]");
    U1.getPerpustakaan().showPengunjung();

  }
}

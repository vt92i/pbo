import java.util.Arrays;

public class KelasTahanan {
    private final String namaKelas;
    private final int lamaVonis;
    private final String[] tuntutan;
    private final String[] fasilitas;
    private final String lokasiLapas;

    public KelasTahanan(String namaKelas, int lamaVonis, String[] tuntutan, String[] fasilitas, String lokasiLapas) {
        this.namaKelas = namaKelas;
        this.lamaVonis = lamaVonis;
        this.tuntutan = tuntutan;
        this.fasilitas = fasilitas;
        this.lokasiLapas = lokasiLapas;
    }

    public void penempatanTahanan() {
        System.out.println("Penempatan Tahanan");
    }

    public void membedakanHukuman() {
        System.out.println("Membedakan Hukuman");
    }

    public void print() {
        System.out.println("Nama Kelas : " + namaKelas);
        System.out.println("Lama Vonis : " + lamaVonis);
        System.out.println("Tuntutan : " + Arrays.toString(tuntutan));
        System.out.println("Fasilitas : " + Arrays.toString(fasilitas));
        System.out.println("Lokasi Lapas : " + lokasiLapas);
    }
}

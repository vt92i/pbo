package GD12_D_11385_2;

public class IT extends Observer {
  private final int jumlahProjek;

  public IT(float gaji, int jumlahProjek, String namaPgw, Perusahaan model) {
    super(model, gaji, namaPgw);
    this.jumlahProjek = jumlahProjek;
  }

  @Override
  public void update(float bonus) {
    float tempGaji = gaji;
    gaji += bonus * (jumlahProjek + 1);
    System.out.println(namaPgw + " -- Gaji sebelum: " + tempGaji + " Gaji sesudah: " + gaji);
  }
}

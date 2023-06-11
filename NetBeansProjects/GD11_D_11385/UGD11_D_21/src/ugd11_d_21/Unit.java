package ugd11_d_21;

public class Unit {
  private final Kantor kantor;
  private final Perpustakaan perpustakaan;

  public Unit(Kantor kantor, Perpustakaan perpustakaan) {
    this.kantor = kantor;
    this.perpustakaan = perpustakaan;
  }

  public Kantor getKantor() {
    return kantor;
  }

  public Perpustakaan getPerpustakaan() {
    return perpustakaan;
  }
}

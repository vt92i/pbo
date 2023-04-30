package gd8_d_11385;

import Exception.InputNegativeException;
import Exception.InvalidPanjangLebarException;

public class PersegiPanjang {
  private final double panjang, lebar;

  public PersegiPanjang(double panjang, double lebar) throws InvalidPanjangLebarException, InputNegativeException {
    if (panjang < 0 || lebar < 0) {
      throw new InvalidPanjangLebarException();
    }
    if (panjang == 0 || lebar == 0) {
      throw new InputNegativeException();
    }
    this.panjang = panjang;
    this.lebar = lebar;
  }

  public void showData() {
    System.out.println("Panjang: " + panjang);
    System.out.println("Lebar: " + lebar);
  }
}

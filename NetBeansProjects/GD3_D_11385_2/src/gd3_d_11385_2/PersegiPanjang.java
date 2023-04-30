/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gd3_d_11385_2;

/**
 *
 * @author fikaa
 */
public class PersegiPanjang {

  private double panjang, lebar;

  public PersegiPanjang() {
    this.panjang = 15.0;
    this.lebar = 5.0;
  }

  public PersegiPanjang(double panjang, double lebar) {
    this.panjang = panjang;
    this.lebar = lebar;
  }

  public double getPanjang() {
    return panjang;
  }

  public void setPanjang(double panjang) {
    this.panjang = panjang;
  }

  public double getLebar() {
    return lebar;
  }

  public void setLebar(double lebar) {
    this.lebar = lebar;
  }

  public double luas() {
    return this.panjang * this.lebar;
  }

  public double keliling() {
    return 2 * (this.panjang + this.lebar);
  }

  public void print() {
    System.out.println("Panjang : " + this.panjang);
    System.out.println("Lebar : " + this.lebar);
    System.out.println("Keliling : " + this.keliling());
    System.out.println("Luas : " + this.luas());
  }
}

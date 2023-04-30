/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gd3_d_11385_2;

import java.util.Scanner;

/**
 *
 * @author fikaa
 */
public class GD3_D_11385_2 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    double panjang, lebar;
    Scanner reader = new Scanner(System.in);

    PersegiPanjang PP1 = new PersegiPanjang();
    PersegiPanjang PP2 = new PersegiPanjang(68.2, 35.3);

    System.out.println("--- Persegi Panjang PP1 Lama ---");
    PP1.print();

    System.out.println("--- Persegi Panjang PP2 Lama ---");
    PP2.print();

    System.out.println("--- Input Panjang dan Lebar BARU ---");
    System.out.print("Panjang : ");
    panjang = reader.nextDouble();
    System.out.print("Lebar : ");
    lebar = reader.nextDouble();

    System.out.println("--- Persegi Panjang PP1 Baru ---");
    PP1.print();

    System.out.println("--- Persegi Panjang PP2 Baru ---");
    PP2.setPanjang(panjang);
    PP2.setLebar(lebar);
    PP2.print();
  }

}

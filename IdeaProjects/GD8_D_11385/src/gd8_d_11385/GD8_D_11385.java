/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/GD8_D_11385.java to edit this template
 */
package gd8_d_11385;

import Exception.InputNegativeException;
import Exception.InvalidPanjangLebarException;

import java.io.BufferedReader;

/**
 * @author fikaa
 */
public class GD8_D_11385 {

  /**
   * @param args the command line arguments
   */

  public static BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));

  public static void main(String[] args) {
    double panjang, lebar;

    try {
      System.out.print("Masukkan panjang: ");
      panjang = Double.parseDouble(br.readLine());
      System.out.print("Masukkan lebar: ");
      lebar = Double.parseDouble(br.readLine());
      PersegiPanjang pp = new PersegiPanjang(panjang, lebar);
      pp.showData();
    } catch (InputNegativeException e) {
      e.showMessage();
    } catch (InvalidPanjangLebarException e) {
      e.showMessage();
    } catch (Exception e) {
      System.out.println("Welcome to the jungle!");
    } finally {
      System.out.println("The Final Countdown!");
    }
  }

}

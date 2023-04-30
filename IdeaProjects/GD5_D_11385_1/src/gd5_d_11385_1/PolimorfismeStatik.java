/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gd5_d_11385_1;

/**
 * @author fikaa
 */
public class PolimorfismeStatik {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Mahasiswa mhs0 = new Mahasiswa();
    Mahasiswa mhs1 = new Mahasiswa("210711385");
    Mahasiswa mhs2 = new Mahasiswa("210711385", "Benidiktus Violaz Morello Anjolie");

    System.err.println("[ Overloading Constructor ]");
    System.err.println("Default Constructor");
    mhs0.showMahasiswa();

    System.err.println("Constructor with 1 parameter (npm)");
    mhs1.showMahasiswa();

    System.err.println("Constructor with 2 parameter (npm, nama)");
    mhs2.showMahasiswa();

    System.err.println("[ Overloading Method ]");
    Summary summary = new Summary();

    int totalSKS = summary.count(3, 4, 2);
    System.err.println("Total SKS: " + totalSKS);
    System.err.println("Total Biaya Variable: " + summary.count(totalSKS, 250000));
  }

}

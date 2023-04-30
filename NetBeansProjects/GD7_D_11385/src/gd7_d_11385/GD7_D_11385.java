/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gd7_d_11385;

/**
 * @author fikaa
 */
public class GD7_D_11385 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here

    Generic<String> G1 = new Generic<>("Motor");
    System.out.println("Data String adalah " + G1.getValue());

    Generic<Integer> G2 = new Generic<>(2012);
    System.out.println("Data Integer adalah " + G2.getValue());

    Generic<Double> G3 = new Generic<>(88.8);
    System.out.println("Data Double adalah " + G3.getValue());

    Generic<Float> G4 = new Generic<>(87.9f);
    System.out.println("Data Float adalah " + G4.getValue());

    Generic<Boolean> G5 = new Generic<>(true);
    System.out.println("Data Boolean adalah " + G5.getValue());

    Generic<Character> G6 = new Generic<>('A');
    System.out.println("Data Character adalah " + G6.getValue());

    PairTwo<String, Integer> P1 = new PairTwo<>("Motor", 2013);
    System.out.println("\nSalah satu kendaraan beroda dua adalah " + P1.getValue1() + "\nKendaraan tersebut dibuat pada tahun " + P1.getValue2());

    Mobil mobil = new Mobil("Sedan", 4);
    PairTwo<String, Mobil> P2 = new PairTwo<>("Empat", mobil);
    System.out.println("\nMobil itu beroda " + P2.getValue1() + ", berjenis " + P2.getValue2().getNama() + ", dan memiliki kapasitas " + P2.getValue2().getKapasitas() + " penumpang");

    PairThree<String, Character, Double> PT3 = new PairThree<>("enam", 'B', 200.1, 2013);
    System.out.println("\nKendaraan itu beroda " + PT3.getValue1() + ", berplat " + PT3.getValue2() + ", memiliki bobot " + PT3.getValue3() + " dan dibuat pada tahun " + PT3.getValue4());
  }
}

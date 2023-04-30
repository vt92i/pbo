/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment1_11385;

/**
 *
 * @author fikaa
 */
public class Assignment1_11385 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    String namaLengkap = "Benidiktus Violaz Morello Anjolie";
    int npm = 210711385;
    char kelas = 'D';
    short umur = 20;

    printInfo(namaLengkap, npm, kelas, umur);
    printQuote();
  }

  public static void printInfo(String namaLengkap, int npm, char kelas, short umur) {
    System.out.printf("Saya %s \n", namaLengkap);
    System.out.printf("dengan NPM: %d dari PBO %c berumur %d tahun berjanji, \n", npm, kelas, umur);
    System.out.println("akan mengikuti mata kuliah Pemrograman Berorientasi Objek");
    System.out.println("semester ini dengan giat dan penuh semangat,");
    System.out.println("serta akan menjauh dari segala tindak kecurangan.");
  }

  public static void printQuote() {
    for (int i = 0; i < 5; i++) {
      System.out.println("Aku Pasti Bisa, Semangat!");
    }
  }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 * @author Lenovo
 */
public class ExceptionKode extends Exception {
  public void showMessageNovel() {
    System.out.println("[!] Kode Novel harus ada unsur 'NOV-' [!]");
  }

  public void showMessageJurnal() {
    System.out.println("[!] Kode Jurnal harus ada unsur 'JUR-' [!]");
  }
}

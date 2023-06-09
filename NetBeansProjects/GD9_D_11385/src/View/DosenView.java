/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Control.DosenControl;
import Exception.InputEmptyException;
import Exception.NoIndukDosenException;
import Model.Dosen;
import javax.swing.JOptionPane;

/**
 *
 * @author fikaa
 */
public final class DosenView extends javax.swing.JFrame {

  private final DosenControl dosenControl;
  String action = null;

  /**
   * Creates new form DosenView
   */
  public DosenView() {
    initComponents();
    setComponent(false);
    setEditDeleteBtn(false);
    dosenControl = new DosenControl();
    showDosen();
  }

  public void setComponent(boolean value) {
    inputNID.setEnabled(value);
    inputNama.setEnabled(value);
    inputEmail.setEnabled(value);
    inputNoHandphone.setEnabled(value);

    saveButton.setEnabled(value);
    discardButton.setEnabled(value);
  }

  public void setEditDeleteBtn(boolean value) {
    editButton.setEnabled(value);
    deleteButton.setEnabled(value);
  }

  public void clearText() {
    inputNID.setText("");
    inputNama.setText("");
    inputEmail.setText("");
    inputNoHandphone.setText("");
    textInput.setText("");
  }

  public void showDosen() {
    resultArea.setText(dosenControl.showAllDataDosen());
  }

  public void inputKosongException() throws InputEmptyException {
    if (inputNID.getText().isEmpty() || inputNama.getText().isEmpty() || inputEmail.getText().isEmpty() || inputNoHandphone.getText().isEmpty()) {
      throw new InputEmptyException();
    }
  }

  public void noIndukDosenException() throws NoIndukDosenException {
    if (inputNID.getText().length() != 5) {
      throw new NoIndukDosenException();
    }
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel2 = new javax.swing.JLabel();
    addButton = new javax.swing.JButton();
    editButton = new javax.swing.JButton();
    deleteButton = new javax.swing.JButton();
    searchButton = new javax.swing.JButton();
    textInput = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    inputNID = new javax.swing.JTextField();
    jLabel5 = new javax.swing.JLabel();
    inputNama = new javax.swing.JTextField();
    jLabel6 = new javax.swing.JLabel();
    inputEmail = new javax.swing.JTextField();
    jLabel7 = new javax.swing.JLabel();
    inputNoHandphone = new javax.swing.JTextField();
    saveButton = new javax.swing.JButton();
    discardButton = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    resultArea = new javax.swing.JTextArea();
    jLabel1 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("GD9_D_11385");
    setResizable(false);

    jLabel2.setText("DOSEN");

    addButton.setText("Tambah");
    addButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        addButtonActionPerformed(evt);
      }
    });

    editButton.setText("Ubah");
    editButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        editButtonActionPerformed(evt);
      }
    });

    deleteButton.setText("Hapus");
    deleteButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        deleteButtonActionPerformed(evt);
      }
    });

    searchButton.setText("Cari");
    searchButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        searchButtonActionPerformed(evt);
      }
    });

    jLabel3.setText("D O S E N");

    jLabel4.setText("Nomor Induk Dosen");

    jLabel5.setText("Nama");

    jLabel6.setText("Email");

    jLabel7.setText("No Handphone");

    saveButton.setText("Simpan");
    saveButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        saveButtonActionPerformed(evt);
      }
    });

    discardButton.setText("Batal");
    discardButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        discardButtonActionPerformed(evt);
      }
    });

    resultArea.setEditable(false);
    resultArea.setColumns(20);
    resultArea.setRows(5);
    jScrollPane1.setViewportView(resultArea);

    jLabel1.setText("I TRIED SO HARD, THIS IS THE BEST I CAN DO");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel3)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel2)
                .addContainerGap())
              .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                  .addGroup(layout.createSequentialGroup()
                    .addComponent(addButton)
                    .addGap(18, 18, 18)
                    .addComponent(editButton)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textInput, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(searchButton)
                    .addGap(15, 15, 15))))))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(0, 127, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                  .addComponent(inputNama, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(inputNID, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(inputNoHandphone, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(deleteButton))
                .addGap(219, 219, 219)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 938, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))))))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(saveButton)
        .addGap(18, 18, 18)
        .addComponent(discardButton)
        .addGap(46, 46, 46))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(48, 48, 48)
        .addComponent(jLabel2)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(addButton)
          .addComponent(editButton)
          .addComponent(deleteButton)
          .addComponent(searchButton)
          .addComponent(textInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(37, 37, 37)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(jLabel4))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(inputNID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(18, 18, 18)
            .addComponent(jLabel5)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(inputNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addGap(35, 35, 35)
            .addComponent(jLabel1)))
        .addGap(18, 18, 18)
        .addComponent(jLabel6)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(jLabel7)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(inputNoHandphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(saveButton)
          .addComponent(discardButton))
        .addGap(18, 18, 18)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(16, 16, 16))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
    // TODO add your handling code here:
    setComponent(true);
    clearText();
    textInput.setText("");
    action = "Tambah";
  }//GEN-LAST:event_addButtonActionPerformed

  private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
    // TODO add your handling code here:
    setComponent(true);
    inputNID.setEnabled(false);
    action = "Ubah";
  }//GEN-LAST:event_editButtonActionPerformed

  private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
    // TODO add your handling code here:
    int getAnswer = JOptionPane.showConfirmDialog(rootPane, "Yakin hapus?", "Konfirmasi", JOptionPane.YES_NO_OPTION);

    if (getAnswer == JOptionPane.YES_OPTION) {
      try {
        dosenControl.deleteDataDosen(inputNID.getText());
        clearText();
        showDosen();
        JOptionPane.showMessageDialog(null, "Data dihapus!!!");
      } catch (Exception e) {
        System.out.println("Error : " + e.getMessage());
      }
    }
  }//GEN-LAST:event_deleteButtonActionPerformed

  private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
    // TODO add your handling code here:

    setEditDeleteBtn(true);
    setComponent(false);

    try {
      Dosen dosen = dosenControl.fetchDataDosen(textInput.getText());
      if (dosen == null) {
        clearText();
        setEditDeleteBtn(false);
        JOptionPane.showConfirmDialog(null, "Data not found!", "Konfirmasi", JOptionPane.DEFAULT_OPTION);
      } else {
        inputNID.setText(dosen.getNomorIndukDosen());
        inputNama.setText(dosen.getNama());
        inputEmail.setText(dosen.getEmail());
        inputNoHandphone.setText(dosen.getNoHandphone());
      }
    } catch (Exception e) {
      System.out.println("Error : " + e.getMessage());
    }
  }//GEN-LAST:event_searchButtonActionPerformed

  private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
    // TODO add your handling code here:

    try {
      inputKosongException();
      noIndukDosenException();

      Dosen d = new Dosen(inputNID.getText(), inputNama.getText(), inputEmail.getText(), inputNoHandphone.getText());
      if (action.equals("Tambah")) {
        dosenControl.insertDataDosen(d);
      } else {
        dosenControl.updateDataDosen(d, inputNID.getText());
      }
      clearText();
      showDosen();
      setComponent(false);
      setEditDeleteBtn(false);

    } catch (InputEmptyException e) {
      JOptionPane.showMessageDialog(this, e.getMessage());
    } catch (NoIndukDosenException e) {
      JOptionPane.showMessageDialog(this, e.getMessage());

    }
  }//GEN-LAST:event_saveButtonActionPerformed

  private void discardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discardButtonActionPerformed
    // TODO add your handling code here:
    setComponent(false);
    setEditDeleteBtn(false);
    clearText();
  }//GEN-LAST:event_discardButtonActionPerformed

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(DosenView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(DosenView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(DosenView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(DosenView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new DosenView().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton addButton;
  private javax.swing.JButton deleteButton;
  private javax.swing.JButton discardButton;
  private javax.swing.JButton editButton;
  private javax.swing.JTextField inputEmail;
  private javax.swing.JTextField inputNID;
  private javax.swing.JTextField inputNama;
  private javax.swing.JTextField inputNoHandphone;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTextArea resultArea;
  private javax.swing.JButton saveButton;
  private javax.swing.JButton searchButton;
  private javax.swing.JTextField textInput;
  // End of variables declaration//GEN-END:variables
}

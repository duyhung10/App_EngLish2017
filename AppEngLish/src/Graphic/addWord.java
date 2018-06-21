/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphic;

import Vocabulary.Dictionary;
import Vocabulary.Result;
import Vocabulary.Word;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author LeDuyHung
 */
public class addWord extends javax.swing.JFrame {

    /**
     * Creates new form addWord
     */
    Dictionary dic;
    
    public addWord(Dictionary dic) {
        this.dic = dic;
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbWord = new javax.swing.JLabel();
        lbMeaning = new javax.swing.JLabel();
        tfWord = new javax.swing.JTextField();
        tfMeaning = new javax.swing.JTextField();
        btNew = new javax.swing.JButton();
        btSave = new javax.swing.JButton();
        lbCategory = new javax.swing.JLabel();
        tfCategory = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Word");
        setLocation(new java.awt.Point(435, 100));

        lbWord.setBackground(new java.awt.Color(153, 255, 153));
        lbWord.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbWord.setText("Word");
        lbWord.setOpaque(true);

        lbMeaning.setBackground(new java.awt.Color(153, 255, 153));
        lbMeaning.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMeaning.setText("Meaning");
        lbMeaning.setOpaque(true);

        btNew.setMnemonic('N');
        btNew.setText("New");
        btNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewActionPerformed(evt);
            }
        });

        btSave.setMnemonic('S');
        btSave.setText("Save");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        lbCategory.setBackground(new java.awt.Color(153, 255, 153));
        lbCategory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCategory.setText("Category");
        lbCategory.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbWord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbMeaning, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfMeaning, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                    .addComponent(tfWord)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btNew, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfCategory))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lbCategory, lbMeaning, lbWord});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tfMeaning, tfWord});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btNew, btSave});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbWord, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(tfWord, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMeaning, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMeaning, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbCategory, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(tfCategory))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNew, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lbCategory, lbMeaning, lbWord, tfMeaning, tfWord});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btNew, btSave});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        try {
            Word word = new Word(tfWord.getText(), tfMeaning.getText(), tfCategory.getText());
            if(dic.checkWord(word)){
                JOptionPane.showMessageDialog(rootPane, "This word has been exist!!");
                btSave.disable();
            }
            else{
                Result saveResult = dic.SaveWord(word);
                if(saveResult.IsSuccess){
                    JOptionPane.showMessageDialog(rootPane, "Data have been save !");
                    btSave.disable();
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Cần nhập đầy đủ các thông tin");
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(addWord.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btSaveActionPerformed

    private void btNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewActionPerformed
        // TODO add your handling code here:
        btSave.enable();
        tfWord.setText("");
        tfMeaning.setText("");
        tfCategory.setText("");
    }//GEN-LAST:event_btNewActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btNew;
    private javax.swing.JButton btSave;
    private javax.swing.JLabel lbCategory;
    private javax.swing.JLabel lbMeaning;
    private javax.swing.JLabel lbWord;
    private javax.swing.JTextField tfCategory;
    private javax.swing.JTextField tfMeaning;
    private javax.swing.JTextField tfWord;
    // End of variables declaration//GEN-END:variables
}

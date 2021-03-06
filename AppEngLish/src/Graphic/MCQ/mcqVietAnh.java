/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphic.MCQ;

import Vocabulary.Dictionary;
import Vocabulary.Word;
import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author LeDuyHung
 */

public class mcqVietAnh extends javax.swing.JFrame {

    /**
     * Creates new form mcqVietAnh
     */
    Dictionary dic;
    private int cauTrlDung;             
    private int tongCauTrl;
    private String answer;
    private ArrayList<Integer> arrayInt;
    
    public mcqVietAnh(Dictionary dic) throws IOException {
        this.dic = dic;
        cauTrlDung = 0;
        tongCauTrl = 0;
        arrayInt = new ArrayList<Integer>();
        initComponents();
        startVA();
    }
    public void startVA() throws IOException{
        String StrDung = Integer.toString(cauTrlDung);
        String StrTong = Integer.toString(tongCauTrl);
        
        lbIntDiem2.setText(StrDung + "/" + StrTong);
        
        Random rd = new Random();

        int quantily = dic.quantilyWord();
        int randomNumMain = 0;
        int randomNum1;
        int randomNum2;
        int randomNum3;

        Word wordMain;
        Word word1;
        Word word2;
        Word word3;
        
        do{
            randomNumMain = rd.nextInt(quantily+1);
        }while(checkInt2(randomNumMain)); // Tránh các câu hỏi trùng lặp

        arrayInt.add(randomNumMain);    // Thêm câu hỏi vừa rồi vào list câu hỏi đã xuất hiện
       

        do{
            randomNum1 = rd.nextInt(quantily+1);
        }while(randomNum1 == randomNumMain);

        do{
            randomNum2 = rd.nextInt(quantily+1);
        }while(randomNum2 == randomNumMain || randomNum2 == randomNum1);

        do{
            randomNum3 = rd.nextInt(quantily+1);
        }while(randomNum3 == randomNumMain || randomNum3 == randomNum2 ||randomNum3 == randomNum1);

        wordMain = dic.returnWord(randomNumMain);
        word1 = dic.returnWord(randomNum1);
        word2 = dic.returnWord(randomNum2);
        word3 = dic.returnWord(randomNum3);

        tfQuestion2.setText(wordMain.Meaning);
        answer = wordMain.Keyword;
        
        int randomNumAnswer;
        randomNumAnswer = rd.nextInt(4);
       
        switch(randomNumAnswer){
            case 0:{
                rbA2.setText(wordMain.Keyword);
                rbB2.setText(word1.Keyword);
                rbC2.setText(word2.Keyword);
                rbD2.setText(word3.Keyword);
                break;
            }
            case 1:{
                rbA2.setText(word1.Keyword);
                rbB2.setText(wordMain.Keyword);
                rbC2.setText(word2.Keyword);
                rbD2.setText(word3.Keyword);
                break;
            }
            case 2:{
                rbA2.setText(word1.Keyword);
                rbB2.setText(word2.Keyword);
                rbC2.setText(wordMain.Keyword);
                rbD2.setText(word3.Keyword);
                break;
            }
            case 3 :{
                rbA2.setText(word1.Keyword);
                rbB2.setText(word2.Keyword);
                rbC2.setText(word3.Keyword);
                rbD2.setText(wordMain.Keyword);
                break;
           }
       }
    }
    // Kiểm tra số a đã có trong ArrayList các số đã random chưa.
    public boolean checkInt2(int a){
        for(int i = 0; i < arrayInt.size(); i++){
            if(a == arrayInt.get(i)){
                return true;
            }
        }
        return false;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        rbD2 = new javax.swing.JRadioButton();
        btAnswer2 = new javax.swing.JButton();
        lbIntDiem2 = new javax.swing.JLabel();
        lbStrDiem2 = new javax.swing.JLabel();
        lbThongBao2 = new javax.swing.JLabel();
        lbCca2 = new javax.swing.JLabel();
        btExit2 = new javax.swing.JButton();
        tfQuestion2 = new javax.swing.JTextField();
        rbA2 = new javax.swing.JRadioButton();
        rbB2 = new javax.swing.JRadioButton();
        rbC2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mutichoose Questions");
        setLocation(new java.awt.Point(815, 100));

        rbD2.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(rbD2);
        rbD2.setText("D");

        btAnswer2.setBackground(new java.awt.Color(204, 204, 255));
        btAnswer2.setText("ANSWER");
        btAnswer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnswer2ActionPerformed(evt);
            }
        });

        lbIntDiem2.setBackground(new java.awt.Color(255, 204, 204));
        lbIntDiem2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIntDiem2.setOpaque(true);

        lbStrDiem2.setBackground(new java.awt.Color(255, 204, 255));
        lbStrDiem2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbStrDiem2.setForeground(new java.awt.Color(51, 51, 51));
        lbStrDiem2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbStrDiem2.setText("Productivity");
        lbStrDiem2.setOpaque(true);

        lbThongBao2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbThongBao2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbCca2.setBackground(new java.awt.Color(204, 255, 204));
        lbCca2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbCca2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCca2.setText("Choose correct answer");
        lbCca2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));
        lbCca2.setOpaque(true);

        btExit2.setText("EXIT");
        btExit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExit2ActionPerformed(evt);
            }
        });

        tfQuestion2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        rbA2.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(rbA2);
        rbA2.setText("A");
        rbA2.setToolTipText("");

        rbB2.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(rbB2);
        rbB2.setText("B");

        rbC2.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(rbC2);
        rbC2.setText("C");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MCQ VIỆT ANH");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbCca2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfQuestion2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 30, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(rbA2, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                        .addComponent(rbC2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(37, 37, 37)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(rbB2, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                        .addComponent(rbD2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbStrDiem2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbIntDiem2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(41, 41, 41)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btExit2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btAnswer2, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))))
                            .addComponent(lbThongBao2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {rbB2, rbD2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbCca2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfQuestion2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbA2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbB2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbD2)
                    .addComponent(rbC2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbThongBao2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btAnswer2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                        .addComponent(lbIntDiem2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                        .addComponent(lbStrDiem2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btExit2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {rbA2, rbB2, rbD2});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAnswer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnswer2ActionPerformed
        // TODO add your handling code here:

        if(rbA2.isSelected()){
            if(rbA2.getText().equals(answer)){
                cauTrlDung++;
                tongCauTrl++;
                lbThongBao2.setText("CORRECT ANSWER");
                lbThongBao2.setForeground(Color.GREEN);
                try {
                    startVA();
                } catch (IOException ex) {
                    Logger.getLogger(mcqVietAnh.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
                lbThongBao2.setText("WRONG ANSWER");
                lbThongBao2.setForeground(Color.RED);
                tongCauTrl++;
                try {
                    startVA();
                } catch (IOException ex) {
                    Logger.getLogger(mcqVietAnh.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }
        else if(rbB2.isSelected()){
            if(rbB2.getText().equals(answer)){
                cauTrlDung++;
                tongCauTrl++;
                lbThongBao2.setText("CORRECT ANSWER");
                lbThongBao2.setForeground(Color.GREEN);
                try {
                    startVA();
                } catch (IOException ex) {
                    Logger.getLogger(mcqVietAnh.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
                
                tongCauTrl++;
                lbThongBao2.setText("WRONG ANSWER");
                lbThongBao2.setForeground(Color.RED);
                try {
                    startVA();
                } catch (IOException ex) {
                    Logger.getLogger(mcqVietAnh.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else if(rbC2.isSelected()){
            if(rbC2.getText().equals(answer)){
                cauTrlDung++;
                tongCauTrl++;
                lbThongBao2.setText("CORRECT ANSWER");
                lbThongBao2.setForeground(Color.GREEN);
                try {
                    startVA();
                } catch (IOException ex) {
                    Logger.getLogger(mcqVietAnh.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            else{
               
                tongCauTrl++;
                lbThongBao2.setText("WRONG ANSWER");
                lbThongBao2.setForeground(Color.RED);
                try {
                    startVA();
                } catch (IOException ex) {
                    Logger.getLogger(mcqVietAnh.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else if(rbD2.isSelected()){
            if(rbD2.getText().equals(answer)){
                cauTrlDung++;
                tongCauTrl++;
                lbThongBao2.setText("CORRECT ANSWER");
                lbThongBao2.setForeground(Color.GREEN);
                try {
                    startVA();
                } catch (IOException ex) {
                    Logger.getLogger(mcqVietAnh.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
                tongCauTrl++;
                lbThongBao2.setText("WRONG ANSWER");
                lbThongBao2.setForeground(Color.RED);
                try {
                    startVA();
                } catch (IOException ex) {
                    Logger.getLogger(mcqVietAnh.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Choose a answer!");
        }
    }//GEN-LAST:event_btAnswer2ActionPerformed

    private void btExit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExit2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btExit2ActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAnswer2;
    private javax.swing.JButton btExit2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbCca2;
    private javax.swing.JLabel lbIntDiem2;
    private javax.swing.JLabel lbStrDiem2;
    private javax.swing.JLabel lbThongBao2;
    private javax.swing.JRadioButton rbA2;
    private javax.swing.JRadioButton rbB2;
    private javax.swing.JRadioButton rbC2;
    private javax.swing.JRadioButton rbD2;
    private javax.swing.JTextField tfQuestion2;
    // End of variables declaration//GEN-END:variables
}

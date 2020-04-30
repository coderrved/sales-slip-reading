/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
package javaapplication3;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javaapplication3.JavaApplication3.degisken;
import static javaapplication3.JavaApplication3.tessOpenCv;
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

*/

/*
public class Dialog extends javax.swing.JDialog{

    DefaultTableModel model;
    
    Baglanti baglanti = new Baglanti();
    public static String getSelectedImage ="";  
    
    
    public Dialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);                     
            initComponents();  
            model = (DefaultTableModel)urunlerTablosu.getModel(); 
            urunleriGoruntule();
            setVisible(true);           
            //urunEkle();
            //urunleriGoruntule();                      
            System.exit(0);             
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        urunlerTablosu = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        isletmeadiArama = new javax.swing.JTextField();
        tarihArama = new javax.swing.JTextField();
        mesaj_yazisi = new java.awt.TextArea();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        fis = new javax.swing.JButton();
        label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        urunlerTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Isletme Adi", "Tarih", "Fis No", "Urunler", "Saat", "KDV", "Toplam"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(urunlerTablosu);
        if (urunlerTablosu.getColumnModel().getColumnCount() > 0) {
            urunlerTablosu.getColumnModel().getColumn(0).setResizable(false);
            urunlerTablosu.getColumnModel().getColumn(1).setResizable(false);
            urunlerTablosu.getColumnModel().getColumn(2).setResizable(false);
            urunlerTablosu.getColumnModel().getColumn(3).setResizable(false);
            urunlerTablosu.getColumnModel().getColumn(4).setResizable(false);
            urunlerTablosu.getColumnModel().getColumn(5).setResizable(false);
            urunlerTablosu.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("ARAMA");

        jLabel2.setText("İsletme Adi: ");

        jLabel3.setText("Tarih:");

        isletmeadiArama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isletmeadiAramaActionPerformed(evt);
            }
        });
        isletmeadiArama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                isletmeadiAramaKeyReleased(evt);
            }
        });

        tarihArama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tarihAramaKeyReleased(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("PARSE");

        jButton1.setText("Parse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        fis.setText("Fis");
        fis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(isletmeadiArama, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tarihArama, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22)
                        .addComponent(mesaj_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGap(322, 322, 322)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fis)
                .addGap(143, 143, 143))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(isletmeadiArama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tarihArama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(mesaj_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fis)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void isletmeadiAramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isletmeadiAramaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isletmeadiAramaActionPerformed
    public void dinamikAra(String ara){
        
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        
        urunlerTablosu.setRowSorter(tr);
        
        tr.setRowFilter(RowFilter.regexFilter(ara));
        
    }
    private void isletmeadiAramaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_isletmeadiAramaKeyReleased
        
        String ara = isletmeadiArama.getText();
        
        dinamikAra(ara);
        
    }//GEN-LAST:event_isletmeadiAramaKeyReleased

    private void tarihAramaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tarihAramaKeyReleased
        
        String ara1 = tarihArama.getText();
        
        dinamikAra(ara1);
        
    }//GEN-LAST:event_tarihAramaKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        mesaj_yazisi.setText(degisken);
        degisken = "";
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void fisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fisActionPerformed
       
        JFileChooser chooser = new JFileChooser();
        int selected = chooser.showOpenDialog(null);
        if(selected == JFileChooser.APPROVE_OPTION){
            File file = chooser.getSelectedFile();
            getSelectedImage = file.getAbsolutePath();           
            ImageIcon imCog = new ImageIcon(getSelectedImage);
            Image imFit = imCog.getImage();
            Image imgFit = imFit.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
            label.setIcon(new ImageIcon(imgFit)); 
            urunEkle();
            urunleriGoruntule();
    }//GEN-LAST:event_fisActionPerformed
    }
   
    public void urunleriGoruntule(){
        
        model.setRowCount(0); // Tabloyu sıfırlamak için
        
        ArrayList<Urunler> urunList = new ArrayList<Urunler>();
        
        urunList = baglanti.urunleriGetir();
        
        if(urunList != null){
            
            for(Urunler urunler : urunList){
                
                Object[] ekle = {urunler.getIsletmeAdi(), urunler.getTarih(), urunler.getFisNo(),
                urunler.getUrunler(), urunler.getSaat(), urunler.getKdv(), urunler.getToplam()};
                
                model.addRow(ekle);
                              
            }
            
        }
        
    }
    
    public void urunEkle(){
        
        ArrayList<String> yeniList = new ArrayList<String>();
        yeniList = tessOpenCv();
        System.out.println("YENİLİST: " + yeniList.get(1));
        baglanti.urunleriEkle(yeniList);
                     
    }
    
   */

    //public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
         /*
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
*/
        /* Create and display the dialog */
    /*
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Dialog dialog = new Dialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
*/
        /*
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fis;
    private javax.swing.JTextField isletmeadiArama;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label;
    private java.awt.TextArea mesaj_yazisi;
    private javax.swing.JTextField tarihArama;
    private javax.swing.JTable urunlerTablosu;
    // End of variables declaration//GEN-END:variables

}

*/
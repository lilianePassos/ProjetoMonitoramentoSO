/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetoindividuallilianep;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.Icon;
/**
 *
 * @author Victor
 */
public class MonitoramentoLiliane extends javax.swing.JFrame {

   
    Random verificaCpu = new Random();
    Random verificaMemoria = new Random();
    Random verificaDisco = new Random();
    /**
     * Creates new form MonitoramentoLiliane
     */
    public MonitoramentoLiliane() {
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

        jPanelBG = new javax.swing.JPanel();
        jPanelCPU = new javax.swing.JPanel();
        lblCpu = new javax.swing.JLabel();
        lblMostraCpu = new javax.swing.JLabel();
        jPanelDisk = new javax.swing.JPanel();
        lblDisco = new javax.swing.JLabel();
        lblMostraDisco = new javax.swing.JLabel();
        jPanelRam = new javax.swing.JPanel();
        lblMemoria = new javax.swing.JLabel();
        lblMostraRam = new javax.swing.JLabel();
        btnVerificar = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        btnVerificarAut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanelBG.setBackground(new java.awt.Color(46, 88, 102));
        jPanelBG.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelBG.setForeground(new java.awt.Color(51, 51, 51));
        jPanelBG.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelBG.setMaximumSize(new java.awt.Dimension(488, 535));
        jPanelBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelCPU.setBackground(new java.awt.Color(39, 75, 86));
        jPanelCPU.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelCPU.setForeground(new java.awt.Color(26, 75, 75));
        jPanelCPU.setToolTipText("");
        jPanelCPU.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblCpu.setBackground(new java.awt.Color(204, 255, 204));
        lblCpu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCpu.setForeground(new java.awt.Color(153, 153, 153));
        lblCpu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCpu.setText("CPU : ");

        lblMostraCpu.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        lblMostraCpu.setForeground(new java.awt.Color(153, 153, 153));
        lblMostraCpu.setText("%");

        javax.swing.GroupLayout jPanelCPULayout = new javax.swing.GroupLayout(jPanelCPU);
        jPanelCPU.setLayout(jPanelCPULayout);
        jPanelCPULayout.setHorizontalGroup(
            jPanelCPULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCPULayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMostraCpu)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanelCPULayout.setVerticalGroup(
            jPanelCPULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCPULayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelCPULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMostraCpu))
                .addGap(81, 81, 81))
        );

        jPanelBG.add(jPanelCPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 210, 50));

        jPanelDisk.setBackground(new java.awt.Color(30, 58, 67));
        jPanelDisk.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelDisk.setToolTipText("");

        lblDisco.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDisco.setForeground(new java.awt.Color(102, 102, 102));
        lblDisco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDisco.setText("DISCO : ");

        lblMostraDisco.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        lblMostraDisco.setForeground(new java.awt.Color(102, 102, 102));
        lblMostraDisco.setText("%");

        javax.swing.GroupLayout jPanelDiskLayout = new javax.swing.GroupLayout(jPanelDisk);
        jPanelDisk.setLayout(jPanelDiskLayout);
        jPanelDiskLayout.setHorizontalGroup(
            jPanelDiskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDiskLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDisco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMostraDisco)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanelDiskLayout.setVerticalGroup(
            jPanelDiskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDiskLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelDiskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDisco)
                    .addComponent(lblMostraDisco))
                .addGap(77, 77, 77))
        );

        jPanelBG.add(jPanelDisk, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 210, 50));

        jPanelRam.setBackground(new java.awt.Color(27, 51, 59));
        jPanelRam.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelRam.setForeground(new java.awt.Color(0, 64, 94));

        lblMemoria.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblMemoria.setForeground(new java.awt.Color(153, 153, 153));
        lblMemoria.setText("Memória Ram:");

        lblMostraRam.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        lblMostraRam.setForeground(new java.awt.Color(153, 153, 153));
        lblMostraRam.setText("%");

        javax.swing.GroupLayout jPanelRamLayout = new javax.swing.GroupLayout(jPanelRam);
        jPanelRam.setLayout(jPanelRamLayout);
        jPanelRamLayout.setHorizontalGroup(
            jPanelRamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMemoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMostraRam)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanelRamLayout.setVerticalGroup(
            jPanelRamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRamLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelRamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMemoria)
                    .addComponent(lblMostraRam))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelBG.add(jPanelRam, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 210, 50));

        btnVerificar.setBackground(new java.awt.Color(25, 49, 56));
        btnVerificar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnVerificar.setForeground(new java.awt.Color(153, 153, 153));
        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });
        jPanelBG.add(btnVerificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 120, 40));

        lblTitle.setBackground(new java.awt.Color(153, 153, 153));
        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(204, 204, 204));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Monitoramento de SO");
        jPanelBG.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 363, -1));

        btnVerificarAut.setBackground(new java.awt.Color(25, 49, 56));
        btnVerificarAut.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnVerificarAut.setForeground(new java.awt.Color(153, 153, 153));
        btnVerificarAut.setText("Verificar Automático");
        btnVerificarAut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarAutActionPerformed(evt);
            }
        });
        jPanelBG.add(btnVerificarAut, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 150, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBG, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBG, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        Double mostra1 = verificaCpu.nextDouble()* 100;
        lblMostraCpu.setText(String.format("%.1f", mostra1)+ "%");
        
          Double mostra2 = verificaDisco.nextDouble()* 100;
        lblMostraDisco.setText(String.format("%.1f", mostra2)+ "%");
        
          Double mostra3 = verificaMemoria.nextDouble()* 100;
        lblMostraRam.setText(String.format("%.1f", mostra3)+ "%");
        
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void btnVerificarAutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarAutActionPerformed
       int delay = 2500;
       
       int intervalo = 2000;
       
    Timer tempo = new Timer();
    tempo.scheduleAtFixedRate(new TimerTask() {
           
           public void run() {
                Double mostra1 = verificaCpu.nextDouble()* 100;
        lblMostraCpu.setText(String.format("%.1f", mostra1)+ "%");
        
          Double mostra2 = verificaDisco.nextDouble()* 100;
        lblMostraDisco.setText(String.format("%.1f", mostra2)+ "%");
        
          Double mostra3 = verificaMemoria.nextDouble()* 100;
        lblMostraRam.setText(String.format("%.1f", mostra3)+ "%");
           }
    }, delay,intervalo);
           
    }//GEN-LAST:event_btnVerificarAutActionPerformed

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
            java.util.logging.Logger.getLogger(MonitoramentoLiliane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MonitoramentoLiliane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MonitoramentoLiliane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MonitoramentoLiliane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MonitoramentoLiliane().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerificar;
    private javax.swing.JButton btnVerificarAut;
    private javax.swing.JPanel jPanelBG;
    private javax.swing.JPanel jPanelCPU;
    private javax.swing.JPanel jPanelDisk;
    private javax.swing.JPanel jPanelRam;
    private javax.swing.JLabel lblCpu;
    private javax.swing.JLabel lblDisco;
    private javax.swing.JLabel lblMemoria;
    private javax.swing.JLabel lblMostraCpu;
    private javax.swing.JLabel lblMostraDisco;
    private javax.swing.JLabel lblMostraRam;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}

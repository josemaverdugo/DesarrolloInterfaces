/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package desarrollodeinterfaces.ProyectoAPP.vista;

import desarrollodeinterfaces.ProyectoAPP.controller.SonidoController;

/**
 *
 * @author joses
 */
public class Oceano extends javax.swing.JDialog {

    /**
     * Creates new form Oceano
     */
    public Oceano(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public Oceano() {
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

        jPanel1 = new javax.swing.JPanel();
        Fondo = new javax.swing.JLabel();
        BotonVolver = new javax.swing.JButton();
        BotonPelipper = new javax.swing.JButton();
        BotonLugia = new javax.swing.JButton();
        BotonLapras = new javax.swing.JButton();
        BotonPalafin = new javax.swing.JButton();
        BotonSquirtle = new javax.swing.JButton();
        BotonGreninja = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desarrollodeinterfaces/ProyectoAPP/oceanoFinalTamaño.jpg"))); // NOI18N
        Fondo.setText(org.openide.util.NbBundle.getMessage(Oceano.class, "Oceano.Fondo.text")); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 760));

        BotonVolver.setText(org.openide.util.NbBundle.getMessage(Oceano.class, "Oceano.BotonVolver.text")); // NOI18N
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverActionPerformed(evt);
            }
        });
        jPanel1.add(BotonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 19, 120, 80));

        BotonPelipper.setText(org.openide.util.NbBundle.getMessage(Oceano.class, "Oceano.BotonPelipper.text")); // NOI18N
        BotonPelipper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPelipperActionPerformed(evt);
            }
        });
        jPanel1.add(BotonPelipper, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 110, 90));

        BotonLugia.setText(org.openide.util.NbBundle.getMessage(Oceano.class, "Oceano.BotonLugia.text")); // NOI18N
        BotonLugia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLugiaActionPerformed(evt);
            }
        });
        jPanel1.add(BotonLugia, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 280, 250));

        BotonLapras.setText(org.openide.util.NbBundle.getMessage(Oceano.class, "Oceano.BotonLapras.text")); // NOI18N
        BotonLapras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLaprasActionPerformed(evt);
            }
        });
        jPanel1.add(BotonLapras, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 200, 230));

        BotonPalafin.setText(org.openide.util.NbBundle.getMessage(Oceano.class, "Oceano.BotonPalafin.text")); // NOI18N
        BotonPalafin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPalafinActionPerformed(evt);
            }
        });
        jPanel1.add(BotonPalafin, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 380, 130, 90));

        BotonSquirtle.setText(org.openide.util.NbBundle.getMessage(Oceano.class, "Oceano.BotonSquirtle.text")); // NOI18N
        BotonSquirtle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSquirtleActionPerformed(evt);
            }
        });
        jPanel1.add(BotonSquirtle, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 600, 120, 140));

        BotonGreninja.setText(org.openide.util.NbBundle.getMessage(Oceano.class, "Oceano.BotonGreninja.text")); // NOI18N
        BotonGreninja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGreninjaActionPerformed(evt);
            }
        });
        jPanel1.add(BotonGreninja, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 520, 290, 190));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
        ElegirZona ez1=new ElegirZona();
        ez1.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotonVolverActionPerformed

    private void BotonPelipperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPelipperActionPerformed
        SonidoController.playSE(18);
    }//GEN-LAST:event_BotonPelipperActionPerformed

    private void BotonLugiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLugiaActionPerformed
        SonidoController.playSE(19);
    }//GEN-LAST:event_BotonLugiaActionPerformed

    private void BotonLaprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLaprasActionPerformed
        SonidoController.playSE(20);
    }//GEN-LAST:event_BotonLaprasActionPerformed

    private void BotonPalafinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPalafinActionPerformed
        SonidoController.playSE(21);
    }//GEN-LAST:event_BotonPalafinActionPerformed

    private void BotonSquirtleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSquirtleActionPerformed
       SonidoController.playSE(22);
    }//GEN-LAST:event_BotonSquirtleActionPerformed

    private void BotonGreninjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGreninjaActionPerformed
        SonidoController.playSE(23);
    }//GEN-LAST:event_BotonGreninjaActionPerformed

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
            java.util.logging.Logger.getLogger(Oceano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Oceano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Oceano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Oceano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Oceano dialog = new Oceano(new javax.swing.JFrame(), true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonGreninja;
    private javax.swing.JButton BotonLapras;
    private javax.swing.JButton BotonLugia;
    private javax.swing.JButton BotonPalafin;
    private javax.swing.JButton BotonPelipper;
    private javax.swing.JButton BotonSquirtle;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

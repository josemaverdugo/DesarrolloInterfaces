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
public class Mansion extends javax.swing.JDialog {

    /**
     * Creates new form Mansion
     */
    public Mansion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    
     public Mansion() {
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
        jLabel1 = new javax.swing.JLabel();
        BotonVolver = new javax.swing.JButton();
        BotonChandelure = new javax.swing.JButton();
        BotonDrifblim = new javax.swing.JButton();
        BotonBanette = new javax.swing.JButton();
        BotonGengar = new javax.swing.JButton();
        BotonRotom = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desarrollodeinterfaces/ProyectoAPP/mansionfinalTamaño.jpg"))); // NOI18N
        jLabel1.setText(org.openide.util.NbBundle.getMessage(Mansion.class, "Mansion.jLabel1.text")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 760));

        BotonVolver.setText(org.openide.util.NbBundle.getMessage(Mansion.class, "Mansion.BotonVolver.text")); // NOI18N
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverActionPerformed(evt);
            }
        });
        jPanel1.add(BotonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 19, 140, 80));

        BotonChandelure.setText(org.openide.util.NbBundle.getMessage(Mansion.class, "Mansion.BotonChandelure.text")); // NOI18N
        BotonChandelure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonChandelureActionPerformed(evt);
            }
        });
        jPanel1.add(BotonChandelure, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 0, 260, 180));

        BotonDrifblim.setText(org.openide.util.NbBundle.getMessage(Mansion.class, "Mansion.BotonDrifblim.text")); // NOI18N
        BotonDrifblim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDrifblimActionPerformed(evt);
            }
        });
        jPanel1.add(BotonDrifblim, new org.netbeans.lib.awtextra.AbsoluteConstraints(884, 80, 210, 210));

        BotonBanette.setText(org.openide.util.NbBundle.getMessage(Mansion.class, "Mansion.BotonBanette.text")); // NOI18N
        BotonBanette.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBanetteActionPerformed(evt);
            }
        });
        jPanel1.add(BotonBanette, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 280, 280));

        BotonGengar.setText(org.openide.util.NbBundle.getMessage(Mansion.class, "Mansion.BotonGengar.text")); // NOI18N
        BotonGengar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGengarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonGengar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 250, 260));

        BotonRotom.setText(org.openide.util.NbBundle.getMessage(Mansion.class, "Mansion.BotonRotom.text")); // NOI18N
        BotonRotom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRotomActionPerformed(evt);
            }
        });
        jPanel1.add(BotonRotom, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 540, 260, 220));

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

    private void BotonChandelureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonChandelureActionPerformed
        SonidoController.playSE(13);
    }//GEN-LAST:event_BotonChandelureActionPerformed

    private void BotonDrifblimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDrifblimActionPerformed
        SonidoController.playSE(14);
    }//GEN-LAST:event_BotonDrifblimActionPerformed

    private void BotonBanetteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBanetteActionPerformed
        SonidoController.playSE(15);
    }//GEN-LAST:event_BotonBanetteActionPerformed

    private void BotonGengarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGengarActionPerformed
        SonidoController.playSE(16);
    }//GEN-LAST:event_BotonGengarActionPerformed

    private void BotonRotomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRotomActionPerformed
        SonidoController.playSE(17);
    }//GEN-LAST:event_BotonRotomActionPerformed

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
            java.util.logging.Logger.getLogger(Mansion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mansion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mansion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mansion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Mansion dialog = new Mansion(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton BotonBanette;
    private javax.swing.JButton BotonChandelure;
    private javax.swing.JButton BotonDrifblim;
    private javax.swing.JButton BotonGengar;
    private javax.swing.JButton BotonRotom;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

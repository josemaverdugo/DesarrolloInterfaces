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
public class Bosque extends javax.swing.JDialog {

    /**
     * Creates new form Bosque
     */
    public Bosque(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public Bosque() {
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
        BotonCelebi = new javax.swing.JButton();
        BotonSerperior = new javax.swing.JButton();
        BotonSudowoodo = new javax.swing.JButton();
        BotonSceptile = new javax.swing.JButton();
        BotonBulbasaur = new javax.swing.JButton();
        BotonTorterra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desarrollodeinterfaces/ProyectoAPP/bosquefinalTamaño.jpg"))); // NOI18N
        jLabel1.setText(org.openide.util.NbBundle.getMessage(Bosque.class, "Bosque.jLabel1.text")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 760));

        BotonVolver.setText(org.openide.util.NbBundle.getMessage(Bosque.class, "Bosque.BotonVolver.text")); // NOI18N
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverActionPerformed(evt);
            }
        });
        jPanel1.add(BotonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 9, 120, 60));

        BotonCelebi.setText(org.openide.util.NbBundle.getMessage(Bosque.class, "Bosque.BotonCelebi.text")); // NOI18N
        BotonCelebi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCelebiActionPerformed(evt);
            }
        });
        jPanel1.add(BotonCelebi, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 120, 90));

        BotonSerperior.setText(org.openide.util.NbBundle.getMessage(Bosque.class, "Bosque.BotonSerperior.text")); // NOI18N
        BotonSerperior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSerperiorActionPerformed(evt);
            }
        });
        jPanel1.add(BotonSerperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 100, 200, 250));

        BotonSudowoodo.setText(org.openide.util.NbBundle.getMessage(Bosque.class, "Bosque.BotonSudowoodo.text")); // NOI18N
        BotonSudowoodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSudowoodoActionPerformed(evt);
            }
        });
        jPanel1.add(BotonSudowoodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 120, 150));

        BotonSceptile.setText(org.openide.util.NbBundle.getMessage(Bosque.class, "Bosque.BotonSceptile.text")); // NOI18N
        BotonSceptile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSceptileActionPerformed(evt);
            }
        });
        jPanel1.add(BotonSceptile, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 280, 350));

        BotonBulbasaur.setText(org.openide.util.NbBundle.getMessage(Bosque.class, "Bosque.BotonBulbasaur.text")); // NOI18N
        BotonBulbasaur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBulbasaurActionPerformed(evt);
            }
        });
        jPanel1.add(BotonBulbasaur, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 540, 170, 160));

        BotonTorterra.setText(org.openide.util.NbBundle.getMessage(Bosque.class, "Bosque.BotonTorterra.text")); // NOI18N
        BotonTorterra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonTorterraActionPerformed(evt);
            }
        });
        jPanel1.add(BotonTorterra, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 380, 390, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void BotonCelebiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCelebiActionPerformed
        SonidoController.playSE(7);
    }//GEN-LAST:event_BotonCelebiActionPerformed

    private void BotonSerperiorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSerperiorActionPerformed
        SonidoController.playSE(8);
    }//GEN-LAST:event_BotonSerperiorActionPerformed

    private void BotonSudowoodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSudowoodoActionPerformed
        SonidoController.playSE(9);
    }//GEN-LAST:event_BotonSudowoodoActionPerformed

    private void BotonSceptileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSceptileActionPerformed
        SonidoController.playSE(10);
    }//GEN-LAST:event_BotonSceptileActionPerformed

    private void BotonBulbasaurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBulbasaurActionPerformed
        SonidoController.playSE(11);
    }//GEN-LAST:event_BotonBulbasaurActionPerformed

    private void BotonTorterraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonTorterraActionPerformed
        SonidoController.playSE(12);
    }//GEN-LAST:event_BotonTorterraActionPerformed

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
            java.util.logging.Logger.getLogger(Bosque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bosque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bosque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bosque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Bosque dialog = new Bosque(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton BotonBulbasaur;
    private javax.swing.JButton BotonCelebi;
    private javax.swing.JButton BotonSceptile;
    private javax.swing.JButton BotonSerperior;
    private javax.swing.JButton BotonSudowoodo;
    private javax.swing.JButton BotonTorterra;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package desarrollodeinterfaces.ProyectoAPP.vista;

import desarrollodeinterfaces.ProyectoAPP.controller.SonidoController;
import javax.swing.JOptionPane;

/**
 *
 * @author joses
 */
public class ElegirZona extends javax.swing.JDialog {

    /**
     * Creates new form ElegirZona
     */
    public ElegirZona(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        SonidoController.playMusic(0);
    }
    
    public ElegirZona() {
        initComponents();
        SonidoController.playMusic(0);
        
   
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
        BotonVolver = new javax.swing.JButton();
        CerrarSesion = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        BotonVolcan = new javax.swing.JButton();
        BotonBosque = new javax.swing.JButton();
        BotonMansion = new javax.swing.JButton();
        BotonOceano = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonVolver.setFont(new java.awt.Font("Cascadia Mono", 0, 15)); // NOI18N
        BotonVolver.setText(org.openide.util.NbBundle.getMessage(ElegirZona.class, "ElegirZona.BotonVolver.text")); // NOI18N
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverActionPerformed(evt);
            }
        });
        jPanel1.add(BotonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 140, -1));

        CerrarSesion.setFont(new java.awt.Font("Cascadia Mono", 0, 15)); // NOI18N
        CerrarSesion.setText(org.openide.util.NbBundle.getMessage(ElegirZona.class, "ElegirZona.CerrarSesion.text")); // NOI18N
        CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(CerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desarrollodeinterfaces/ProyectoAPP/pokeball2FinalBotones.jpg"))); // NOI18N
        fondo.setText(org.openide.util.NbBundle.getMessage(ElegirZona.class, "ElegirZona.fondo.text")); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 570));

        BotonVolcan.setText(org.openide.util.NbBundle.getMessage(ElegirZona.class, "ElegirZona.BotonVolcan.text")); // NOI18N
        BotonVolcan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolcanActionPerformed(evt);
            }
        });
        jPanel1.add(BotonVolcan, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 59, 270, 70));

        BotonBosque.setText(org.openide.util.NbBundle.getMessage(ElegirZona.class, "ElegirZona.BotonBosque.text")); // NOI18N
        BotonBosque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBosqueActionPerformed(evt);
            }
        });
        jPanel1.add(BotonBosque, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 189, 290, 70));

        BotonMansion.setText(org.openide.util.NbBundle.getMessage(ElegirZona.class, "ElegirZona.BotonMansion.text")); // NOI18N
        BotonMansion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMansionActionPerformed(evt);
            }
        });
        jPanel1.add(BotonMansion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 309, 310, 80));

        BotonOceano.setText(org.openide.util.NbBundle.getMessage(ElegirZona.class, "ElegirZona.BotonOceano.text")); // NOI18N
        BotonOceano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonOceanoActionPerformed(evt);
            }
        });
        jPanel1.add(BotonOceano, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 449, 290, 70));

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

    private void BotonVolcanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolcanActionPerformed
        Volcan v1= new Volcan();
        v1.setVisible(true);
        SonidoController.stopMusic();
        JOptionPane.showMessageDialog(null, "En la siguiente pantalla te apareceran diferentes pokemon, pulsa en ellos para averiguar su nombre", "Manual de uso", JOptionPane.INFORMATION_MESSAGE);
        dispose();
        
    }//GEN-LAST:event_BotonVolcanActionPerformed

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
           Inicio i1=new Inicio();
        i1.setVisible(true);
        SonidoController.stopMusic();
        
        dispose();
    }//GEN-LAST:event_BotonVolverActionPerformed

    private void BotonBosqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBosqueActionPerformed
        Bosque b1=new Bosque();
        b1.setVisible(true);
        SonidoController.stopMusic();
        JOptionPane.showMessageDialog(null, "En la siguiente pantalla te apareceran diferentes pokemon, pulsa en ellos para averiguar su nombre", "Manual de uso", JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }//GEN-LAST:event_BotonBosqueActionPerformed

    private void BotonMansionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMansionActionPerformed
        Mansion m1=new Mansion();
        m1.setVisible(true);
        SonidoController.stopMusic();
        JOptionPane.showMessageDialog(null, "En la siguiente pantalla te apareceran diferentes pokemon, pulsa en ellos para averiguar su nombre", "Manual de uso", JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }//GEN-LAST:event_BotonMansionActionPerformed

    private void BotonOceanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonOceanoActionPerformed
        Oceano o1=new Oceano();
        o1.setVisible(true);
        SonidoController.stopMusic();
        JOptionPane.showMessageDialog(null, "En la siguiente pantalla te apareceran diferentes pokemon, pulsa en ellos para averiguar su nombre", "Manual de uso", JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }//GEN-LAST:event_BotonOceanoActionPerformed

    private void CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionActionPerformed
        
        JOptionPane.showMessageDialog(null, "La sesión se ha cerrado correctamente.", "Hasta la próxima.", JOptionPane.INFORMATION_MESSAGE);
        Inicio i = new Inicio();
        i.setVisible(true);
        SonidoController.stopMusic();
        dispose();
    }//GEN-LAST:event_CerrarSesionActionPerformed

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
            java.util.logging.Logger.getLogger(ElegirZona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ElegirZona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ElegirZona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ElegirZona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ElegirZona dialog = new ElegirZona(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton BotonBosque;
    private javax.swing.JButton BotonMansion;
    private javax.swing.JButton BotonOceano;
    private javax.swing.JButton BotonVolcan;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JButton CerrarSesion;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

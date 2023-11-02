/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package desarrollodeinterfaces.ProyectoAPP.vista;

import desarrollodeinterfaces.ProyectoAPP.controller.SonidoController;
import desarrollodeinterfaces.ProyectoAPP.modelo.Conexion;


public class Inicio extends javax.swing.JFrame {
    
    public Inicio() {
        initComponents();
        Conexion c1 = new Conexion();
        c1.connection(); 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Fondo = new javax.swing.JLabel();
        BotonInicioSesion = new javax.swing.JButton();
        BotonRegistrarse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desarrollodeinterfaces/ProyectoAPP/ImagenInicioFinal2.png"))); // NOI18N
        Fondo.setText(org.openide.util.NbBundle.getMessage(Inicio.class, "Inicio.Fondo.text")); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 750));

        BotonInicioSesion.setText(org.openide.util.NbBundle.getMessage(Inicio.class, "Inicio.BotonInicioSesion.text")); // NOI18N
        BotonInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInicioSesionActionPerformed(evt);
            }
        });
        jPanel1.add(BotonInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 410, 60));

        BotonRegistrarse.setText(org.openide.util.NbBundle.getMessage(Inicio.class, "Inicio.BotonRegistrarse.text")); // NOI18N
        BotonRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarseActionPerformed(evt);
            }
        });
        jPanel1.add(BotonRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, 390, 50));

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

    private void BotonInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInicioSesionActionPerformed
        IniciarSesion is1 = new IniciarSesion();
        is1.setVisible(true);
       
        dispose();
    }//GEN-LAST:event_BotonInicioSesionActionPerformed

    private void BotonRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarseActionPerformed
        Registrarse r1 = new Registrarse();
        r1.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_BotonRegistrarseActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonInicioSesion;
    private javax.swing.JButton BotonRegistrarse;
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

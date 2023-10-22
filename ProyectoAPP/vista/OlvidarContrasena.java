/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package desarrollodeinterfaces.ProyectoAPP.vista;

import desarrollodeinterfaces.ProyectoAPP.vista.IniciarSesion;

/**
 *
 * @author joses
 */
public class OlvidarContrasena extends javax.swing.JDialog {

    /**
     * Creates new form OlvidarContrasena
     */
    public OlvidarContrasena(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public OlvidarContrasena() {
        initComponents();
        transparenteValidation();
        
    }
    
    public void transparenteValidation() {
        validationPanel1.setOpaque(false);
        
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
        jLabelNuevaContrasena1 = new javax.swing.JLabel();
        jLabelRepiteContrasena = new javax.swing.JLabel();
        jTextFieldRepetirContrasena = new javax.swing.JTextField();
        jTextFieldNuevaContrasena = new javax.swing.JTextField();
        validationPanel1 = new org.netbeans.validation.api.ui.swing.ValidationPanel();
        ButtonVolver = new javax.swing.JButton();
        ButtonAceptar = new javax.swing.JButton();
        Foto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNuevaContrasena1.setFont(new java.awt.Font("Cascadia Mono", 0, 15)); // NOI18N
        jLabelNuevaContrasena1.setText(org.openide.util.NbBundle.getMessage(OlvidarContrasena.class, "OlvidarContrasena.jLabelNuevaContrasena1.text")); // NOI18N
        jPanel1.add(jLabelNuevaContrasena1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 160, 50));

        jLabelRepiteContrasena.setFont(new java.awt.Font("Cascadia Mono", 0, 15)); // NOI18N
        jLabelRepiteContrasena.setText(org.openide.util.NbBundle.getMessage(OlvidarContrasena.class, "OlvidarContrasena.jLabelRepiteContrasena.text")); // NOI18N
        jPanel1.add(jLabelRepiteContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 220, 50));

        jTextFieldRepetirContrasena.setText(org.openide.util.NbBundle.getMessage(OlvidarContrasena.class, "OlvidarContrasena.jTextFieldRepetirContrasena.text")); // NOI18N
        jPanel1.add(jTextFieldRepetirContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 220, 40));

        jTextFieldNuevaContrasena.setText(org.openide.util.NbBundle.getMessage(OlvidarContrasena.class, "OlvidarContrasena.jTextFieldNuevaContrasena.text")); // NOI18N
        jTextFieldNuevaContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNuevaContrasenaActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldNuevaContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 220, 40));
        jPanel1.add(validationPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 16, 420, 60));

        ButtonVolver.setFont(new java.awt.Font("Cascadia Mono", 0, 15)); // NOI18N
        ButtonVolver.setText(org.openide.util.NbBundle.getMessage(OlvidarContrasena.class, "OlvidarContrasena.ButtonVolver.text")); // NOI18N
        ButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVolverActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, -1));

        ButtonAceptar.setFont(new java.awt.Font("Cascadia Mono", 0, 15)); // NOI18N
        ButtonAceptar.setText(org.openide.util.NbBundle.getMessage(OlvidarContrasena.class, "OlvidarContrasena.ButtonAceptar.text")); // NOI18N
        ButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, -1, -1));

        Foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desarrollodeinterfaces/ProyectoAPP/fondoappFinal.jpg"))); // NOI18N
        Foto.setText(org.openide.util.NbBundle.getMessage(OlvidarContrasena.class, "OlvidarContrasena.Foto.text")); // NOI18N
        jPanel1.add(Foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 450));

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

    private void jTextFieldNuevaContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNuevaContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNuevaContrasenaActionPerformed

    private void ButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAceptarActionPerformed
        
        
        
        
    }//GEN-LAST:event_ButtonAceptarActionPerformed

    private void ButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVolverActionPerformed
        IniciarSesion is1 = new IniciarSesion();
        is1.setVisible(true);
    }//GEN-LAST:event_ButtonVolverActionPerformed

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
            java.util.logging.Logger.getLogger(OlvidarContrasena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OlvidarContrasena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OlvidarContrasena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OlvidarContrasena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                OlvidarContrasena dialog = new OlvidarContrasena(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton ButtonAceptar;
    private javax.swing.JButton ButtonVolver;
    private javax.swing.JLabel Foto;
    private javax.swing.JLabel jLabelNuevaContrasena1;
    private javax.swing.JLabel jLabelRepiteContrasena;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldNuevaContrasena;
    private javax.swing.JTextField jTextFieldRepetirContrasena;
    private org.netbeans.validation.api.ui.swing.ValidationPanel validationPanel1;
    // End of variables declaration//GEN-END:variables
}

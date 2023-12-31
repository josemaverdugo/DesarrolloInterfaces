
package desarrollodeinterfaces.ProyectoAPP.vista;
import desarrollodeinterfaces.ProyectoAPP.controller.UsuarioController;
import desarrollodeinterfaces.ProyectoAPP.vista.Inicio;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.netbeans.validation.api.builtin.stringvalidation.MayusculaValidator;
import org.netbeans.validation.api.builtin.stringvalidation.StringValidators;
import org.netbeans.validation.api.ui.ValidationGroup;


public class IniciarSesion extends javax.swing.JDialog {


    public IniciarSesion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
         
        
        
    }
    public IniciarSesion(){
        initComponents();
        transparencia();
        transparenteValidation();
        BotonEntrar.setEnabled(false);
        ValidationGroup group=validationPanel1.getValidationGroup();
        
        group.add(TextFieldUsuario, StringValidators.REQUIRE_NON_EMPTY_STRING);
        group.add(TextFieldContrasena,StringValidators.REQUIRE_NON_EMPTY_STRING);
        
        
        validationPanel1.addChangeListener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e){
                if (validationPanel1.getProblem()==null)
                    BotonEntrar.setEnabled(true);
                else
                    BotonEntrar.setEnabled(false);
            }
        });
        
        
        
    }
   public void transparencia (){
       BotonOlvidarContrasena.setOpaque(false);
       BotonOlvidarContrasena.setContentAreaFilled(false);
       BotonOlvidarContrasena.setBorderPainted(false);
   }
    public void transparenteValidation(){
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
        validationPanel1 = new org.netbeans.validation.api.ui.swing.ValidationPanel();
        LabelUsuario = new javax.swing.JLabel();
        TextFieldUsuario = new javax.swing.JTextField();
        LabelContraseña = new javax.swing.JLabel();
        TextFieldContrasena = new javax.swing.JTextField();
        BotonOlvidarContrasena = new javax.swing.JButton();
        BotonVolver = new javax.swing.JButton();
        BotonEntrar = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        validationPanel1.setFont(new java.awt.Font("Cascadia Mono", 1, 18)); // NOI18N
        jPanel1.add(validationPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 440, 60));

        LabelUsuario.setFont(new java.awt.Font("Cascadia Mono", 0, 15)); // NOI18N
        LabelUsuario.setText(org.openide.util.NbBundle.getMessage(IniciarSesion.class, "IniciarSesion.LabelUsuario.text_1")); // NOI18N
        jPanel1.add(LabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 80, 30));

        TextFieldUsuario.setFont(new java.awt.Font("Cascadia Mono", 1, 22)); // NOI18N
        TextFieldUsuario.setText(org.openide.util.NbBundle.getMessage(IniciarSesion.class, "IniciarSesion.TextFieldUsuario.text")); // NOI18N
        TextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(TextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 170, -1));
        TextFieldUsuario.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(IniciarSesion.class, "IniciarSesion.TextFieldUsuario.AccessibleContext.accessibleName")); // NOI18N

        LabelContraseña.setFont(new java.awt.Font("Cascadia Mono", 0, 15)); // NOI18N
        LabelContraseña.setText(org.openide.util.NbBundle.getMessage(IniciarSesion.class, "IniciarSesion.LabelContraseña.text")); // NOI18N
        jPanel1.add(LabelContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 100, 30));

        TextFieldContrasena.setFont(new java.awt.Font("Cascadia Mono", 1, 22)); // NOI18N
        TextFieldContrasena.setText(org.openide.util.NbBundle.getMessage(IniciarSesion.class, "IniciarSesion.TextFieldContrasena.text")); // NOI18N
        TextFieldContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldContrasenaActionPerformed(evt);
            }
        });
        jPanel1.add(TextFieldContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 170, -1));

        BotonOlvidarContrasena.setFont(new java.awt.Font("Cascadia Mono", 0, 15)); // NOI18N
        BotonOlvidarContrasena.setText(org.openide.util.NbBundle.getMessage(IniciarSesion.class, "IniciarSesion.BotonOlvidarContrasena.text")); // NOI18N
        BotonOlvidarContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonOlvidarContrasenaActionPerformed(evt);
            }
        });
        jPanel1.add(BotonOlvidarContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 259, 300, 40));

        BotonVolver.setFont(new java.awt.Font("Cascadia Mono", 0, 15)); // NOI18N
        BotonVolver.setText(org.openide.util.NbBundle.getMessage(IniciarSesion.class, "IniciarSesion.BotonVolver.text")); // NOI18N
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverActionPerformed(evt);
            }
        });
        jPanel1.add(BotonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, -1, 40));

        BotonEntrar.setFont(new java.awt.Font("Cascadia Mono", 0, 15)); // NOI18N
        BotonEntrar.setText(org.openide.util.NbBundle.getMessage(IniciarSesion.class, "IniciarSesion.BotonEntrar.text")); // NOI18N
        BotonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 110, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desarrollodeinterfaces/ProyectoAPP/imagenIniciarSesionTamaño.jpg"))); // NOI18N
        Fondo.setText(org.openide.util.NbBundle.getMessage(IniciarSesion.class, "IniciarSesion.Fondo.text")); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 450));

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

    private void TextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldUsuarioActionPerformed

    private void TextFieldContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldContrasenaActionPerformed

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
        Inicio i1=new Inicio();
        i1.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotonVolverActionPerformed

    private void BotonOlvidarContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonOlvidarContrasenaActionPerformed
        OlvidarContrasena oc1=new OlvidarContrasena();
        oc1.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotonOlvidarContrasenaActionPerformed

    private void BotonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEntrarActionPerformed
        
        if( UsuarioController.validarContraseña(TextFieldUsuario.getText(), TextFieldContrasena.getText())==true){
            dispose();
        }else{  
        }
        
       
        
    }//GEN-LAST:event_BotonEntrarActionPerformed

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
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IniciarSesion dialog = new IniciarSesion(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton BotonEntrar;
    private javax.swing.JButton BotonOlvidarContrasena;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel LabelContraseña;
    private javax.swing.JLabel LabelUsuario;
    private javax.swing.JTextField TextFieldContrasena;
    private javax.swing.JTextField TextFieldUsuario;
    private javax.swing.JPanel jPanel1;
    private org.netbeans.validation.api.ui.swing.ValidationPanel validationPanel1;
    // End of variables declaration//GEN-END:variables
}

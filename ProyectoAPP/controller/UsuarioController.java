/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desarrollodeinterfaces.ProyectoAPP.controller;

import desarrollodeinterfaces.ProyectoAPP.modelo.Conexion;
import desarrollodeinterfaces.ProyectoAPP.modelo.Usuario;
import desarrollodeinterfaces.ProyectoAPP.modelo.Usuario;
import desarrollodeinterfaces.ProyectoAPP.vista.ElegirZona;
import desarrollodeinterfaces.ProyectoAPP.vista.IniciarSesion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class UsuarioController {
    
    
    private final static  Conexion con = new Conexion();
    
    public static void crearUsuario (Usuario usuario){
     try {con.connection();
      String sql ="INSERT INTO usuarios VALUES(?, ?, ?, ?)";
      
      PreparedStatement sent = con.conn1.prepareStatement(sql);
      
      sent.setInt(1,usuario.getId());
      sent.setString(2, usuario.getUsuario());
      sent.setString(3, usuario.getContrasena());
      sent.setInt(4, usuario.getEdad());
      
      
      sent.execute();
      con.cerrarConexion();
              
      
          
      } catch (SQLException e) {
          e.printStackTrace();
      }
    
}
    
    public static void updateContrasena(String contrasenaNueva,String usuario){
         try{
            con.connection();
             String sql = "UPDATE usuarios SET contrasena = ? WHERE usuario = ?";

            PreparedStatement stmt = con.conn1.prepareStatement(sql);

            stmt.setString(1, contrasenaNueva);
            stmt.setString(2, usuario);

            stmt.execute();
            con.cerrarConexion();
        }catch(SQLException e){
            e.printStackTrace();

        }
    }
    
    
     public static void borrarUsuario(String usuario){
      
      try {con.connection();
      String sql ="DELETE FROM usuario WHERE (usuario= ?) ";
      
      PreparedStatement sent = con.conn1.prepareStatement(sql);
      
        sent.setString(1, usuario);
      sent.execute();
      con.cerrarConexion();
              
      
          
      } catch (SQLException e) {
          e.printStackTrace();
      }
  }
     
     public static String contraseñaUsuario(String usuario){
        String sql= "SELECT contrasena FROM usuarios WHERE usuario = ?";
        try{
            con.connection();
            PreparedStatement stmt = con.conn1.prepareStatement(sql);
            stmt.setString(1, usuario);
             
           ResultSet result = stmt.executeQuery();

           String contraseña="";

            while (result.next()) {
                contraseña = result.getString("contrasena");
            }

            con.conn1.close();

            return contraseña;
            
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }      
    }
     
     public static boolean validarContraseña(String usuario,String contraseñaField){
        String contraseñaUsuario= UsuarioController.contraseñaUsuario(usuario);
        boolean ventana=false;
        if(contraseñaUsuario.equals(contraseñaField)){
            ElegirZona ez = new ElegirZona();
            ez.setVisible(true);
            ventana=true;
            return ventana;
                    
        }else{
            JOptionPane.showMessageDialog(null, "Contraseña o usuario incorrecto", "Intentelo de nuevo", JOptionPane.INFORMATION_MESSAGE);
            return ventana;
        }
    }
     
     public static boolean contraseñaOlvidada(String usuario,String contraseñaNueva, String repetirContraseña){
        String contraseñaUsuario= UsuarioController.contraseñaUsuario(usuario);
        boolean ventana= false;
        if(repetirContraseña.equals(contraseñaNueva)){
            IniciarSesion i = new IniciarSesion();
            i.setVisible(true);
            ventana=true;
            return ventana;
        }if(contraseñaUsuario.equals(contraseñaNueva)){
            JOptionPane.showMessageDialog(null, "La nueva contraseña coincide con la actual", "Intentelo de nuevo", JOptionPane.INFORMATION_MESSAGE);
            return ventana;
        }
        else{
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden", "Intentelo de nuevo", JOptionPane.INFORMATION_MESSAGE);
            return ventana;
        }
       
        
            
        
    }



}

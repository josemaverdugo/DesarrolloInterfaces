/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desarrollodeinterfaces.ProyectoAPP.controller;

import desarrollodeinterfaces.ProyectoAPP.modelo.Conexion;
import desarrollodeinterfaces.ProyectoAPP.modelo.Usuario;
import desarrollodeinterfaces.ProyectoAPP.modelo.Usuario;
import java.sql.PreparedStatement;
import java.sql.SQLException;


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


}

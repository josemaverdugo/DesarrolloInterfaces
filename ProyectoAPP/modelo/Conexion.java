/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desarrollodeinterfaces.ProyectoAPP.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
      public Connection conn1 = null;
    public void connection (){
        try {
            String url = "jdbc:mysql://localhost:3306/proyectoapp";
            String user = "root";
            String pasword = "";
            conn1 = DriverManager.getConnection(url, user, pasword);
            if (conn1 != null) {
            System.out.println("Conectado a BD");
            }
        } catch (SQLException ex) {
            System.out.println("ERROR:La dirección no es válida o el usuario y clave");
            ex.printStackTrace();
        }
    }
    
    public void cerrarConexion (){
            //SE CIERRA LA CONEXIÓN
                try {
                conn1.close();
        } catch (SQLException ex) {
            System.out.println("ERROR:al cerrar la conexión");
            ex.printStackTrace();
        }
    }
    
}

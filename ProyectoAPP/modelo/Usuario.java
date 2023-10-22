
package desarrollodeinterfaces.ProyectoAPP.modelo;

import java.sql.ResultSet;

public class Usuario {
    
    private int id;
    private String usuario;
    private String contrasena;
    private int edad;
    
    public Usuario(ResultSet rs){
        try {
            this.id=rs.getInt("Id");
            this.usuario=rs.getString("usuario");
            this.contrasena=rs.getString("contrasena");
            this.edad=rs.getInt("edad");
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
            
    
}

    public Usuario(int id, String usuario, String contrasena, int edad) {
        this.id = id;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.edad = edad;
    }

    public Usuario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    
    
    
    
}

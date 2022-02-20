package mascotapp.entidades;

import java.util.Date;

public class Usuario {

    public String nombre;
    public String apellido;
    public String pais;
    public Integer edad;
    public Date nacimiento;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String pais, Integer edad, Date nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.edad = edad;
        this.nacimiento = nacimiento;
    }
  
    
}

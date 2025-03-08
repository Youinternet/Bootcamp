package Concesionario;

public class Persona {
    private String nombre;
    private String cedula;
    private String direccion;
    private String telefono;  
    
    public Persona(String nombre, String cedula, String direccion, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
    }  
    
    public String getNombre() {
        return this.nombre;
    }
    
    public String getCedula() {
        return this.cedula;
    }
    
    public String getDireccion() {
        return this.direccion;
    }
    
    public String getTelefono() {
        return this.telefono;
    }   
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String toString() {
        return "Persona{" +
                "nombre='" + this.nombre + '\'' +
                ", cedula='" + this.cedula + '\'' +
                ", direccion='" + this.direccion + '\'' +
                ", telefono='" + this.telefono + '\'' +
                '}';
    }
}

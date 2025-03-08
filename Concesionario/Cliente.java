package Concesionario;

public class Cliente  extends Persona{
    private String IdCliente;
    private String nombre;
    private String Cedula;
    private String direccion;
    private String telefono;

    public Cliente(String nombre, String Cedula, String direccion, String telefono) {
        super(nombre, Cedula, direccion, telefono);
        this.nombre = nombre;
        this.Cedula = Cedula;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setDni(String dni) {
        this.Cedula = Cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", Cedula='" + Cedula + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }

}

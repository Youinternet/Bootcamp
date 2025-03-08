package Concesionario;
// vamos a acrear un programa utilizando clases y hacieno herencia , polimorfismo  todo lo que es prientado a objeto. el codigo es para un concesionario 

public class vendedor extends Persona {

    private String idVendedor;

    public vendedor(String idVendedor, String nombre, String cedula, String direccion, String telefono) {
        super(nombre, cedula, direccion, telefono);
        this.idVendedor = idVendedor;
    }

    public String getIdVendedor() {
        return idVendedor;
    }
    public void setIdVendedor(String idVendedor) {
        this.idVendedor = idVendedor;
    }

    @Override
    public String toString() {
        return "Vendedor{" +"idVendedor='" + idVendedor + '\'' + '}';
    }
    }


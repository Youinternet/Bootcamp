package Concesionario;

public class venta {

    private String idVenta;
    private String idVendedor;
    private String idCliente;
    private String idVehiculo;
    private String idPersona;

    public venta(String idVenta, String idVendedor, String idCliente, String idVehiculo, String idPersona) {
        this.idVenta = idVenta;
        this.idVendedor = idVendedor;
        this.idCliente = idCliente;
        this.idVehiculo = idVehiculo;
        this.idPersona = idPersona;
    }

    public String getIdVenta() {
        return idVenta;
    } 

    public void setIdVenta(String idVenta) {
        this.idVenta = idVenta;
    }

    public String getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(String idVendedor) {
        this.idVendedor = idVendedor;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }   

    public String getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(String idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getIdPersona() {
        return idPersona;
    }   
    @Override
    public String toString() {
        return "venta{" +
                "idVenta='" + idVenta + '\'' +
                ", idVendedor='" + idVendedor + '\'' +
                ", idCliente='" + idCliente + '\'' +
                ", idVehiculo='" + idVehiculo + '\'' +
                ", idPersona='" + idPersona + '\'' +
                '}';
    }

}

package Concesionario;

public class Vehiculo {
    private String marca;
    private String modelos;
    private String referencia;
    private int precio;

    public Vehiculo(String marca, String modelos, String referencia, int precio) {
        this.marca = marca;
        this.modelos = modelos;
        this.referencia = referencia;
        this.precio = precio;
    }

    public Vehiculo(String string, String string2, String string3, String string4, String string5, String string6,
            String string7, String string8, String string9, String string10, String string11) {
        //TODO Auto-generated constructor stub
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelos() {
        return modelos;
    }

    public void setModelos(String modelos) {
        this.modelos = modelos;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
}

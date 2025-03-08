public class Producto {
    // vamos a definir los atirbutos de nuestra clase producto
    // Un porducto tien el nombre, categoria , y precio y  cantidad
    // al definir los atributos de manera private estamos encapsulando los datos de la clase
    // y como ya sabemos el encapsulamineto nos ayuda a prteger nuestro datos y que no se modificados 
    private String nombre;
    private String categoria;
    private double precio;
    private int cantidad;

    // creamos nuestro constructor 
    public Producto (String nombre , String categoria, double precio, int cantidad) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.cantidad = cantidad;

    }
    // ahora creamo nuestro metodo get 
    
    public String getnombre() {
        return nombre;
    }

    public String getcategoria(){
        return categoria;
    }
    
    public double getprecio() {
        return precio;
    }

    public int getcantidad() {
        return cantidad;
    }

    // ahora realizamos nuestro set para poder modficar los datos 

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public void setcategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setprecio(double precio) {
        this.precio = precio;
    }

    public void setcantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
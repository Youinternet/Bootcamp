public class Pedidos {

    private Clientes clientes;
    private Producto producto;
    private int cantidad;
    private double total;

    public Pedidos(Clientes clientes, Producto producto, int cantidad) {
        this.clientes = clientes;
        this.producto = producto;
        this.cantidad = cantidad;
        this.total = producto.getprecio() * cantidad;
    }

    // realizamos buestro metodo get para poder acceder a los atributos de nuestra clase
    public Clientes getClientes(){
        return clientes;
    }

    public Producto getProducto(){
        return producto;
    }

    public int getcantidad(){
        return cantidad;
    }

    public double getotal(){
        return total;
    }


    // ahora realizamos nuestro metodo get para poder modificar los atributos de nuestra clase
    public void setClientes(Clientes clientes){
        this.clientes = clientes;
    }

    public void setproducto(Producto producto){
        this.producto = producto;
    }

    public void setcantidad(int cantidad){
        this.cantidad = cantidad;
    }

    public void settotal(double total ){
        this.total = total;
    }
}

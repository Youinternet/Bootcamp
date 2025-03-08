import java.lang.reflect.Array;
import java.util.ArrayList;

public class Tienda {
    private ArrayList<Producto> productos;
    private ArrayList<Clientes> clientes;
    private ArrayList<Pedidos> pedidos;

    public Tienda(){
        this.productos = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.pedidos  = new ArrayList<>();
    }
}

package Concesionario;
import java.util.ArrayList;

public class Inventario {
    private ArrayList<Vehiculo> vehiculos;

    // Constructor
    public Inventario(){
        this.vehiculos = new ArrayList<>();
    }

    // Metodos
    public void agregarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }

    // Metodos para eliminar vehiculos
    public void eliminarVehiculo(Vehiculo vehiculo){
        vehiculos.remove(vehiculo);
    }

    @Override
    public String toString() {
        return "Inventario{" + "vehiculos=" + vehiculos + '}';
    }
        
    }


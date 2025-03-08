package Concesionario;

import java.util.ArrayList;

public class Concesionario {

    private ArrayList<vendedor> vendedores;
    private ArrayList<Cliente> clientes;
    private ArrayList<venta> ventas;
    private ArrayList<Inventario> inventarios;
    private ArrayList<Vehiculo> vehiculos;

    // Constructor
    public Concesionario(){
        this.vendedores = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.ventas = new ArrayList<>();
        this.inventarios = new ArrayList<>();
    }

    // Metodos
    public void agregarVendedor(vendedor vendedor){
        vendedores.add(vendedor);
    }   

    public void agregarCliente(Cliente cliente){
        clientes.add(cliente);
    }   

    public void agregarVenta(venta venta){
        ventas.add(venta);
    }
    public void agregarInventario(Inventario inventario){
        inventarios.add(inventario);
    }   

    //gestion para registrar una venta 
    public void registrarVenta(venta venta, Cliente cliente1, vendedor vendedor1, Vehiculo vehiculo1, String fecha_venta){
        ventas.add(venta);
}


    

    public static void main(String[] args) {
        System.out.println(" Tu Concesionario de confianza");
        Concesionario concesionario = new Concesionario();
        // Crear un objeto Cliente, venderdor, vehiculo
        Cliente cliente1 = new Cliente("Juan", "001", "Calle 1", "123456");
        vendedor vendedor1 = new vendedor("Carlos", "002", "Calle 2", "654321", "001");
        Vehiculo vehiculo1 = new Vehiculo("001", "Toyota", "Corolla", "2020", "Rojo", "Sedan", "Automatico", "Gasolina", "4", "5", "20000");


        // Registrar vent 
        String fecha_venta = "2025-02-23";
        concesionario.registrarVenta(null, cliente1, vendedor1, vehiculo1, fecha_venta);
        System.out.println("Venta registrada con exito");
    }

    @Override
    public String toString() {      
        return " El dia  de "+ "Concesionario{" + "vendedores=" + vendedores + ", clientes=" + clientes + ", ventas=" + ventas + ", inventarios=" + inventarios + '}';
    }
}
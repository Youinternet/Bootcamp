public class Clientes {
    String nombre;
    int Numerodocumento;
    String direccion;

// Agregaremos un constructor para nuestra clases 
// que es un contructor y que es lo que hace 
// un constructor es un metodo que se ejecuta cuando se crea un objeto de una clase

public Clientes(String nombre , int Numerodocumento , String direccion){
    this.nombre = nombre;// se inicializa el atributo nombre
    this.Numerodocumento = Numerodocumento; // se inicializa el atributo Numerodocumento
    this.direccion = direccion;
    }

// ahora vamos a crear los metodos de nuestra clase
// estos metodomitiran acceder a los atributos de nuestra clase

    public String getnombre() { 
        return nombre;
    }

    public int getNumerodocumento() {
        return Numerodocumento;

    }

    public String getdireccion(){
        return direccion;
    }

    // realizamos nuestor metodo set para poder modificar los atributos de nuestra clase

    public void setnombre(String nombre){
        this.nombre = nombre;
    }

    public void setNumerodocumento(int Numerodocumento){
        this.Numerodocumento = Numerodocumento;
    }

    public void setdirecion(String direccion){
        this.direccion = direccion; 
    }
}




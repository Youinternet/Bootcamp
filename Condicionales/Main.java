
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
      // Variables
        
       // vamos a realizar una calculadora 
        int numero = 3, operador = 6;
        
        //char letra = 'a';
        //String cadena = "hola";
        int suma = numero + operador;
        int resta = numero - operador;
        int multiplicacion = numero * operador;
        //CONVERTIR IN INTERO A FLOAT
        float division = (float)numero / operador;

        System.out.println("La suma de: " + numero + " + " + operador + " es: " + suma);
        System.out.println("La resta es: " + numero + " - " + operador + " es: " + resta);
        System.out.println("La multiplicacion es: " + numero + " * " + operador + " es: " + multiplicacion);
        System.out.println("La division es: " + numero + " / " + operador + " es: " + division);

        /*
         *   if (numero > operador) {
            System.out.println("El numero es mayor que el operador");
        } else if (numero < operador) {
            System.out.println("El numero es menor que el operador");
        } else {
            System.out.println("El numero es igual al operador");
        }
         */

    }
}




// Estructura de repeticion 

public class Clase3 {

    public static void main(String[] args) { 

        // LA ESTRUCTURA DE REPETICION DE FOR : SIRVE PARA ESTRUCTURA INTERABLE QUE SE PUEDEN RECORRE UNA CANTIDAD DE VECES DETERMINADA
        // for para recorrer un array
        int[] array = {1, 2, 3, 4, 5, 6};
        for(int i : array){
            System.out.println("El numero ees" + i);
        }
        System.out.println("Fin del cilclo for ");
        int interador = 0;
        do{
            System.out.println("El numero es: " + interador);
            interador ++;
        } while(interador <= 10);
        System.out.println("fin del ciclo");
        // while

        int j = 9;
        while(j >= 0){
            System.out.println("El numero es: " + array[j]);
            j--;
        }

    }

}
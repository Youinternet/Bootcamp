import javax.swing.JOptionPane;

public class estruc_repeticion {
    public static void main(String[] args){

        //Estructura de repeticion
        /*  actividades 
         * 2.1. Realizar un programa que transforme todas las letras del alfabeto de mayúsculas a minúsculas. 
        2.2. Programa que lee las edades de un grupo de 100 alumnos y encuentra el promedio. 
        2.3. Calcular el promedio de un alumno que tiene 7 calificaciones en la materia de Cálculo. 
        2.4. Leer 10 números y obtener su cubo y su cuarta. 
        2.5. Leer 10 números e imprimir solamente los números positivos. 
        2.6. Leer 20 números e imprimir cuantos son  positivos, cuantos negativos y cuantos neutros. 
        2.7. Leer 15 números negativos y convertirlos a positivos e imprimir dichos números. 
        2.8. Calcular de la suma y la media aritmética de N números reales. Solicitar el valor de N al usuario y cada uno de los 
        N números reales. 
        2.9. Suponga que se tiene un conjunto de calificaciones de un grupo de 40 alumnos. 
        Realizar un algoritmo y el programa para calcular la calificación media y la calificación más baja de todo el grupo. 
        2.10. Calcular e imprimir la tabla de multiplicar de un número cualquiera. Imprimir el multiplicando, el multiplicador y el 
        producto. 
        */

        //2.1. Realizar un programa que transforme todas las letras del alfabeto de mayúsculas a minúsculas.

/* 
    for (char i = 'A'; i <= 'Z'; i++)// Este codigo me recorre de la letra A hasta la Z
        {
            System.out.println("La letra en minuscula es: " + Character.toLowerCase(i));
        }
*/

/*        //2.2. Programa que lee las edades de un grupo de 100 alumnos y encuentra el promedio.
int [] edades =  new int[100];
int sumaEdades = 0;
// edades aleatoria de 100 alumnos 
for (int i = 0; i < 100; i++) // interador para recorrer el array de edades  determina las cantidad de edades
{
    edades[i] = (int) (Math.random() *13 ) + 18; // GENERADOR DE NUMERO ALEATORIO para las 100 edades de un rago de 18 a 31 años
    sumaEdades += edades[i]; // suma de las edades
    System.out.println("La edad del alumno es :" + edades[i] + "Años" );
}   System.out.println("El promedio de las edades es: " + sumaEdades/100 + "años");
*/

/*      //2.3. Calcular el promedio de un alumno que tiene 7 calificaciones en la materia de Cálculo.
        int [] calificaciones = new int[7];
        int sumaCalificaciones = 0;
        for (int i = 0; i < 7; i++)
        {
            calificaciones[i] = (int) (Math.random() * 10) + 3;
            sumaCalificaciones += calificaciones[i];
            System.out.println("La calificacion del alumno es: " + calificaciones[i]);
        }
        System.out.println("El promedio de las calificaciones es: " + sumaCalificaciones / 7);

        //2.4. Leer 10 números y obtener su cubo y su cuarta.
        int [] numeros = new int[10];
        for (int i = 0; i < 10; i++)
        {
            numeros[i] = (int) (Math.random() * 10) + 1;
            System.out.println("El numero es: " + numeros[i]);
            System.out.println("El cubo del numero es: " + Math.pow(numeros[i], 3));
            System.out.println("La cuarta del numero es: " + Math.pow(numeros[i], 4));
        }
   */
   //2.5. Leer 10 números e imprimir solamente los números positivos.
    /*int [] numeros = new int [10];
    for (int i = 0; i < 10; i++ ) // este for me recorre los 10 numeros
    {
        // ingrese 10 numero positivos y negativo
        numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        if (numeros[i] > 0) // si el numero es mayor a 0
        {
            System.out.println("El numero es positivo: " + numeros[i]);
        }
    } */

    //2.6. Leer 20 números e imprimir cuantos son  positivos, cuantos negativos y cuantos neutros.
    
/*   int [] numeros = new int [20];
    int positivos = 0, negativos = 0, neutros = 0;
    for (int i = 0; i < 20; i++) // recorremos  los 20 numeros
    {
        numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        if (numeros[i] > 0) //  el numero es mayor a 0  es positivo 
        {
            positivos++;
        } else if (numeros[i] < 0) // el numero es negativo
        {
            negativos++;
        }
        else if (numeros[i] == 0) // el numero es neutro
        {
            neutros++;
        }
    
    }
    System.out.println("hay \n" + "\n" +positivos + "numeros positivos");
    System.out.println("hay \n" + negativos + "numeros negativos");
    System.out.println("hay \n " + neutros + " numeros neutros");    
*/

//2.7. Leer 15 números negativos y convertirlos a positivos e imprimir dichos números.
    /* int [] numeros  = new int [15];
        for (int i = 0 ; i < 15 ; i++){
            numeros[i] = (int) (Math.random() * 10)-10;
            // convertir esos numero en positivos
            System.out.println("El numero " + numeros[i] + " es negativo y su valor positivo es: " + Math.abs(numeros[i]));
            }
       */  
//2.8. Calcular de la suma y la media aritmética de N números reales. Solicitar el valor de N al usuario y cada uno de los N números reales.
    
/*
    int N = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la catidad de numero a evaluar"));
    double [] numeros = new double [N]; // arry de numero  a evaluar
    double suma = 0;
    double MediaAritmetica = 0;
    for ( int i = 0; i< N; i++)
    {
        numeros[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el numero a evaluar"));
        suma += numeros[i];
    }


    MediaAritmetica = suma /N;
    JOptionPane.showMessageDialog(null, "La suma de los numero es: " + suma + '\n' + "Y su media aritmetica es: " + MediaAritmetica);
*/
//2.9. Suponga que se tiene un conjunto de calificaciones de un grupo de 40 alumnos. Realizar un algoritmo y el programa para calcular la calificación media y la calificación más baja de todo el grupo.x
    // EL  algortimo va realiazar el promedio de las notas en un rango de calificacion de 0  ; 5 siendo 0 la mas baja y 5 la nota mas alta
    // ya se define la nota mas baja de acuero con las lista genrada aleatoriamente 
    double [] Calificaciones = new double [40];
    double SumaCalificaciones = 0;
    double MediaCalificaciones = 0;
    double CalificacionBaja = 5;

    for ( int i = 0 ; i <40; i++){
        Calificaciones[i] = (Math.random()*5)+1 ;
        SumaCalificaciones ++;
    }
    }
}


    
    

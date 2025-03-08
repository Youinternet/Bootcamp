package Java;

import java.util.*;
import java.util.Scanner;

import javax.swing.JOptionPane;

//escribrir un programa que que contega un menu para selecionar la tarea a realizar, una especie de menu de jercisio que quiere continuar en cada clase
// selecionar la activida que quiere utilizar el usuario
// hacer el menu con un switcc con joption pane

public class Menu {
    public static void main(String[] args) {
        /*
         * .1. Escribir un programa que solicite un valor entero al usuario y determine si es par o impar. 
            1.2. Escribir un programa que solicite un valor entero al usuario y determine si es positivo o negativo. 
            1.3. Pedir al usuario un valor. Si el valor es positivo, pedir un segundo valor y calcular la suma, resta y producto de 
            ambos. Mostrar los resultados por pantalla. 
            1.4. Calcular el mayor de dos números enteros introducidos por teclado. 
            1.5. Calcular el mayor de tres números enteros introducidos por teclado. 
            1.6. Calcular el mayor de cuatro números enteros introducidos por teclado. 
            1.7. Determinar en que estado está el agua en función de su temperatura. Si es negativa el estado será sólido, si es 
            menor que 100 será líquido y si es mayor que 100 será gas. Pedir al usuario el valor de la temperatura. 
            1.8. Un año es bisiesto si es divisible por 4 y no es por 100, o si es divisible por 400. Escribe un programa que lea un 
            año y devuelva si es bisiesto o no. 
            1.9. Dada la fecha de hoy, calcular la fecha del día siguiente. Suponer que el año no es bisiesto. 
            1.10. Pedir un mes (número) y mostrar el nombre del mes. 
            1.11. Solicitar al usuario la inicial del día de la semana y mostrar el nombre del día completo. La letra inicial puede ser 
            mayúscula o minúscula. Usar la x para el miércoles. 
         */
        String menu = "Seleccione una actividad\n"
            + "1. Par o impar\n"
            + "2. positivo o negativo'\n"
            + "3.  calcular la suma, resta y producto de dos numeros\n"
            + "4.  calcular el mayor de dos numeros\n"
            + "5.  calcular el mayor de tres numeros\n"
            + "6.  calcular el mayor de cuatro numeros\n"
            + "7.  estado del agua\n"
            + "8.  Determinar si es año bisiesto\n"
            + "9. Calcular la fecha del dia siguiente\n"
            + "10. Mostrar el nombre del mes\n"
            + "11. La letra mayúscula o minúscula. Usar la x para el miércoles. \n"
            + "0. Salir";
            //opcion con JOptionPane
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
                    Boolean salir = false;
                    while (!salir) {
                    // Se muestra el menú y se lee la opción ingresada por el usuario
                    //String menuInput = JOptionPane.showInputDialog(null, menu, "Menú de Opciones", JOptionPane.QUESTION_MESSAGE);
                        // if (menuInput == null) { // Si el usuario presiona el botón de cancelar
                          //  salir = true;
                            //break;
                        //}
                      //  opcion = Integer.parseInt(menuInput);
                        switch (opcion) {
                            case 1:
                                // PAR O IMPAR
                                String num = JOptionPane.showInputDialog("Ingrese un número entero: ");
                                int numero = Integer.parseInt(num);
                                if(numero %2 == 0){
                                    JOptionPane.showMessageDialog(null, "El número es par");
                                }else{
                                    JOptionPane.showMessageDialog(null, "El número es impar", num, numero);
                                }
                    
                                break;
                            case 2:
                                // Ejecutar la tarea 1.2 //POSITIVO O NEGATIVO
                                String numg = JOptionPane.showInputDialog("Ingrese un número : ");
                                int numero1 = Integer.parseInt(numg);
                                if (numero1 > 0) {
                                    JOptionPane.showMessageDialog(null,"El número es positivo");
                                } else if (numero1 < 0) {
                                    JOptionPane.showMessageDialog(null,"El numero es negativo");
                                } else {
                                    JOptionPane.showMessageDialog(null,"El numero es igual a 0");
                                }        
                            break;
                            case 3:
                                // Ejecutar la tarea 1.3 //CALCULAR LA SUMA, RESTA Y PRODUCTO DE DOS NUMEROS
                                String num2 = JOptionPane.showInputDialog(null, "Ingrese un valor: ");
                                int numero2 = Integer.parseInt(num2);
                                    if (numero2 > 0) {
                                        String num2a = JOptionPane.showInputDialog(null, "Ingrese un segundo valor: ");
                                        int numero2a = Integer.parseInt(num2a);
                                        int suma = numero2 + numero2a;
                                        int resta = numero2 - numero2a;
                                        int producto = numero2 * numero2a;
                                        float division = (float)numero2 / numero2a;
                                        JOptionPane.showMessageDialog(null, "La suma de los valores es: " + suma + "\nLa resta de los valores: " + resta + "\nLa Multiplicacion de los valores :" + producto + "\nLa division de los valores : " + division );
                                    }else{
                                        JOptionPane.showMessageDialog(null, "El numero es negativo");
                                    }

                                break;
                            case 4:
                                // Ejecutar la tarea 1.4// CALCULAR EL MAYOR DE DOS NUMEROS
                                String num3 = JOptionPane.showInputDialog(null, "Ingrese un numero: ");
                                int numero3 = Integer.parseInt(num3);
                                String num3a = JOptionPane.showInputDialog(null, "Ingrese un segundo numero: ");
                                int numero3a = Integer.parseInt(num3a);
                                if (numero3 > numero3a) {
                                    JOptionPane.showMessageDialog(null, "El numero mayor es: " + numero3);
                                } else if (numero3 < numero3a) {
                                    JOptionPane.showMessageDialog(null, "El numero mayor es: " + numero3a);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Los numeros son iguales");
                                }

                                break;
                            case 5:
                                // Ejecutar la tarea 1.5//CALCULAR EL MAYOR DE TRES NUMEROS
                                String numb = JOptionPane.showInputDialog(null, "Ingrese un numero: ");
                                int numerob = Integer.parseInt(numb);
                                String numbb = JOptionPane.showInputDialog(null, "Ingrese un segundo numero: ");
                                int numerobb = Integer.parseInt(numbb);
                                String numbc = JOptionPane.showInputDialog(null, "Ingrese el te tercer numero: ");
                                int numerobc = Integer.parseInt(numbc);
                                if (numerob > numerobb && numerob > numerobc){
                                    JOptionPane.showMessageDialog(null, "El numero mayor es: " + numerob);
                                } else if (numerobb > numerob && numerobb > numerobc) {
                                JOptionPane.showMessageDialog(null, "El numero mayor es: " + numerobb);
                                } else if (numerobc > numerob && numerobc > numerobb){
                                    JOptionPane.showMessageDialog(null, "El numero mayor es: " + numerobc);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Los numeros son iguales");
                                }
                                
                                break;
                            case 6://
                                String numb1 = JOptionPane.showInputDialog(null, "Ingrese un numero: ");
                                int numerob1 = Integer.parseInt(numb1);
                                String numbb1 = JOptionPane.showInputDialog(null, "Ingrese un segundo numero: ");
                                int numerobb1 = Integer.parseInt(numbb1);
                                String numbc1 = JOptionPane.showInputDialog(null, "Ingrese el te tercer numero: ");
                                int numerobc1 = Integer.parseInt(numbc1);
                                String numbd1 = JOptionPane.showInputDialog(null, "Ingrese el cuarto numero: ");
                                int numerobd1 = Integer.parseInt(numbd1);

                                if (numerob1 > numerobb1 && numerob1 > numerobc1 && numerob1 > numerobd1){
                                    JOptionPane.showMessageDialog(null, "El numero mayor es: " + numerob1);
                                } else if (numerobb1 > numerob1 && numerobb1 > numerobc1 && numerobb1 > numerobd1) {
                                JOptionPane.showMessageDialog(null, "El numero mayor es: " + numerobb1);
                                } else if (numerobc1 > numerob1 && numerobc1 > numerobb1 && numerobc1 > numerobd1){
                                    JOptionPane.showMessageDialog(null, "El numero mayor es: " + numerobc1);
                                } else if (numerobd1 > numerob1 && numerobd1 > numerobb1 && numerobd1 > numerobc1){
                                    JOptionPane.showMessageDialog(null, "El numero mayor es: " + numerobd1);
                                }
                                else {
                                    JOptionPane.showMessageDialog(null, "Los numeros son iguales");
                                }
                                break;
                            case 7:
                        }
                }
            }
        }

/*
 * public class ParInpar1 {
 * public static void main(String[] args) {
 * //Escribir un programa que solicite un valor entero al usuario y determine si
 * es par o impar
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Ingrese un número entero: ");
 * int num = sc.nextInt();
 * if (num % 2 == 0) {
 * System.out.println("El número es par");
 * } else {
 * System.out.println("El número es impar");
 * }
 * }
 * 
 * public class ParInpar {
 * public static void main(String[] args){
 * //Escribir un programa que solicite un valor entero al usuario y determine si
 * es par o impar utilizando la opcion jOptionPane
 * String num = JOptionPane.showInputDialog("Ingrese un número entero: ");
 * int numero = Integer.parseInt(num);
 * if(numero %2 == 0){
 * JOptionPane.showMessageDialog(null, "El número es par");
 * }else{
 * JOptionPane.showMessageDialog(null, "El número es impar", num, numero);
 * }
 * 
 * }
 * }
 * }
 * 
 */

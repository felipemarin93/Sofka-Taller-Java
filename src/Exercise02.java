/*
 * @author Daniel Felipe Marin
 *
 * Ejercicio 2: Al ejercicio anterior agregar entrada por consola de dos valores e indicar si sonmayores, menores o iguales.
 *
 * Se usa la clase Scanner para capturar datos por teclado
 * Se asignan dichas entradas a las variables declaradas previamente
 * Por último se hace la comparación en un ciclo If el cual determina cual es el mayor
 */


import java.util.Scanner;


public class Exercise02 {
    public static void main(String[] args) {
        System.out.println("Bienvenid@ al programa, ingresa dos números y el programa calcula el mayor de los dos.");
        System.out.println("También identifica si son iguales");

        int number1, number2; // Declaración dos variables numéricas
        Scanner sc = new Scanner(System.in);  // Objeto de la clase Scanner que captura y almacena los valores ingresados

        System.out.println("Por favor ingrese el valor del número 1");
        number1 = sc.nextInt();
        System.out.println("Por favor ingrese el valor del número 2");
        number2 = sc.nextInt();

        if (number1>number2){
            System.out.println("El número 1 es el mayor");
            } else if (number2>number1) {
            System.out.println("El número 2 es el mayor");

                } else if (number1==number2) {
            System.out.println("Ambos números son iguales");
                }
        }
}

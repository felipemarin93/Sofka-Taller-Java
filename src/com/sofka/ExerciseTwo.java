package com.sofka;

/**
 * Descripcio: Ejercicio 2 Al ejercicio anterior agregar entrada por consola de dos valores e indicar si sonmayores, menores o iguales.
 * * @author Daniel Felipe Marin
 * v1.0
 */


import java.util.Scanner;
import java.util.logging.Logger;

public class ExerciseTwo {

    /**Se declaran dos variables númericas con un valor respectivamente
     *Por último se hace la comparación en un ciclo If el cual determina cual es el número mayor
     *o si son iguales mostrando por consola el resultado
     */
    public static void main(String[] args) {
        Logger log = Logger.getLogger("Mensaje");
        Scanner scanner = new Scanner(System.in);

        log.info("Bienvenid@ al programa que calcula el número mayor.\n También identifica si son iguales");

        log.info("Por Favor ingrese el valor del número 1");
        int numberOne = scanner.nextInt();

        log.info("Por Favor ingrese el valor del número 2");
        int numberTwo = scanner.nextInt();

        if (numberOne > numberTwo) {
            log.info("El número 1 es el mayor");
        } else if (numberOne < numberTwo) {
            log.info("El número 2 es el mayor");
        } else {
            log.info("Ambos números son iguales");
        }
    }
}
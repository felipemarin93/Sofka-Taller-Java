package com.sofka;

/**
 * Descripcio: Ejercicio7. Lee un número por teclado y comprueba que este numero es mayor o igual quecero, si no lo es lo
 * volverá a pedir (do while), después muestra ese número porconsola.
 * * @author Daniel Felipe Marin
 * v1.0
 */

import java.util.Scanner;
import java.util.logging.Logger;

public class ExerciseSeven {


    public static void main(String[] args) {
        int numberEntered;
        Scanner leer = new Scanner(System.in);
        Logger log = Logger.getLogger("Mensaje");
        log.info("Bienvenid@ al comparador de números, ingresa un número mayor a cero\n ");

        numberEntered = leer.nextInt();

        String stringResultOne =("El numero ingresado es: " + numberEntered);
        log.info(stringResultOne);

        while (numberEntered <= 0) {
            log.info("Por favor intentalo de nuevo ingresa un numero mayor a cero\n");

            numberEntered = leer.nextInt();
            String stringResultTwo =("El numero ingresado es: " + numberEntered);
            log.info(stringResultTwo);

        }


    }
}

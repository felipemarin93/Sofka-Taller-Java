package com.sofka;
/**
 * Descripcion: Ejercicio6. Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usa unbucle for.
 * * @author Daniel Felipe Marin
 * v1.0
 */

import java.util.logging.Logger;

public class ExerciseSix {

    public static void main(String[] args) {

        Logger log = Logger.getLogger("Mensaje");
        log.info("Bienvenid@ al programa que muestra los números pares e impares entre 1 y 100\n ");

        int numberValue = 1;
        for (int i = 1; i <= 100; i++) {
            if (numberValue % 2 == 0) {
                String stringResultOne = ("El numero " + numberValue + " es par");
                log.info(stringResultOne);
            } else if (numberValue % 2 != 0) {
                String stringResultTwo = ("El numero " + numberValue + " es impar");
                log.info(stringResultTwo);

                numberValue++;
            }
        }
    }
}
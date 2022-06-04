package com.sofka;


/**
 * Descripcion: Ejercicio5. Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usa unbucle while.
 * * @author Daniel Felipe Marin
 * v1.0
 */

import java.util.logging.Logger;

public class ExerciseFive {

    public static void main(String[] args) {

        Logger log = Logger.getLogger("Mensaje");
        log.info("Bienvenid@ al programa que muestra los números pares e impares entre 1 y 100\n ");

        int numberValue = 1;
        while (numberValue <= 100) {
            if (numberValue % 2 == 0) {
                String stringResultOne = ("El número " + numberValue + " es par");
                log.info(stringResultOne);
            } else if (numberValue % 2 != 0) {
                String stringResultTwo = ("El número " + numberValue + " es impar");
                log.info(stringResultTwo);

                numberValue++;
            }
        }
    }
}

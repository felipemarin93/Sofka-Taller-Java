package com.sofka;

import org.jboss.logging.Logger;
import java.util.Scanner;

/**
 * Descripcion: Ejercicio14. Crear un programa que pida un numero por teclado y que imprima por pantallazos números desde el numero introducido hasta 1000 con saldos de 2 en 2.
 * * @author Daniel Felipe Marin
 * v1.0
 */

public class ExerciseFourteen {

    public static void main(String[] args) {

        Logger log = Logger.getLogger("Mensaje");
        Scanner scanner = new Scanner(System.in);

        log.info("Bienvenid@ al programa que suma de dos en dos hasta mil iniciando desde el número qeu desees\n");
        log.info("Ingresa un numero por favor");

        int numberToOneThousand = scanner.nextInt();

        for (int i = numberToOneThousand; i <= 1000; i += 2) {
            i+=2;
            log.info(i);

        }

    }

}

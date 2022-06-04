package com.sofka;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Descripcion: Ejercicio8. Crea una aplicación por consola que nos pida un día de la semana y que nos digasi es un día
 * laboral o no. Usa un switch para ello.
 * * @author Daniel Felipe Marin
 * v1.0
 */

public class ExerciseEight {
    public static void main(String[] args) {
        int dayNumber;
        Scanner scanner = new Scanner(System.in);
        Logger log = Logger.getLogger("Mensaje");

        log.info("Bienvenid@ al comparador de números ingresa el número del día \n");
        log.info("1:Lunes\n 2:Martes\n 3:Miercoles\n 4:Jueves\n 5:Viernes\n 6:Sabado\n 7:Domingo\n");

        dayNumber = scanner.nextInt();
        switch (dayNumber) {
            case 1:
                log.info("El Lunes es un día laboral\n");
                break;
            case 2:
                log.info("El Martes es un día laboral\n");
                break;
            case 3:
                log.info("El Miércoles es un día laboral\n");
                break;
            case 4:
                log.info("El Jueves es un día laboral\n");
                break;
            case 5:
                log.info("El Viernes es un día laboral\n");
                break;
            case 6:
                log.info("El Sábado es un día de descanso\n");
                break;
            case 7:
                log.info("El Domingo es un día de descanso\n");
                break;
            default:
                log.info("Ingresaste una opción inválida\n");


        }

    }
}

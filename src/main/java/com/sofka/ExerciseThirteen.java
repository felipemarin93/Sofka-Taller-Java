package com.sofka;

import org.jboss.logging.Logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Descripcion: Ejercicio13. Realizar un algoritmo que permita consulta la fecha y hora actual en el formato(AAAA/MM/DD) (HH:MM:SS).
 * * @author Daniel Felipe Marin
 * v1.0
 */

public class ExerciseThirteen {



    public static void main(String[] args) {
        Logger log = Logger.getLogger("Mensaje");

        log.info("Bienvenid@ al programa que muestra la fecha y hora actual\n");


        DateTimeFormatter actualDate = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        log.info("La Fecha y hora actual es: " + actualDate.format(LocalDateTime.now()));

    }
}

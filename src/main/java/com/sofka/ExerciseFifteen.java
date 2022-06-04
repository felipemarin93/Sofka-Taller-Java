package com.sofka;

import org.jboss.logging.Logger;
import java.util.Scanner;

/**
 * Descripcion: Ejercicio15. Hacer un programa que muestre el siguiente menú de opciones
 * ****** GESTION CINEMATOGRÁFICA ********
 * 1-NUEVO ACTOR
 * 2-BUSCAR ACTOR
 * 3-ELIMINAR ACTOR
 * 4-MODIFICAR ACTOR
 * 5-VER TODOS LOS ACTORES
 * 6- VER PELICULAS DE LOS ACTORES
 * 7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES
 * 8-SALIR
 * EL SISTEMA SOLO VA A SALIR CUANDO SE DIGITE EL NUMERO 8, MIENTRAS SEDIGITE UNA DE LAS CINCO OPCIONES DEBE SEGUIR MOSTRADO EL MENU Y SI ELUSUARIO DIGITA UN NUMERO QUE NO ESTA EN EL MENU SE DEBE ARROJAR UNMENSAJE " OPCION INCORRECTO". Y MOSTRAR EL MENU NUEVAMENTE.
 * PISTA: CONVINAR SWICHT Y ALGUNO DE LOS BUCLES.
 * * @author Daniel Felipe Marin
 * v1.0
 */

public class ExerciseFifteen {
    public static void main(String[] args) {
        Logger log = Logger.getLogger("Mensaje");
        Scanner scanner = new Scanner(System.in);

        log.info("****** GESTION CINEMATOGRÁFICA ********");


        int optionSelected =1;
        while (optionSelected !=8){

            log.info("Elige opción:\n 1-NUEVO ACTOR\n 2-BUSCAR ACTOR\n 3-ELIMINAR ACTOR\n 4-MODIFICAR ACTOR\n 5-VER TODOS LOS ACTORES\n 6-VER PELICULAS DE LOS ACTORES\n 7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n 8-SALIR\n");

            optionSelected = Integer.parseInt(scanner.nextLine());


            switch (optionSelected) {
                case 1:
                    log.info("NUEVO ACTOR");
                    break;
                case 2:
                    log.info("BUSCAR ACTOR");
                    break;
                case 3:
                    log.info("ELIMINAR ACTOR");
                    break;
                case 4:
                    log.info("MODIFICAR ACTOR");
                    break;
                case 5:
                    log.info("VER TODOS LOS ACTORES");
                    break;
                case 6:
                    log.info("VER PELICULAS DE LOS ACTORES");
                    break;
                case 7:
                    log.info("VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
                    break;
                case 8:
                    log.info("SALISTE");
                    break;
                default:
                    log.info("OPCIÓN INCORRECTA");
                    break;
            }

        }
    }

}




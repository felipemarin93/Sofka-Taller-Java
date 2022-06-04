package com.sofka;

import org.jboss.logging.Logger;

import java.util.Scanner;


/**
 * Descripcion: Ejercicio11. Realizar la construcción de un algoritmo que permita de acuerdo a una frasepasada por consola,
 * indicar cual es la longitud de esta frase, adicionalmentecuantas vocales tiene de “a,e,i,o,u”.
 * * @author Daniel Felipe Marin
 * v1.0
 */

public class ExerciseEleven {

        public static void main(String[] args) {



            Scanner scanner = new Scanner(System.in);
            Logger log = Logger.getLogger("Mensaje");

            int counterA = 0;
            int counterE = 0;
            int counterI = 0;
            int counterO = 0;
            int counterU = 0;

            log.info("Bienvenid@ al programa que cuenta las letras\n");

            log.info("Por favor ingresa una palabra\n");

            String wordEntered = scanner.nextLine();

            for (int i = 0; i < wordEntered.length(); i++) {
                if ((wordEntered.charAt(i) == 'a')) {
                    counterA++;
                } else if ((wordEntered.charAt(i) == 'e')) {
                    counterE++;
                } else if ((wordEntered.charAt(i) == 'i')) {
                    counterI++;
                } else if ((wordEntered.charAt(i) == 'o')) {
                    counterO++;
                } else if ((wordEntered.charAt(i) == 'u')) {
                    counterU++;
                }

            }
            log.info("La longitud de la palabra es: " + wordEntered.length());
            log.info("vocal A: " + counterA);
            log.info("vocal E: " + counterE);
            log.info("vocal I: " + counterI);
            log.info("vocal O: " + counterO);
            log.info("vocal U: " + counterU);

        }




}

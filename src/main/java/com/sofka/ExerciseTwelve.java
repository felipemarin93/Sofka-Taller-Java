package com.sofka;

import org.jboss.logging.Logger;
import java.util.Scanner;

/**
 * Descripcion: Ejercicio12. Pedir dos palabras por teclado, indicar si son iguales, sino son iguales mostrarsus diferencias.
 * * @author Daniel Felipe Marin
 * v1.0
 */

public class ExerciseTwelve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logger log = Logger.getLogger("Mensaje");
        log.info("Bienvenid@ al programa que compara 2 palabras\n");


        log.info("Escribe la palabra 1");
        String wordOne = scanner.nextLine();

        log.info("Escribe la palabra 2\"");
        String wordTwo = scanner.nextLine();


        if (wordOne.equalsIgnoreCase(wordTwo)) {
            log.info("Las palabra "+wordOne+ "y "+wordTwo+" son iguales");

        } else {
            log.info("Las palabra "+wordOne+ "y "+wordTwo+" son diferentes");

        }
        if (wordOne.length() == wordTwo.length()) {
            if (wordOne.equalsIgnoreCase(wordTwo)) {
                log.info("la palabra " + wordOne + " y la palabra " + wordTwo + " son iguales en longitud");
            } else {
                for (int i = 0; i < wordOne.length(); i++) {
                    if (wordOne.charAt(i) != wordTwo.charAt(i)) {
                        log.info("Las palabras no son iguales en la posicion " + i);
                    }
                }
            }
        } else {
            log.info("La palabra " + wordOne + " tiene una longitud de: " + wordOne.length());
            log.info("La palabra " + wordTwo + " tiene una longitud de: " + wordTwo.length());
            log.info("Las palabras son diferentes en longitud");

        }
    }
}

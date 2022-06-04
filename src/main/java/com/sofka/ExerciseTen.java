package com.sofka;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Descripcion: Ejercicio10. Realizar una aplicación de consola, que al ingresar una frase por teclado elimine los espacios que esta contenga.
 * * @author Daniel Felipe Marin
 * v1.0
 */

public class ExerciseTen {
    public static void main(String[] args) {
        Logger log = Logger.getLogger("Mensaje");
        Scanner leer = new Scanner(System.in);

        log.info("Bienvenid@ al programa que quita los espacios de una frase\n");
        log.info("Por favor ingresa una frase\n");

        String phraseEntered = leer.nextLine();

        String result = phraseEntered.replaceAll("\\s+", "");
        String phraseResult=("Frase con los espacios eliminados: " + result);
        log.info(phraseResult);
    }
}
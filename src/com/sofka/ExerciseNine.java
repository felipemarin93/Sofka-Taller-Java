package com.sofka;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Descripcion: Ejercicio9. Del texto, “La sonrisa sera la mejor arma contra la tristeza” Reemplaza todas las
 * a del String anterior por una e, adicionalmente concatenar a esta frase una adicional que ustedes quieran
 * incluir por consola y las muestre luego unidas.
 * * @author Daniel Felipe Marin
 * v1.0
 */

public class ExerciseNine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logger log = Logger.getLogger("Mensaje");

        String phraseStored = "La sonrisa sera la mejor arma contra la tristeza";

        log.info("Bienvenid@ al programa que cambia las letras a por las e\n");
        log.info("Por favor ingresa una frase\n");

        String phraseEntered = scanner.nextLine();

        phraseStored = phraseStored.replace("a", "e");


        String result = (phraseStored + " " + phraseEntered);
        log.info(result);
    }


}

package com.sofka;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Descripcio: Ejercicio9. Del texto, “La sonrisa sera la mejor arma contra la tristeza” Reemplaza todas las
 * a del String anterior por una e, adicionalmente concatenar a esta frase una adicional que ustedes quieran
 * incluir por consola y las muestre luego unidas.
 * * @author Daniel Felipe Marin
 * v1.0
 */

public class ExerciseNine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logger log = Logger.getLogger("Mensaje");

        log.info("Bienvenid@ al programa que cambia la letra\n");
        String phraseStored = "La sonrisa sera la mejor arma contra la tristeza";

        System.out.println("Por favor ingresa una frase");
        String phraseEntered = scanner.nextLine();

        phraseStored = phraseStored.replace("a", "e");


        System.out.println(phraseStored + " " + phraseEntered);
    }


}

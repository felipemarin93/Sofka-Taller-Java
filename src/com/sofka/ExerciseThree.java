package com.sofka;

/**
 * Descripcio: Ejercicio3. Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirápor teclado (recuerda pasar de String a double con
 * Double.parseDouble). Usa laconstante PI y el método pow de Math.
 * * @author Daniel Felipe Marin
 * v1.0
 */

import java.util.Scanner;
import java.util.logging.Logger;

public class ExerciseThree {

    public static void main(String[] args) {
        Logger log = Logger.getLogger("Mensaje");
        Scanner scanner = new Scanner(System.in);  // Objeto de la clase Scanner que captura y almacena los valores ingresados


        Double areaCirculo;
        Double radio;

        log.info("Bienvenid@ al programa para hallar el área de un círculo\n ");
        log.info("Porfavor ingresa el radio del círculo");

        //Se le asigna el valor a Radio por teclado parseandolo de String a Double
        radio = Double.parseDouble(scanner.next());
        // Se usa la clase Math para obtener PI y para elevar una potencia con POW (para la fórmula del area del círculo)
        areaCirculo = Math.PI * Math.pow(radio, 2);


        log.info("Porfavor ingresa el radio del círculo");
        //String areaCirculoString = String.valueOf(areaCirculo);
        //log.info("El área del círculo es: ",areaCirculoString);
        System.out.println("El área del círculo es: " + areaCirculo);


    }
}

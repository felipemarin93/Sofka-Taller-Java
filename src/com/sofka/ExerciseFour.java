package com.sofka;

/**Descripcio: Ejercicio4. Lee un número por teclado que pida el precio de un producto (puede tenerdecimales) y calcule el precio final con IVA.
 * El IVA sera una constante que seradel 21%.
 * * @author Daniel Felipe Marin
 * v1.0
 */

import java.util.Scanner;
import java.util.logging.Logger;

public class ExerciseFour {

    public static void main(String[] args) {

        Logger log = Logger.getLogger("Mensaje");
        Scanner scanner = new Scanner(System.in);
        log.info("Bienvenid@ al programa para calcular el precio con iva de un producto\n ");


        Double precioSinIva;
        Double precioConIva;
        Double valorIva;

        Double porcentajeIva = 0.21;


        log.info("Por favor ingrese el precio del producto sin IVA");


        precioSinIva = Double.parseDouble(scanner.next());
        valorIva = precioSinIva*porcentajeIva;

        System.out.println("El valor del IVA es: " + valorIva);

        precioConIva = precioSinIva+valorIva;
        System.out.println("El precio con IVA es: $ "+ precioConIva);
    }
}

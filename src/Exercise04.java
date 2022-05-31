/*
 * @author Daniel Felipe Marin
 *
 * Ejercicio 4:
   Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA.
    El IVA sera una constante que sera del 21%.
 */


import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  // Objeto de la clase Scanner que captura y almacena los valores ingresados
        System.out.println("Bienvenid@ al programa para calcular el precio con iva de un producto\n ");
        //Declaración de variables
        Double precioSinIva,precioConIva,valorIva;
        final Double porcentajeIva = 0.21;

        System.out.println("Por favor ingrese el precio del producto sin IVA");
        //Se captura el valor de precio sin IVA en tipo Double
        precioSinIva = Double.parseDouble(sc.next());

        valorIva = precioSinIva*porcentajeIva;
        System.out.println("El valor del IVA es: " + valorIva);

        precioConIva = precioSinIva+valorIva;
        System.out.println("El precio con IVA es: $ "+ precioConIva);


    }
}

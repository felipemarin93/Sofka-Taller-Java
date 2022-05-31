/*
 * @author Daniel Felipe Marin
 *
 * Ejercicio 3:
   Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado (recuerda pasar de
   String a double con Double.parseDouble). Usa la constante PI y el método pow de Math.
 */


import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  // Objeto de la clase Scanner que captura y almacena los valores ingresados

        //Declaración de las variables tipo double
        Double areaCirculo,radio;

        System.out.println("Bienvenid@ al programa para hallar el área de un círculo\n ");
        System.out.println("Porfavor ingresa el radio del círculo");
        //Se le asigna el valor a Radio por teclado parseandolo de String a Double
        radio = Double.parseDouble(sc.next());
        // Se usa la clase Math para obtener PI y para elevar una potencia con POW (para la fórmula del area del círculo)
        areaCirculo = Math.PI* Math.pow(radio,2);

        System.out.println("El área del círculo es: " + areaCirculo);

    }

}

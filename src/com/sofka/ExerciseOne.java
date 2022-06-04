package com.sofka;

 /**Descripcio: Ejercicio 1 - Declara 2 variables numéricas (con el valor que desees), he indica cual es
 * mayorde los dos. Si son iguales indicarlo también. Ve cambiando los valores paracomprobar que funciona.
 * * @author Daniel Felipe Marin
 * v1.0
 */


import java.util.logging.Logger;

public class ExerciseOne {

    public static void main(String[] args) {
        Logger log = Logger.getLogger("Mensaje");


        log.info("Bienvenid@ al programa que calcula el número mayor.\n También identifica si son iguales");

        int numberOne =3;
        int numberTwo =7;

        if (numberOne > numberTwo){
            log.info("El número 1 es el mayor");
            }else if (numberOne < numberTwo){
             log.info("El número 2 es el mayor");
                 }else{
                  log.info("Ambos números son iguales");
        }
    }
}
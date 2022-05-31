package com.sofka;/*
 * @author Daniel Felipe Marin
 * Ejercicio 1 - Declara 2 variables numéricas (con el valor que desees), he indica cual es
 * mayorde los dos. Si son iguales indicarlo también. Ve cambiando los valores paracomprobar que funciona.
 *
 */
/*
 * Se declaran dos variables númericas con un valor respectivamente
 * Por último se hace la comparación en un ciclo If el cual determina cual es el número mayor
 * o si son iguales mostrando por consola el resultado
 */


import java.util.logging.Logger;

public class ExerciseOne {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(ExerciseOne.class.getName());

        logger.log(Level.INFO,"Bienvenid@ al programa que calcula el número mayor.\n También identifica si son iguales");


        int number1 = 6;
        int number2 = 4;


        if (number1>number2){
            logger.log(Level.INFO,"El número 1 es el mayor");

        }else if (number1 < number2){
            logger.log(Level.INFO,"El número 2 es el mayor");

        }else if ((number1) == (number2)) {
            logger.log(Level.INFO,"Ambos números son iguales");
        }
    }
}
package sixteen;

import org.jboss.logging.Logger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Logger log = Logger.getLogger("Mensaje");
        Scanner scaner = new Scanner(System.in);

        log.info("<<<Bienvenido al programa mantente saludable>>>");

        log.info("Por favor ingresa tu nombre");
        String nombre = scaner.nextLine();
        persona.setNombre(nombre);

        log.info("Por favor ingresa tu edad");
        int edad = scaner.nextInt();
        persona.setEdad(edad);


        log.info("Por favor ingresa tu sexo");
        String sexo=scaner.nextLine();
        persona.setSexo(sexo);

        log.info("Por favor ingresa tu peso");
        Double peso = scaner.nextDouble();
        persona.setPeso(peso);

        log.info("Por favor ingresa tu altura");
        Double altura = scaner.nextDouble();
        persona.setAltura(altura);

        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        persona1.generarDni();
        persona1.mostrarPersonaUno();

        Persona persona2 = new Persona(nombre, edad, sexo);
        persona2.generarDni();
        persona2.mostrarPersonaDos();

        Persona persona3 = new Persona();
        persona3.mostrarPersonaDos();
        persona3.generarDni();


    }

}

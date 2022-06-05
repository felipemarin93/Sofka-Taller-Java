package sixteen;
import java.util.Random;
import java.util.logging.Logger;

/**
 * * @author Daniel Felipe Marin  - felipemariniraldo@gmail.com
 * v1.0
 * Clase creada para generar los atributos de Persona, y 3 tipos de constructores como se pidió en el ejercicio
 * además contiene los métodos solicitas como: ObtenerDNI, ComprobarSexo,mayorDeEdad y Calcular IMC
 */
public class Persona {
    Logger log = Logger.getLogger("Mensaje");
    private String nombre;
    private Integer edad;
    private Double peso;
    private Random dni;
    private String sexo;
    private Double altura;
    public final String sexoDef = "H";
    public final int pesoBajo = -1;
    public final int pesoIdeal = 0;
    public final int pesoAlto = 1;

    /**
     * definicion de un constructor por defecto
     */

    public Persona(String nombre, int edad, String sexo, Double peso, Double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    /**
     * definicion de un constructor con los parametros
     */
    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        comprobarSexo(sexo);
        this.peso = 0.0;
        this.altura = 0.0;
    }

    public Persona(){
        this.nombre = "";
        this.edad = 0;
        this.sexo = sexoDef;
        this.peso = 0.0;
        this.altura = 0.0;
    }


    /**
     * indica  si la persona es mayor de edad, devuelve un la cadena de texto.
     */
    public String mayorDeEdad() {
        if (edad >= 18) {
             mensaje = "Es Mayor de edad: "+edad;
            return  mensaje;
        }
         mensaje = "Es Menor de edad: "+edad;
        return  mensaje;
    }


    /**
     * comprueba que el sexo introducido es correcto. Si no es correcto, sera sexo_Def.
     */
    private void comprobarSexo(String sexo) {

        if (sexo.equals("F")) {
            this.sexo = sexoDef;
        }

    }

    /**
     * genera un número aleatorio de 8 cifras, con Math.random
     * genera a partir de este su número su letra correspondiente
     */
    public void generarDni() {

        dni = new Random(4234);
        String dniFinal = "Su DNI es: " + dni;
        log.info(dniFinal);
    }


    /**
     * Metodos set para los atributos de la clase
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    private String mensaje;
    /**
     * Metodo que calculara si la persona está en su peso ideal
     */
    public String calcularIMC() {
        double imc = peso / (Math.pow(altura, 2));
        if (peso==0){
            mensaje = "peso nulo: " + pesoBajo;
        }
        if (imc < 20) {
            mensaje = "peso muy bajo: " + pesoBajo;
            return mensaje;
        } else if (imc >= 20 && imc < 25) {
            mensaje = "Buen peso: " + pesoIdeal;
            return mensaje;
        }
        mensaje = "Tiene sobrepeso" + pesoAlto;
        return mensaje;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", dni=" + dni +
                ", sexo='" + sexo + '\'' +
                ", altura=" + altura +
                '}';
    }

    /**
     * Metodo que devuelve toda la información del objeto.
  */


    public void mostrarPersonaUno(){
          mensaje = "Nombre de la persona 1: "+ nombre+
                "\n "+mayorDeEdad()+"\nSexo: "+sexo+"\nSu peso es: "+
                peso+"\nSu altura es: "+altura+"\n  IMC: "+calcularIMC();
        log.info(mensaje);

    }

    public void mostrarPersonaDos(){

          mensaje = "Nombre de la persona 2: "+nombre+
                "\nSu Edad es: "+mayorDeEdad()+"\nSexo: "+sexo+"\n IMC: "+calcularIMC();
        log.info(mensaje);
    }
}

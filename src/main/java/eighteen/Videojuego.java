package eighteen;

import org.jboss.logging.Logger;

public class Videojuego {
    Logger log = Logger.getLogger("Mensaje");
    public final static int mayor = 1;
    public final static int menor = -1;
    public final static int igual = 0;
    String titulo;
    public boolean entregado;
    String compania;
    Integer horasEstimadas;
    String genero;

    /**
     *  Un constructor por defecto.
     */

    public Videojuego() {
        this.horasEstimadas = 10;
        this.entregado = false;
    }

    /**
     *  Un constructor con el titulo y horas estimadas como parametro
     * @param titulo
     * @param horasEstimadas
     */
    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = false;
        this.compania = "android";
        this.genero = "demo";
    }

    /**
     * Un constructor con todos los atributos como parametro
     * @param titulo
     * @param compania
     * @param horasEstimadas
     * @param genero
     */
    public Videojuego(String titulo, String compania, int horasEstimadas, String genero) {
        this.titulo = titulo;
        this.compania = compania;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
    }

    /**
     * Métodos get de todos los atributos
     * Métodos set de todos los atributos
     * @return
     */
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {

        return this.entregado;
    }
    /**
     * Compara dos videojuegos segun el numero de horasEstimadas
     * @return codigo numerico
     * <ul>
     * <li>1: El videojuego 1 es mayor que el videojuego 2</li>
     * <li>0: Los videojuegos son iguales</li>
     * <li>-1: El videojuego 1 es menor que el videojuego 2</li></ul>
     */
    @Override
    public int compareTo(Object a) {
        int estado=menor;

        Videojuego ref=(Videojuego)a;
        if (horasEstimadas>ref.getHorasEstimadas()){
            estado=mayor;
        }else if(horasEstimadas==ref.getHorasEstimadas()){
            estado=igual;
        }

        return estado;


    }
    /**
     * Indica si dos videojuegos son iguales, siendo el titulo y compañia iguales
     * @param a videojuego a comparar
     * @return true si son iguales y false si son distintos
     */
    public boolean equals(Videojuego a){
        if (titulo.equalsIgnoreCase(a.getTitulo()) && compania.equalsIgnoreCase(a.getCompania())){
            return true;
        }
        return false;
    }

    /**
     * Metodo que calcula el video juego con mas horas estimadas
     * @param juego
     * @return
     */

    public int calcularHoras(Videojuego juego[]) {
        int horas = 0;
        int posicion = 0;
        for (int i = 0; i < juego.length; i++)
            if (juego[i].horasEstimadas > horas) {
                posicion = i;
                horas = juego[i].horasEstimadas;
            }
        log.info("El video juego con mas horas estimadas es:\n "
                + juego[posicion].toString());

        return horas;
    }

    /**
     * Metodo que muestra la informacion del video juego
     * @return
     */
    @Override
    public String toString() {
        return "Informacion del video juego:\n"
                + "Titulo: " + titulo + "\n"
                + "Entregado: " + entregado + "\n"
                + "Compañia: " + compania + "\n"
                + "Horas_Estimadas: " + horasEstimadas + "\n"
                + "Genero: " + genero + " \n";

    }
}

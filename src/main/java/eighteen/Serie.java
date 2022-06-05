package eighteen;

import org.jboss.logging.Logger;

public class Serie implements IEntregable {
    Logger log = Logger.getLogger("Mensaje");
    public final static int mayor = 1;
    public final static int menor = -1;
    public final static int igual = 0;
    String titulo;
    Integer numeroTemporadas;
    public boolean entregado;
    String genero;
    String creador;


    /**
     * definicion  de un constructor por defecto
     */
    public Serie() {
        this.numeroTemporadas = 3;
        this.entregado = false;
    }

    /**
     * Un constructor con el titulo y creador como parametro
     *
     * @param titulo
     * @param creador
     */
    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.entregado = false;
        this.numeroTemporadas = 3;
        this.genero = "Miedo";
    }

    /**
     * Un constructor con todos los atributos como parametro
     *
     * @param titulo
     * @param numeroTemporadas
     * @param genero
     * @param creador
     */
    public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.creador = creador;
    }


    public String getCreador() {
        return creador;
    }


    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    @Override
    public int compareTo(Object a) {
        return 0;
    }

    /**
     * * Compara dos series segun su numero de temporadas
     *  <ul>
     * <li>1: La Serie 1 es mayor que la Serie 2</li>
     * <li>0: Las Series son iguales</li>
     *   <li>-1: La Serie 1 es menor que la Serie 2</li></ul>
     *
     * @param
     * @return
     */
    @Override
    public int compareTo(Object a) {
        int estado = menor;

        Serie ref = (Serie) a;
        if (numeroTemporadas > ref.getNumeroTemporadas()) {
            estado = mayor;
        } else if (numeroTemporadas == ref.getNumeroTemporadas()) {
            estado = igual;
        }

        return estado;

    }

    /**
     * Indica si dos Series son iguales, siendo el titulo y creador iguales
     *
     * @param a Serie a comparar
     * @return true si son iguales y false si son distintos
     */
    public boolean equals(Serie a) {
        if (titulo.equalsIgnoreCase(a.getTitulo()) && creador.equalsIgnoreCase(a.getCreador())) {
            return true;
        }
        return false;
    }

    /**
     * Metodo para calcular la serie con mayor numero temporadas
     *
     * @param series
     * @return
     */

    public int calcularTemporada(Serie series[]) {
        int temporadas = 0;
        int posicion = 0;
        for (int i = 0; i < series.length; i++)
            if (series[i].numeroTemporadas > temporadas) {
                posicion = i;
                temporadas = series[i].numeroTemporadas;
            }
        log.info("La serie con mayor numero de temporadas es:\n "
                + series[posicion].toString());

        return temporadas;
    }

    /**
     * Metodo toString que muestra la informacion de la serie, con la anotación override
     *
     * @return
     */
    @Override
    public String toString() {
        return "Informacion de la serie:\n"
                + "Titulo: " + titulo + "\n"
                + "Numero_Temporadas: " + numeroTemporadas + "\n"
                + "Entregado: " + entregado + "\n"
                + "Genero: " + genero + "\n"
                + "Creador: " + creador + " \n";


    }

}

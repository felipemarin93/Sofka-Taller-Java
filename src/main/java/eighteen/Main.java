package eighteen;

import org.jboss.logging.Logger;

/**
 * * @author Daniel Felipe Marin  - felipemariniraldo@gmail.com
 * v1.0
 * Clase Main donde se instancian los Objetos tipo Array y se llena para utilizar los métodos de las clases serie y videojuego
 * además se especifica que est clase es la que retorna las salidas por consola
 */
public class Main {
    public static void main(String[] args) {

        Logger log = Logger.getLogger("Mensaje");
        log.info("<<<Bienvenido al programa>>>");
        Serie[] series = new Serie[5];
        Videojuego[] juego = new Videojuego[5];
        series[0] = new Serie("LaCasaDePapel", 5, "atracos", "NN");
        series[1] = new Serie("Walking Dead", 10, "terror", "NN");
        series[2] = new Serie("Stranger Things", "Juan");
        series[3] = new Serie("calamar", "japonini");
        series[4] = new Serie("pablo escobar", 4, "violencia", "caracol");
        juego[0] = new Videojuego("FIFA21", "EASportd", 16, "deporte");
        juego[1] = new Videojuego("POKEMON", "PokeDev", 190, "Rol");
        juego[2] = new Videojuego("LOL", 12);
        juego[3] = new Videojuego("CoD MOBILE", 700);
        juego[4] = new Videojuego("FORTNITE", 600);

        Serie retornarTemporadas = new Serie();
        Videojuego retornarHoras = new Videojuego();
        retornarTemporadas.calcularTemporada(series);
        retornarHoras.calcularHoras(juego);

        for (int i = 0; i < series.length; i++) {
            if (i % 2 == 0) {
                series[i].entregar();
            }
        }
        for (int i = 0; i < juego.length; i++) {
            if (i % 2 == 0) {
                juego[i].entregar();
            }
        }
        for (Serie serie : series) {
            if (serie.entregado) {

                log.info("Las series que tienen de estado true son : \n" + serie);

            }
        }
        for (Videojuego value : juego) {
            if (value.entregado) {

                log.info("Los juegos que tienen de estado true son : \n" + value);
            }
        }
        for (Videojuego videojuego : juego) {
            log.info("El estado del atributo prestado del juego : " + videojuego.titulo
                    + "\n " + "es:" + videojuego.isEntregado());
        }
        for (Serie serie : series) {
            log.info("El estado del atributo prestado de la serie : " + serie.titulo
                    + "\n " + "es:" + serie.isEntregado());
        }
        log.info("");
        Serie serieMayor = series[0];
        Videojuego videojuegoMayor = juego[0];

        for (int i = 1; i < series.length; i++) {
            if (series[i].compareTo(serieMayor) == Serie.mayor) {
                serieMayor = series[i];
            }
            if (juego[i].compareTo(videojuegoMayor) == Videojuego.mayor) {
                videojuegoMayor = juego[i];
            }

        }

        log.info("El video juego mas jugado es: \n" + videojuegoMayor);
        log.info("La serie con mas temporadas es: \n" + serieMayor);
    }
}

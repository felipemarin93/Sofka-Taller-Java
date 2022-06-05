package eighteen;

import org.jboss.logging.Logger;

public class Main {
    public static void main(String[] args) {

        Logger log = Logger.getLogger("Mensaje");
        log.info("<<<Bienvenido al programa>>>");
        Serie series[] = new Serie[5];
        Videojuego juego[] = new Videojuego[5];
        series[0] = new Serie("la diosa", 12, "comedia", "robinson");
        series[1] = new Serie("dios", 12, "terror", "marlon");
        series[2] = new Serie("la selva", "maria");
        series[3] = new Serie("calamar", "japonini");
        series[4] = new Serie("pablo escobar", 96, "violencia", "caracol");
        juego[0] = new Videojuego("futbol", "konami", 10, "deporte");
        juego[1] = new Videojuego("the witcher", "red studio", 300, "RPG");
        juego[2] = new Videojuego("Fifa Street", 12);
        juego[3] = new Videojuego("call of duty", 700);
        juego[4] = new Videojuego("free fire", 600);

        Serie retornarTemporadas = new Serie();
        Videojuego retornarHoras = new Videojuego();
        retornarTemporadas.calcularTemporada(series);
        retornarHoras.calcularHoras(juego);

/**
 * Entrega algunos Videojuegos y Series con el método entregar().
 */
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
        /**
         * Me devuelve las series y video juegos entregadas
         */
        for (int i = 0; i < series.length; i++) {
            if (series[i].entregado == true) {

                System.out.println("Las series que tienen de estado true son : \n" + series[i].toString());

            }
        }
        for (int i = 0; i < juego.length; i++) {
            if (juego[i].entregado == true) {

                System.out.println("Los juegos que tienen de estado true son : \n" + juego[i].toString());
            }
        }
        /**
         * Me devuelve el estado del atributo entregado
         */
        for (int i = 0; i < juego.length; i++) {
            log.info("El estado del atributo prestado del juego : " + juego[i].titulo
                    + "\n " + "es:" + juego[i].isEntregado());
        }
        for (int i = 0; i < series.length; i++) {
            log.info("El estado del atributo prestado de la serie : " + series[i].titulo
                    + "\n " + "es:" + series[i].isEntregado());
        }
        System.out.println("");
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

        log.info("El video juego mayor es: \n + videojuegoMayor");
        log.info("La serie mayor es: \n" + serieMayor);
    }

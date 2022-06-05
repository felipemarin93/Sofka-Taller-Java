package eighteen;


/**
 * * @author Daniel Felipe Marin  - felipemariniraldo@gmail.com
 * v1.0
 * Interface para manejar los métodos a implementar en la clase Serie y Videojuego
 */
public interface IEntregable {

    public void entregar();

    public void devolver();

    public boolean isEntregado();

    public int compareTo(Object a);

}
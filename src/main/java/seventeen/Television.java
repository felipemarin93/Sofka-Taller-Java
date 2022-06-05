package seventeen;

public class Television extends Electrodomestico {

    double resolucion;
    boolean sintonizador_TDT;

    /**
     * Constructor por defecto
     */
    public Television() {
        this.sintonizador_TDT = false;
        this.resolucion = 20;


    }

    /**
     * Un constructor con el precio y peso
     *
     * @param precioBase
     * @param peso
     */
    public Television(double precioBase, double peso) {
        super(precioBase, peso);
        this.sintonizador_TDT = false;
        this.resolucion = 20;

    }

    /**
     * Un constructor con la resolución, sintonizador TDT y el resto de atributos heredados
     *
     * @param color
     * @param consumoEnergetico
     * @param precioBase
     * @param peso
     * @param resolucion
     * @param sintonizador_TDT
     */
    public Television(String color, char consumoEnergetico, double precioBase, double peso, double resolucion, boolean sintonizador_TDT) {
        super(color, consumoEnergetico, precioBase, peso);
        this.resolucion = resolucion;
        this.sintonizador_TDT = sintonizador_TDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    /**
     * contructor que condiciona que si se tiene una resolución mayor de 40 pulgadas,
     * se incrementara el precio un 30% y si tiene un sintonizador TDT incorporado, aumentara 50 €
     *
     * @return
     */
    public double precioFinal() {
        double max = super.precioFinal();
        if (resolucion > 40) {
            max += precioBase * 0.3;
        } else if (sintonizador_TDT) {
            max += 50;
        }

        return max;
    }

}

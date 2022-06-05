package seventeen;



/**
 * * @author Daniel Felipe Marin  - felipemariniraldo@gmail.com
 * v1.0
 * Clase television que extiende atributos y métodos de Electrodomestico
 * se usa herencia y polimorfismo
 */
public class Television extends Electrodomestic {

    double resolution;
    boolean tunerTdt;

    /**
     * Constructor por defecto
     */
    public Television() {
        this.tunerTdt = false;
        this.resolution = 20;


    }

    /**
     * Un constructor con el precio y peso
     *
     * @param basePrice
     * @param weight
     */
    public Television(double basePrice, double weight) {
        super(basePrice, weight);
        this.tunerTdt = false;
        this.resolution = 20;

    }

    /**
     * Un constructor con la resolución, sintonizador TDT y el resto de atributos heredados
     *
     * @param color
     * @param energyConsumption
     * @param basePrice
     * @param weight
     * @param resolution
     * @param tunerTdt
     */
    public Television(String color, char energyConsumption, double basePrice, double weight, double resolution, boolean tunerTdt) {
        super(color, energyConsumption, basePrice, weight);
        this.resolution = resolution;
        this.tunerTdt = tunerTdt;
    }

    public double getResolution() {
        return resolution;
    }

    public boolean getTunerTdt() {
        return tunerTdt;
    }

    /**
     * contructor que condiciona que si se tiene una resolución mayor de 40 pulgadas,
     * se incrementara el precio un 30% y si tiene un sintonizador TDT incorporado, aumentara 50 €
     *
     * @return
     */
    @Override
    public double getFinalPrice() {
        double increasePrice = super.getFinalPrice();
        if (resolution > 40) {
            increasePrice += basePrice * 0.3;
        } else if (tunerTdt) {
            increasePrice += 50;
        }

        return increasePrice;
    }

}

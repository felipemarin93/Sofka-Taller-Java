package seventeen;

public class WashingMachine extends Electrodomestic {

    int charge;
    public static final int defaultCharge = 5;

    /**
     *Un constructor por defecto
     */
    public WashingMachine() {

    }

    /**
     * Un constructor con el precio y peso
     * @param basePrice
     * @param weight
     */
    public WashingMachine(double basePrice, double weight) {
        super(basePrice, weight);

    }

    /**
     * Un constructor con la carga y el resto de atributos heredados
     * @param color
     * @param energyConsumption
     * @param basePrice
     * @param weight
     * @param charge
     */
    public WashingMachine(String color, char energyConsumption, double basePrice, double weight, int charge) {
        super(color, energyConsumption, basePrice, weight);
        this.charge = charge;
    }

    public int getCharge() {
        return charge;
    }

    /**
     * Metododo que hace la condicion que si tiene una carga mayor de 30 kg, aumentara el precio 50 €,
     * sino es así no se incrementara el precio
     * @return
     */
    @Override
    public double getFinalPrice() {
        double increasePrice = super.getFinalPrice();
        if (charge > 30) {
            increasePrice += 50;

        }
        return increasePrice;
    }
}

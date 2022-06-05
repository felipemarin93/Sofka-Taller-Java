package seventeen;

public class Lavadora extends Electrodomestic {

    int charge;
    public static final int carga_def = 5;

    /**
     *Un constructor por defecto
     */
    public Lavadora() {

    }

    /**
     * Un constructor con el precio y peso
     * @param precioBase
     * @param peso
     */
    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);

    }

    /**
     * Un constructor con la carga y el resto de atributos heredados
     * @param color
     * @param consumoEnergetico
     * @param precioBase
     * @param peso
     * @param charge
     */
    public Lavadora(String color, char consumoEnergetico, double precioBase, double peso, int charge) {
        super(color, consumoEnergetico, precioBase, peso);
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
    public double precioFinal() {
        double max = super.precioFinal();
        if (charge > 30) {
            max += 50;

        }
        return max;
    }
}

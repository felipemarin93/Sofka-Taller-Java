package seventeen;


import org.jboss.logging.Logger;

public class Electrodomestic {

    Logger log = Logger.getLogger("Mensaje");
    public static final String defaultColor = "Blanco";
    public static final char defaultEnergyConsumption = 'F';
    public static final double defaultBasePrice = 100;
    public static final double defaultWeight = 5;
    String electrodomesticColor;
    char powerConsumption;
    double basePrice;
    double electrodomesticWeight;

    /**
     * Creación constructor por Defecto
     */
    public Electrodomestic() {

    }

    /**
     * Creación constructor precio y peso
     *
     * @param basePrice
     * @param electrodomesticWeight
     */
    public Electrodomestic(double basePrice, double electrodomesticWeight) {
        this.basePrice = basePrice;
        this.electrodomesticWeight = electrodomesticWeight;
    }

    /**
     * Un constructor con todos los atributos.
     *
     * @param electrodomesticColor
     * @param energyConsumption
     * @param basePrice
     * @param electrodomesticWeight
     */

    public Electrodomestic(String electrodomesticColor, char energyConsumption, double basePrice, double electrodomesticWeight) {
        this.electrodomesticColor = electrodomesticColor;
        this.powerConsumption = energyConsumption;
        this.basePrice = basePrice;
        this.electrodomesticWeight = electrodomesticWeight;

    }

    /**
     * Métodos get de todos los atributos.
     *
     * @return
     */


    public String getElectrodomesticColor() {
        return electrodomesticColor;
    }


    public char getPowerConsumption() {
        return powerConsumption;
    }


    public double getBasePrice() {
        return basePrice;
    }


    public double getElectrodomesticWeight() {
        return electrodomesticWeight;
    }

    /**
     * comprueba que el color es correcto, sino lo es usa el color por defecto
     *
     * @param color
     */
    public void comprobarColor(String color) {
        String[] colores = {"blancos", "negro", "rojo", "azul", "gris"};
        boolean encontrado = false;
        for (int i = 0; i < colores.length && !encontrado; i++) {
            if (colores[i].equalsIgnoreCase(color)) {
                encontrado = true;

            } else if (encontrado) {
                this.electrodomesticColor = color;

            } else {
                this.electrodomesticColor = defaultColor;
            }

        }
    }

    /**
     * comprueba que la letra es correcta, sino es correcta usara la letra por defecto
     *
     * @param letra
     */
    private void comprobarConsumoEnergetico(char letra) {
        if (powerConsumption =='F') {
            powerConsumption = 'F';
        } else if (powerConsumption == 'A') {
            powerConsumption = 'A';
        } else if (powerConsumption == 'B') {
            powerConsumption = 'B';
        } else if (powerConsumption == 'C') {
            powerConsumption = 'C';
        } else if (powerConsumption == 'D') {
            powerConsumption = 'D';
        } else if (powerConsumption == 'E') {
            powerConsumption = 'E';
        } else {
            powerConsumption = 'F';
        }

    }

    /**
     * según el consumo energético, aumentara su precio, y según su tamaño, también
     *
     * @return
     */
    public double getFinalPrice() {
        double maximumPrice = 0;
        switch (powerConsumption) {
            case 'A':
                maximumPrice += 100;
                break;
            case 'B':
                maximumPrice += 80;
                break;
            case 'C':
                maximumPrice += 60;
                break;
            case 'D':
                maximumPrice += 50;
                break;
            case 'E':
                maximumPrice += 30;
                break;
            case 'F':
                maximumPrice += 10;
                break;
            default:{
                    log.info("No existe categoria");
            }
        }
        if (electrodomesticWeight >= 0 && electrodomesticWeight < 19) {
            maximumPrice += 10;
        } else if (electrodomesticWeight >= 20 && electrodomesticWeight < 49) {
            maximumPrice += 50;
        } else if (electrodomesticWeight >= 50 && electrodomesticWeight < 79) {
            maximumPrice += 80;

        } else if (electrodomesticWeight > 80) {
            maximumPrice += 100;
        }

        return basePrice + maximumPrice;
    }


}

package seventeen;


import org.jboss.logging.Logger;

/**
 * * @author Daniel Felipe Marin  - felipemariniraldo@gmail.com
 * v1.0
 * Clase main para ejecutar el proyecto
 */
public class Main {

    public static void main(String[] args) {

        Logger log = Logger.getLogger("Mensaje");
        log.info("<<<Bienvenido al programa de Electrodomésticos>>>");
        Electrodomestic[] electrdomesticList = new Electrodomestic[10];

        electrdomesticList[0] = new Electrodomestic("verde", 'F', 100, 9);
        electrdomesticList[1] = new WashingMachine(400, 30);
        electrdomesticList[2] = new Television("verde", 'E', 200, 20, 9, false);
        electrdomesticList[3] = new Electrodomestic(300, 3);
        electrdomesticList[4] = new Electrodomestic("amarillo", 'B', 200, 4);
        electrdomesticList[5] = new WashingMachine("gris", 'C', 500, 2.4, 6);
        electrdomesticList[6] = new Television(600, 70);
        electrdomesticList[7] = new WashingMachine("roja", 'A', 700, 23, 15);
        electrdomesticList[8] = new Television("morado", 'C', 800, 45, 20, true);
        electrdomesticList[9] = new Electrodomestic(900, 10);


        double electrodomesticAddition = 0;
        double televisionAdition = 0;
        double washingMachineAddition = 0;


        for (int i = 0; i < electrdomesticList.length; i++) {

            if (electrdomesticList[i] instanceof Electrodomestic) {
                electrodomesticAddition += electrdomesticList[i].getFinalPrice();
            }
            if (electrdomesticList[i] instanceof WashingMachine) {
                washingMachineAddition += electrdomesticList[i].getFinalPrice();
            }
            if (electrdomesticList[i] instanceof Television) {
                televisionAdition += electrdomesticList[i].getFinalPrice();
            }
        }
        double totalSummary = electrodomesticAddition + washingMachineAddition + televisionAdition;

        log.info("La suma del precio de los electrodomesticos es de: " + electrodomesticAddition);
        log.info("La suma del precio de las lavadoras es de: " + washingMachineAddition);
        log.info("La suma del precio de las televisiones es de: " + televisionAdition);
        log.info("La suma del precio total de los electrodomesticos es de: " + totalSummary);

    }
}

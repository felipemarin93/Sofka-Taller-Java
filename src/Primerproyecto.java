import java.util.Scanner;

public class Primerproyecto {

    public static void main(String[] args) {

        System.out.println("Bienvenid@ al programa que imprime su nombre, celular y edad.");

        String name;
        long phoneNumber;
        int age;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese su nombre completo");
        name = sc.nextLine();
        System.out.println("Por favor ingrese su número de celular");
        phoneNumber = sc.nextLong();
        System.out.println("Por favor ingrese su edad");
        age = sc.nextInt();

        System.out.println("Bienvenido señor "+ name +", es un placer para nosotros contar con una persona de "+ age +" años. " +
                "Próximamente nos comunicaremos con usted al numero " + phoneNumber + ". Feliz día");

    }
}
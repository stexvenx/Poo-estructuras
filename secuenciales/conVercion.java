package secuenciales;
import java.util.Scanner;

public class conVercion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double celsius, fahrenheit, kelvin;

        System.out.print("Ingrese temperatura en Celsius: ");
        celsius = sc.nextDouble();

        fahrenheit = (celsius * 9 / 5) + 32;
        kelvin = celsius + 273.15;

        System.out.println("Celsius: " + celsius + " °C");
        System.out.println("Fahrenheit: " + fahrenheit + " °F");
        System.out.println("Kelvin: " + kelvin + " K");

        sc.close();
    }
}
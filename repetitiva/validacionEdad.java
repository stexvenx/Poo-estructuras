package repetitiva;

import java.util.Scanner;

public class validacionEdad {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int edad;

        System.out.print("Ingrese edad: ");
        edad = sc.nextInt();

        while (edad < 1 || edad > 120) {

            System.out.println("Edad inválida");
            System.out.print("Ingrese nuevamente: ");
            edad = sc.nextInt();
        }

        if (edad <= 12) {
            System.out.println("Niñez");
        } else if (edad <= 17) {
            System.out.println("Adolescencia");
        } else if (edad <= 25) {
            System.out.println("Juventud");
        } else if (edad <= 59) {
            System.out.println("Adultez");
        } else {
            System.out.println("Tercera edad");
        }

        sc.close();
    }
}
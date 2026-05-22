package repetitiva;

import java.util.Scanner;

public class adivinarN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = (int)(Math.random() * 100) + 1;
        int intento = 0;
        int usuario = 0;

        while (usuario != numero) {

            System.out.print("Adivine el número: ");
            usuario = sc.nextInt();

            intento++;

            if (usuario < numero) {
                System.out.println("El número es mayor");
            } else if (usuario > numero) {
                System.out.println("El número es menor");
            } else {
                System.out.println("Correcto en " + intento + " intentos");
            }
        }

        sc.close();
    }
}
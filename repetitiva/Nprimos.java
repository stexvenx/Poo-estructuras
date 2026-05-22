package repetitiva;

import java.util.Scanner;

public class Nprimos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b;
        int cantidad = 0;
        int suma = 0;

        System.out.print("Ingrese número inicial: ");
        a = sc.nextInt();

        System.out.print("Ingrese número final: ");
        b = sc.nextInt();

        System.out.print("Primos: ");

        for (int i = a; i <= b; i++) {

            int divisor = 2;
            boolean primo = true;

            while (divisor <= Math.sqrt(i)) {

                if (i % divisor == 0) {
                    primo = false;
                }

                divisor++;
            }

            if (i > 1 && primo) {

                System.out.print(i + " ");

                cantidad++;
                suma += i;
            }
        }

        System.out.println();
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Suma: " + suma);

        sc.close();
    }
}
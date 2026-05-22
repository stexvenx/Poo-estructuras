package repetitiva;

import java.util.Scanner;

public class seriesMatematicas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        int suma1 = 0;
        int suma2 = 0;
        int suma3 = 0;

        System.out.print("Ingrese n: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            suma1 += i;
            suma2 += (2 * i);
            suma3 += (i * i);
        }

        System.out.println("Suma naturales: " + suma1);
        System.out.println("Fórmula: " + (n * (n + 1) / 2));

        System.out.println("Suma pares: " + suma2);
        System.out.println("Fórmula: " + (n * (n + 1)));

        System.out.println("Suma cuadrados: " + suma3);
        System.out.println("Fórmula: " + (n * (n + 1) * (2 * n + 1) / 6));

        sc.close();
    }
}
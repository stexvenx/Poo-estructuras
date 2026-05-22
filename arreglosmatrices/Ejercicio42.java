package arreglosmatrices;

import java.util.Scanner;

public class Ejercicio42 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Ingrese tamaño del arreglo: ");
        n = sc.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Ingrese número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.print("Original: ");

        for (int i = 0; i < n; i++) {
            System.out.print(numeros[i] + " ");
        }

        for (int i = 0; i < n / 2; i++) {

            int aux = numeros[i];

            numeros[i] = numeros[n - 1 - i];

            numeros[n - 1 - i] = aux;
        }

        System.out.println();

        System.out.print("Invertido: ");

        for (int i = 0; i < n; i++) {
            System.out.print(numeros[i] + " ");
        }

        sc.close();
    }
}
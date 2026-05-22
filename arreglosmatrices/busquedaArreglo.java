package arreglosmatrices;

import java.util.Scanner;

public class    busquedaArreglo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] nombres = new String[8];

        for (int i = 0; i < nombres.length; i++) {

            System.out.print("Ingrese nombre: ");
            nombres[i] = sc.nextLine();
        }

        System.out.print("Nombre a buscar: ");
        String buscar = sc.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < nombres.length; i++) {

            if (nombres[i].equalsIgnoreCase(buscar)) {

                System.out.println("Nombre encontrado en posición " + i);

                encontrado = true;
            }
        }

        if (encontrado == false) {
            System.out.println("Nombre no encontrado");
        }

        sc.close();
    }
}
package arreglosmatrices;

import java.util.Scanner;

public class registroVentas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] ventas = new double[4][3];

        double mayor = 0;
        int sucursalMayor = 0;
        int productoMayor = 0;

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print("Ingrese venta sucursal " + (i + 1) +
                        " producto " + (j + 1) + ": ");

                ventas[i][j] = sc.nextDouble();

                if (ventas[i][j] > mayor) {

                    mayor = ventas[i][j];
                    sucursalMayor = i;
                    productoMayor = j;
                }
            }
        }

        System.out.println("--- Ventas por sucursal ---");

        for (int i = 0; i < 4; i++) {

            double sumaFila = 0;

            for (int j = 0; j < 3; j++) {
                sumaFila += ventas[i][j];
            }

            System.out.println("Sucursal " + (i + 1) + ": $" + sumaFila);
        }

        System.out.println("--- Ventas por producto ---");

        for (int j = 0; j < 3; j++) {

            double sumaColumna = 0;

            for (int i = 0; i < 4; i++) {
                sumaColumna += ventas[i][j];
            }

            System.out.println("Producto " + (j + 1) + ": $" + sumaColumna);
        }

        System.out.println("Venta más alta: $" + mayor +
                " (Sucursal " + (sucursalMayor + 1) +
                ", Producto " + (productoMayor + 1) + ")");

        sc.close();
    }
}
package arreglosmatrices;

import java.util.Scanner;

public class estadisticasGrupo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] notas = new double[10];

        double suma = 0;
        double mayor;
        double menor;

        int posMayor = 0;
        int posMenor = 0;

        int aprobaron = 0;
        int reprobaron = 0;

        for (int i = 0; i < notas.length; i++) {

            System.out.print("Ingrese nota del estudiante " + i + ": ");
            notas[i] = sc.nextDouble();

            suma += notas[i];

            if (notas[i] >= 3.0) {
                aprobaron++;
            } else {
                reprobaron++;
            }
        }

        mayor = notas[0];
        menor = notas[0];

        for (int i = 0; i < notas.length; i++) {

            if (notas[i] > mayor) {
                mayor = notas[i];
                posMayor = i;
            }

            if (notas[i] < menor) {
                menor = notas[i];
                posMenor = i;
            }
        }

        double promedio = suma / notas.length;

        System.out.println("Promedio: " + promedio);
        System.out.println("Nota mayor: " + mayor + " en posición " + posMayor);
        System.out.println("Nota menor: " + menor + " en posición " + posMenor);
        System.out.println("Aprobaron: " + aprobaron);
        System.out.println("Reprobaron: " + reprobaron);

        sc.close();
    }
}
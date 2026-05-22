package secuenciales;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double nota1, nota2, nota3, definitiva;
        String resultado;

        System.out.print("Ingrese primera nota: ");
        nota1 = sc.nextDouble();

        System.out.print("Ingrese segunda nota: ");
        nota2 = sc.nextDouble();

        System.out.print("Ingrese nota final: ");
        nota3 = sc.nextDouble();

        definitiva = (nota1 * 0.30) + (nota2 * 0.30) + (nota3 * 0.40);

        resultado = (definitiva >= 3.0) ? "Aprueba" : "Reprueba";

        System.out.println("Definitiva: " + definitiva);
        System.out.println("Resultado: " + resultado);

        sc.close();
    }
}
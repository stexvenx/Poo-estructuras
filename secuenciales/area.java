package secuenciales;

import java.util.Scanner;

public class area {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double base, altura, radio;
        double areaRect, periRect;
        double areaCirculo, circunferencia;

        System.out.print("Ingrese base del rectángulo: ");
        base = sc.nextDouble();

        System.out.print("Ingrese altura del rectángulo: ");
        altura = sc.nextDouble();

        System.out.print("Ingrese radio del círculo: ");
        radio = sc.nextDouble();

        areaRect = base * altura;
        periRect = 2 * (base + altura);

        areaCirculo = Math.PI * Math.pow(radio, 2);
        circunferencia = 2 * Math.PI * radio;

        System.out.println("Área rectángulo: " + areaRect);
        System.out.println("Perímetro rectángulo: " + periRect);

        System.out.println("Área círculo: " + areaCirculo);
        System.out.println("Circunferencia: " + circunferencia);

        sc.close();
    }
}
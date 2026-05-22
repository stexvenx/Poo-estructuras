package secuenciales;

import java.util.Scanner;

public class viaje {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int minutos, horas, minutosRestantes, segundos;

        System.out.print("Ingrese minutos: ");
        minutos = sc.nextInt();

        horas = minutos / 60;
        minutosRestantes = minutos % 60;
        segundos = minutos * 60;

        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutosRestantes);
        System.out.println("Segundos: " + segundos);

        sc.close();
    }
}
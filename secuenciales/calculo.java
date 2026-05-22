package secuenciales;

import java.util.Scanner;

public class calculo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nombre;
        int horas;
        double valorHora;
        double salarioBruto, descuentoSS, retencion, salarioNeto;

        System.out.print("Ingrese nombre del empleado: ");
        nombre = sc.nextLine();

        System.out.print("Horas trabajadas: ");
        horas = sc.nextInt();

        System.out.print("Valor por hora: ");
        valorHora = sc.nextDouble();

        salarioBruto = horas * valorHora;
        descuentoSS = salarioBruto * 0.08;
        retencion = salarioBruto * 0.05;
        salarioNeto = salarioBruto - descuentoSS - retencion;

        System.out.println("Empleado: " + nombre);
        System.out.println("Salario bruto: $" + salarioBruto);
        System.out.println("Descuento SS: $" + descuentoSS);
        System.out.println("Retención: $" + retencion);
        System.out.println("Salario neto: $" + salarioNeto);

        sc.close();
    }
}
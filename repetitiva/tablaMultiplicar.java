package repetitiva;
import java.util.Scanner;

public class tablaMultiplicar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Ingrese número: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= 12; j++) {

                System.out.print((i * j) + "\t");
            }

            System.out.println();
        }

        sc.close();
    }
}
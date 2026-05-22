package arreglosmatrices;

import java.util.Scanner;

public class tresenRaya {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[][] tablero = new char[3][3];

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                tablero[i][j] = ' ';
            }
        }

        char jugador = 'X';
        boolean ganador = false;
        int movimientos = 0;

        while (!ganador && movimientos < 9) {

            System.out.println("Turno del jugador " + jugador);

            int fila;
            int columna;

            System.out.print("Ingrese fila (0-2): ");
            fila = sc.nextInt();

            System.out.print("Ingrese columna (0-2): ");
            columna = sc.nextInt();

            if (tablero[fila][columna] == ' ') {

                tablero[fila][columna] = jugador;

                movimientos++;

                for (int i = 0; i < 3; i++) {

                    System.out.println(
                        " " + tablero[i][0] + " | " +
                        tablero[i][1] + " | " +
                        tablero[i][2]
                    );

                    if (i < 2) {
                        System.out.println("-----------");
                    }
                }

                if (
                    (tablero[0][0] == jugador && tablero[0][1] == jugador && tablero[0][2] == jugador) ||
                    (tablero[1][0] == jugador && tablero[1][1] == jugador && tablero[1][2] == jugador) ||
                    (tablero[2][0] == jugador && tablero[2][1] == jugador && tablero[2][2] == jugador) ||

                    (tablero[0][0] == jugador && tablero[1][0] == jugador && tablero[2][0] == jugador) ||
                    (tablero[0][1] == jugador && tablero[1][1] == jugador && tablero[2][1] == jugador) ||
                    (tablero[0][2] == jugador && tablero[1][2] == jugador && tablero[2][2] == jugador) ||

                    (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) ||
                    (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador)
                ) {

                    ganador = true;

                    System.out.println("Ganó el jugador " + jugador);

                } else {

                    if (jugador == 'X') {
                        jugador = 'O';
                    } else {
                        jugador = 'X';
                    }
                }

            } else {

                System.out.println("Casilla ocupada");
            }
        }

        if (!ganador) {
            System.out.println("Empate");
        }

        sc.close();
    }
}
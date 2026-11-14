package ejercicios.paquete4;

import java.util.Scanner;

public class CuadradoAsteriscos2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de filas: ");
        int tamanoFilas = sc.nextInt();
        System.out.print("Número de columnas: ");
        int tamanoColumnas = sc.nextInt();
        // BUCLE EXTERIOR: una vuelta por cada fila

        for (int fila = 1; fila <= tamanoFilas; fila++) {

            if (fila == 1) {
                System.out.print("  ");
                for (int x = 1; x <= tamanoColumnas; x++) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
            System.out.print(fila + " ");
            // BUCLE INTERIOR: tantas columnas como filas, para que sea cuadrado
            for (int columna = 1; columna <= tamanoColumnas; columna++) {
                // print: los asteriscos de la fila quedan en la misma línea

                System.out.print("* ");
            }
            // Al acabar la fila, bajamos al renglón siguiente
            System.out.println();
        }
        sc.close();
    }
}

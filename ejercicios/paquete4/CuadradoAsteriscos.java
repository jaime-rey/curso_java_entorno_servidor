package ejercicios.paquete4;

import java.util.Scanner;

public class CuadradoAsteriscos {
    public static void main() {
        try (Scanner teclado = new Scanner(System.in)) {
            IO.print("Introduce el tamaño del cuadrado: ");
            int tamano = teclado.nextInt();
            for (int fila = 1; fila <= tamano; fila++) {
                for (int columna = 1; columna <= tamano; columna++) {
                    IO.print("*");
                }
                System.out.println();
            }
        }
    }
}

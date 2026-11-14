package ejercicios.paquete4;

import java.util.Scanner;

public class SumaHastaCero {
    public static void main() {
        try (Scanner teclado = new Scanner(System.in)) {
            int suma = 0;
            int numero;
            do {
                IO.print("Introduce un número entero (0 para terminar): ");
                numero = teclado.nextInt();
                suma += numero;
            } while (numero != 0);
            System.out.println("La suma total es: " + suma);
        }
    }
}

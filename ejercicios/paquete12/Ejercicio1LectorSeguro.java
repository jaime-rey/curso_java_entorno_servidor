package ejercicios.paquete12;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Ejercicio1LectorSeguro {
    public static void main(String[] args) {

        // try-with-resources: el Scanner se cierra solo al salir del bloque,
        // es decir, UNA vez, cuando termina el bucle.
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                try {
                    System.out.println("Introduce un número:");
                    String linea = scanner.nextLine(); // consume la línea completa (Enter incluido)
                    int numero = Integer.parseInt(linea.trim()); // trim() quita los espacios de los lados
                    System.out.println("Número introducido: " + numero);
                    if (numero == 42) {
                        throw new RuntimeException("Número prohibido: 42");
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Error: Debes introducir un número entero.");
                } catch (NoSuchElementException e2) {
                    // La entrada se ha cerrado (Ctrl + Z / Ctrl + D): no hay nada más que leer
                    System.out.println("Error: No se ha introducido ningún valor.");
                    break; // Salir del bucle si no hay más entrada
                } catch (Exception e3) {
                    System.out.println("Error inesperado: " + e3.getMessage());
                }
            }
        } // <- aquí se llama automáticamente a scanner.close()
    }
}

package ejercicios.ejerciciosPOO;

import java.util.Scanner;

public class PrincipalTermostato {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Termostato termostato = new Termostato();
            int opcion;

            do {
                System.out.println("\n1. Subir");
                System.out.println("2. Bajar");
                System.out.println("3. Ver estado");
                System.out.println("4. Salir");
                opcion = leerEntero(sc, "Opción: ");

                switch (opcion) {
                    case 1:
                        termostato.subir(leerDecimal(sc, "Grados a subir: "));
                        break;
                    case 2:
                        termostato.bajar(leerDecimal(sc, "Grados a bajar: "));
                        break;
                    case 3:
                        System.out.printf("Temperatura: %.1f °C - Modo: %s%n",
                                termostato.getTemperatura(), termostato.getModo());
                        break;
                    case 4:
                        System.out.println("Hasta luego");
                        break;
                    default:
                        System.out.println("Opción no válida");
                }
            } while (opcion != 4);
        }
    }

    private static double leerDecimal(Scanner sc, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            try {
                return Double.parseDouble(sc.nextLine().trim().replace(',', '.'));
            } catch (NumberFormatException e) {
                System.out.println("No es un número, inténtalo de nuevo");
            }
        }
    }

    private static int leerEntero(Scanner sc, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("No es un número entero, inténtalo de nuevo");
            }
        }
    }
}

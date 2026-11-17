package ejercicios.ejerciciosVarios;

import java.util.Scanner;

public class NotasDeGrupo {
    public static void main() {
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {

            final var minAlumnos = 1;

            var alumnos = pedirEntero(sc, "Ingrese la cantidad de estudiantes (mínimo 1): ", minAlumnos);

            double[] notas = new double[alumnos];
            for (int i = 0; i < alumnos; i++) {
                notas[i] = pedirDato(sc, "Ingrese la nota del estudiante " + (i + 1) + ": ", 0, 10);
            }

            var notaMax = 0d;
            var totalNotas = 0d;

            for (double nota : notas) {
                notaMax = Math.max(notaMax, nota);
                totalNotas += nota;
            }

            System.out.printf("la nota máxima es: %.2f%n", notaMax);
            System.out.printf("La nota media es: %.2f", totalNotas / notas.length);

        }
    }

    // Pide un decimal (con punto o coma) dentro del rango [min, max]
    private static double pedirDato(Scanner sc, String mensaje, double min, double max) {
        while (true) {
            System.out.print(mensaje);
            try {
                double dato = Double.parseDouble(sc.nextLine().trim().replace(',', '.'));
                if (dato >= min && dato <= max) {
                    return dato;
                }
                System.out.println("Debe estar entre " + min + " y " + max);
            } catch (NumberFormatException e) {
                System.out.println("No es un número, vuelve a intentarlo");
            }
        }
    }

    // Pide un entero que sea como mínimo 'min'
    private static int pedirEntero(Scanner sc, String mensaje, int min) {
        while (true) {
            System.out.print(mensaje);
            try {
                int dato = Integer.parseInt(sc.nextLine().trim());
                if (dato >= min) {
                    return dato;
                }
                System.out.println("Debe ser al menos " + min);
            } catch (NumberFormatException e) {
                System.out.println("No es un número entero, vuelve a intentarlo");
            }
        }
    }
}

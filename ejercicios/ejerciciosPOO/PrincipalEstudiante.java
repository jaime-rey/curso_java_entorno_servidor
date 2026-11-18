package ejercicios.ejerciciosPOO;

import java.util.Scanner;

public class PrincipalEstudiante {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Estudiante estudiante = new Estudiante();

            System.out.print("Nombre del estudiante: ");
            estudiante.setNombre(sc.nextLine());

            for (int trimestre = 1; trimestre <= 3; trimestre++) {
                boolean correcta;
                do {
                    double nota = leerDecimal(sc, "Nota del trimestre " + trimestre + ": ");
                    correcta = estudiante.setNota(trimestre, nota);
                } while (!correcta);
            }

            System.out.println();
            estudiante.mostrarBoletin();
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
}

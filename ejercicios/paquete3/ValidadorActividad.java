package ejercicios.paquete3;

import java.util.Scanner;

// Actividad 4: comprueba si una persona puede recibir el diploma del curso
public class ValidadorActividad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // En cada lectura: mientras lo escrito no sea un número, lo descartamos y volvemos a pedirlo
        System.out.print("Introduce la edad: ");
        int edad;
        // Repetimos hasta que escriban un entero que no sea negativo
        while (true) {
            if (!sc.hasNextInt()) {
                System.out.print("Eso no es un número entero. Inténtalo de nuevo: ");
                sc.next(); // Descartamos lo escrito
            } else {
                edad = sc.nextInt();
                if (edad >= 0) {
                    break; // Edad válida: salimos del bucle
                }
                System.out.print("La edad no puede ser negativa. Inténtalo de nuevo: ");
            }
        }

        System.out.print("Introduce el porcentaje de asistencia: ");
        double asistencia;
        while (true) {
            // Aceptamos 85,5 y 85.5: cambiamos la coma por punto, que es lo que entiende Double.parseDouble
            String texto = sc.next().replace(',', '.');
            try {
                asistencia = Double.parseDouble(texto);
                break; // Es un número: salimos del bucle
            } catch (NumberFormatException e) {
                System.out.print("Eso no es un número. Inténtalo de nuevo: ");
            }
        }

        // Deben cumplirse las dos condiciones a la vez
        if (edad >= 18 && asistencia >= 85) {
            System.out.println("Puede recibir el diploma del curso.");
        } else {
            System.out.println("No puede recibir el diploma del curso.");
        }

        sc.close();
    }
}

package ejercicios.ejerciciosPOO;

import java.util.Scanner;

public class PrincipalBiblioteca {
    public static void main(String[] args) {
        String[] titulos = { "El Quijote", "Cien años de soledad", "La sombra del viento" };

        Libro[] libros = new Libro[titulos.length];
        for (int i = 0; i < libros.length; i++) {
            libros[i] = new Libro();
            libros[i].setTitulo(titulos[i]);
        }

        try (Scanner sc = new Scanner(System.in)) {
            int opcion;

            do {
                System.out.println("\n1. Ver catálogo");
                System.out.println("2. Prestar");
                System.out.println("3. Devolver");
                System.out.println("4. Salir");
                opcion = leerEntero(sc, "Opción: ");

                switch (opcion) {
                    case 1:
                        for (int i = 0; i < libros.length; i++) {
                            System.out.println((i + 1) + ". \"" + libros[i].getTitulo() + "\" - "
                                    + libros[i].getEstado());
                        }
                        break;
                    case 2:
                    case 3:
                        int numero = leerEntero(sc, "Número de libro (1 a " + libros.length + "): ");
                        if (numero < 1 || numero > libros.length) {
                            System.out.println("Ese libro no existe");
                            break;
                        }
                        Libro libro = libros[numero - 1];
                        if (opcion == 2) {
                            if (libro.prestar()) {
                                System.out.println("Has cogido \"" + libro.getTitulo() + "\"");
                            } else {
                                System.out.println("No se puede prestar: \"" + libro.getTitulo()
                                        + "\" ya está prestado");
                            }
                        } else {
                            if (libro.devolver()) {
                                System.out.println("Has devuelto \"" + libro.getTitulo() + "\"");
                            } else {
                                System.out.println("No se puede devolver: \"" + libro.getTitulo()
                                        + "\" no estaba prestado");
                            }
                        }
                        break;
                    case 4:
                        System.out.println("\nVeces que se ha prestado cada libro:");
                        for (Libro l : libros) {
                            System.out.println("\"" + l.getTitulo() + "\": " + l.getVecesPrestado());
                        }
                        break;
                    default:
                        System.out.println("Opción no válida");
                }
            } while (opcion != 4);
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

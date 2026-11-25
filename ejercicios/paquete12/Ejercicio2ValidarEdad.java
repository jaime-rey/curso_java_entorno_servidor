package ejercicios.paquete12;

public class Ejercicio2ValidarEdad {

    // Versión 1: pide la edad por teclado hasta que sea válida
    private static void comprobarEdad() {
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            while (true) {
                System.out.println("Introduce tu edad:");
                try {
                    int edad = Integer.parseInt(scanner.nextLine().trim());
                    comprobarEdad(edad); // reutiliza la validación de un entero
                    break; // Salir del bucle si la edad es válida
                } catch (NumberFormatException e) {
                    System.out.println("Error: Debes introducir un número entero.");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    // Versión 2: comprueba un entero. Si no es válido, lanza la excepción
    // y quien llama decide qué hacer con ella.
    private static void comprobarEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("Error: La edad no puede ser negativa (" + edad + ").");
        }
        System.out.println("Edad correcta: " + edad);
    }

    // Versión 3: comprueba todas las edades de un array.
    // Un error en una edad no detiene la comprobación de las demás.
    private static void comprobarEdad(int[] edades) {
        int errores = 0;
        for (int edad : edades) {
            try {
                comprobarEdad(edad);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                errores++;
            }
        }
        System.out.println("Comprobadas " + edades.length + " edades, " + errores + " con error.");
    }

    // Versión 4: comprueba edades recibidas como texto (por ejemplo, los args del
    // main).
    // Aquí puede fallar también la conversión a número, no solo la validación.
    private static void comprobarEdad(String[] textos) {
        int errores = 0;
        for (String texto : textos) {
            try {
                int edad = Integer.parseInt(texto.trim());
                comprobarEdad(edad);
            } catch (NumberFormatException e) {
                System.out.println("Error: \"" + texto + "\" no es un número entero.");
                errores++;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                errores++;
            }
        }
        System.out.println("Comprobados " + textos.length + " argumentos, " + errores + " con error.");
    }

    public static void main(String[] args) {
        // Si se pasan argumentos al ejecutar, se comprueban y termina.
        // Ejemplo: java ejercicios.paquete12.Ejercicio2ValidarEdad 25 -3 hola 40
        if (args.length > 0) {
            System.out.println("--- Argumentos del main ---");
            comprobarEdad(args);
            // return;
        }

        System.out.println("--- Un entero ---");
        try {
            comprobarEdad(25);
            comprobarEdad(-3);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("--- Array de enteros ---");
        comprobarEdad(new int[] { 18, -5, 40, 0, -1 });

        System.out.println("--- Por teclado ---");
        comprobarEdad();
    }
}

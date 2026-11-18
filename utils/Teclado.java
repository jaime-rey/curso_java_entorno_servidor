package utils;

import java.util.Scanner;

/**
 * Utilidades para pedir datos por teclado con validación.
 * Se usa un único Scanner compartido sobre System.in, que no se cierra
 * (cerrarlo cerraría System.in para todo el programa).
 */
public final class Teclado {

    private Teclado() {
        // Clase de utilidad: no se instancia
    }

    private static final Scanner SC = new Scanner(System.in);

    // ---------- Texto y sí/no ----------

    /** Pide un texto y repite si se deja vacío. */
    public static String pedirTexto(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String texto = SC.nextLine().trim();
            if (!texto.isEmpty()) {
                return texto;
            }
            System.out.println("No puede estar vacío, inténtalo de nuevo");
        }
    }

    /**
     * Pide una respuesta s/n (también si/no, true/false) y devuelve true para "sí".
     */
    public static boolean pedirSiNo(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String r = SC.nextLine().trim().toLowerCase();
            if (r.equals("s") || r.equals("si") || r.equals("sí") || r.equals("true")) {
                return true;
            }
            if (r.equals("n") || r.equals("no") || r.equals("false")) {
                return false;
            }
            System.out.println("Responde s o n");
        }
    }

    // ---------- Enteros ----------

    /** Pide un entero y repite hasta que sea válido. */
    public static int pedirEntero(String mensaje) {
        return pedirEntero(mensaje, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /** Pide un entero mayor o igual que min y repite hasta que sea válido. */
    public static int pedirEntero(String mensaje, int min) {
        while (true) {
            System.out.print(mensaje);
            try {
                int dato = Integer.parseInt(SC.nextLine().trim());
                if (dato >= min) {
                    return dato;
                }
                System.out.println("Debe ser al menos " + min);
            } catch (NumberFormatException e) {
                System.out.println("No es un número entero, inténtalo de nuevo");
            }
        }
    }

    /** Pide un entero dentro del rango [min, max] y repite hasta que sea válido. */
    public static int pedirEntero(String mensaje, int min, int max) {
        while (true) {
            System.out.print(mensaje);
            try {
                int dato = Integer.parseInt(SC.nextLine().trim());
                if (dato >= min && dato <= max) {
                    return dato;
                }
                System.out.println("Debe estar entre " + min + " y " + max);
            } catch (NumberFormatException e) {
                System.out.println("No es un número entero, inténtalo de nuevo");
            }
        }
    }

    // ---------- Decimales ----------

    /** Pide un decimal (con punto o coma) y repite hasta que sea válido. */
    public static double pedirDecimal(String mensaje) {
        return pedirDecimal(mensaje, -Double.MAX_VALUE, Double.MAX_VALUE);
    }

    /** Pide un decimal (con punto o coma) dentro del rango [min, max]. */
    public static double pedirDecimal(String mensaje, double min, double max) {
        while (true) {
            System.out.print(mensaje);
            try {
                double dato = Double.parseDouble(SC.nextLine().trim().replace(',', '.'));
                if (dato >= min && dato <= max) {
                    return dato;
                }
                System.out.println("Debe estar entre " + min + " y " + max);
            } catch (NumberFormatException e) {
                System.out.println("No es un número, inténtalo de nuevo");
            }
        }
    }
}

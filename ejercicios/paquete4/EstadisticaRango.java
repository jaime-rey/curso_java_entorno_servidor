package ejercicios.paquete4;

public class EstadisticaRango {
    public static void main() {

        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {

            int inicial = leerEntero(sc, "Ingrese el elemento inicial: ");

            int fin = leerEntero(sc, "Ingrese el elemento final: ");

            if (inicial > fin) {
                System.out.println(
                        "El elemento inicial no puede ser mayor que el elemento final. Se intercambian los valores.");
                int temp = inicial;
                inicial = fin;
                fin = temp;
            }

            int sumaDePares = calcularSumaDePares(inicial, fin);
            System.out.println("La suma de los números pares en el rango es: " + sumaDePares);

            int cantidadDeImpares = calcularCantidadDeImpares(inicial, fin);
            System.out.println("La cantidad de números impares en el rango es: " + cantidadDeImpares);

            int cantidadDeMutiplosDeCinco = calcularCantidadDeMutiplosDeCinco(inicial, fin);
            System.out.println("La cantidad de múltiplos de cinco en el rango es: " + cantidadDeMutiplosDeCinco);
        }
    }

    private static int leerEntero(java.util.Scanner sc, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            if (sc.hasNextInt()) {
                return sc.nextInt();
            }
            System.out.println("Entrada no válida. Debe introducir un número entero.");
            sc.next();
        }
    }

    private static int calcularCantidadDeMutiplosDeCinco(int inicial, int fin) {
        int cantidad = 0;
        for (int i = inicial; i <= fin; i++) {
            if (i != 0 && i % 5 == 0) {
                cantidad++;
            }
        }
        return cantidad;
    }

    private static int calcularCantidadDeImpares(int inicial, int fin) {
        int cantidad = 0;
        for (int i = inicial; i <= fin; i++) {
            if (i != 0 && i % 2 != 0) {
                cantidad++;
            }
        }
        return cantidad;
    }

    private static int calcularSumaDePares(int inicial, int fin) {
        int suma = 0;
        for (int i = inicial; i <= fin; i++) {
            if (i != 0 && i % 2 == 0) {
                suma += i;
            }
        }
        return suma;
    }
}

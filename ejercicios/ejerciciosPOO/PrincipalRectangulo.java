package ejercicios.ejerciciosPOO;

import java.util.Scanner;

public class PrincipalRectangulo {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            Rectangulo r = new Rectangulo();

            r.setBase(leerDecimal(teclado, "Base: "));
            r.setAltura(leerDecimal(teclado, "Altura: "));

            if (r.getArea() == 0) {
                System.out.println("Datos no válidos: no se puede calcular el rectángulo");
                return;
            }

            System.out.println("Área: " + r.getArea());
            System.out.println("Perímetro: " + r.getPerimetro());
            System.out.println("Diagonal: " + Math.round(r.getDiagonal() * 100) / 100.0);
            System.out.println("¿Es un cuadrado? " + (r.esCuadrado() ? "Sí" : "No"));
        }
    }

    // Acepta decimales con coma o con punto
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

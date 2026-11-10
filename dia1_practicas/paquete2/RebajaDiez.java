package paquete2;

import java.util.Scanner;

public class RebajaDiez {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nombre del artículo: ");
            String articulo = sc.nextLine();

            System.out.print("Precio: ");
            double precio = Double.parseDouble(sc.nextLine().trim().replace(',', '.'));

            double precioFinal = precio * 0.90;

            System.out.println("Artículo: " + articulo);
            System.out.println("Precio original: " + String.format("%.2f", precio) + " €");
            System.out.println("Precio con 10% de descuento: " + String.format("%.2f", precioFinal) + " €");
        }
    }
}

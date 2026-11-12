package ejercicios.paquete3;

import java.util.Scanner;

// Actividad 3: aplica un descuento según el importe de la compra
public class DescuentoPorTramos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el importe de la compra (€): ");
        double importe;
        // Repetimos hasta que escriban un número válido
        while (true) {
            // Aceptamos 12,5 y 12.5: cambiamos la coma por punto, que es lo que entiende Double.parseDouble
            String texto = sc.next().replace(',', '.');
            try {
                importe = Double.parseDouble(texto);
                break; // Es un número: salimos del bucle
            } catch (NumberFormatException e) {
                System.out.print("Eso no es un número. Inténtalo de nuevo: ");
            }
        }

        double descuento;

        if (importe < 50) {
            descuento = 0; // Sin descuento
        } else if (importe <= 100) {
            descuento = 0.05; // Entre 50 y 100 (incluidos): 5%
        } else {
            descuento = 0.15; // Más de 100: 15%
        }

        double precioFinal = importe - (importe * descuento);

        System.out.println("Descuento aplicado: " + (int) (descuento * 100) + "%");
        System.out.printf("Precio final a pagar: %.2f €%n", precioFinal);

        sc.close();
    }
}

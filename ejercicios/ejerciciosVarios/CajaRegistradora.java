package ejercicios.ejerciciosVarios;

public class CajaRegistradora {

    public static void main() {

        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {

            double total = 0;
            int contador = 0;

            System.out.println("Bienvenido a la caja registradora.");

            while (true) {

                System.out.print("Ingrese el precio del producto (0 para terminar): ");
                double precio = Double.parseDouble(sc.nextLine().replace(',', '.'));

                if (precio == 0) {

                    break;

                } else if (precio > 0) {

                    System.out.println("Producto agregado: " + precio);
                    total += precio;
                    contador++;

                } else {

                    System.out.println("Precio inválido. Debe ser mayor que 0.");

                }
            }

            if (contador == 0) {
                System.out.println("Salida sin compra.");
                return;
            }

            System.out.println("Total de productos: " + contador);

            if (total >= 100) {

                System.out.println("Total antes del descuento: " + total);
                System.out.println("Se aplica descuento del 10%");
                total *= 0.9;

            }

            System.out.println("Total a pagar: " + total);

        }
    }
}

package ejercicios.paquete7;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class PrincipalProductoIva {
    public static void main() {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        ProductoIva[] cesta = {
                new ProductoIva("Portátil", 600),
                new ProductoIva("Pan", 1.20, 4),
                new ProductoIva("Libro", 18.50, 4),
                new ProductoIva("Menú del día", 12.50, 10),
                new ProductoIva("Auriculares", 45, 15)
        };

        System.out.println("---- TICKET ----");
        double total = 0;
        for (ProductoIva p : cesta) {
            p.mostrarLinea();
            total += p.getPrecioFinal();
        }
        System.out.println("----------------");
        System.out.printf("TOTAL: %.2f €%n", total);
    }
}

package ejercicios.ejerciciosPOO;

public class CarritoCompra {
    private static final int CAPACIDAD = 5;
    private static final double ENVIO_GRATIS = 50;

    private String[] articulos = new String[CAPACIDAD];
    private double[] precios = new double[CAPACIDAD];
    private int numArticulos;

    // Devuelve true si el artículo se ha guardado
    public boolean anadir(String articulo, double precio) {
        if (precio <= 0) {
            System.out.println("Rechazado: precio no válido para " + articulo + " (" + precio + ")");
            return false;
        }
        if (numArticulos >= CAPACIDAD) {
            System.out.println("Rechazado: el carrito está lleno, no cabe " + articulo);
            return false;
        }
        articulos[numArticulos] = articulo;
        precios[numArticulos] = precio;
        numArticulos++;
        return true;
    }

    public double getTotal() {
        double total = 0;
        for (int i = 0; i < numArticulos; i++) {
            total += precios[i];
        }
        return Math.round(total * 100) / 100.0;
    }

    public void mostrarTicket() {
        System.out.println("--- Ticket ---");
        for (int i = 0; i < numArticulos; i++) {
            System.out.printf("%-12s %6.2f €%n", articulos[i], precios[i]);
        }
        double total = getTotal();
        System.out.printf("TOTAL: %.2f €%n", total);
        if (total >= ENVIO_GRATIS) {
            System.out.println("Envío gratuito");
        } else {
            System.out.printf("Te faltan %.2f € para el envío gratuito%n", ENVIO_GRATIS - total);
        }
    }
}

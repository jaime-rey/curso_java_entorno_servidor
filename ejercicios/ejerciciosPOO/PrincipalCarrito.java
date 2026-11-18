package ejercicios.ejerciciosPOO;

public class PrincipalCarrito {
    public static void main(String[] args) {
        String[] nombres = { "Ratón", "Alfombrilla", "Cable HDMI", "Auriculares", "Webcam", "Hub USB",
                "Soporte portátil" };
        double[] precios = { 12.5, 6.0, -4.0, 19.9, 29.0, 15.5, 22.0 };

        CarritoCompra carrito = new CarritoCompra();
        int rechazados = 0;

        for (int i = 0; i < nombres.length; i++) {
            if (!carrito.anadir(nombres[i], precios[i])) {
                rechazados++;
            }
        }

        System.out.println("\nArtículos rechazados: " + rechazados);
        carrito.mostrarTicket();
    }
}

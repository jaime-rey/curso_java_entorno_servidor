package ejercicios.evaluacion_E1_Jaime;

public class ProductoServidor {
    // Nombre del producto
    private String nombre;
    // Precio del producto
    private double precio;
    // Cantidad en stock
    private int stock;

    public ProductoServidor(String nombre, double precio, int stock) {
        this.nombre = nombre;

        if (precio < 0) {
            this.precio = 0;
        } else {
            this.precio = precio;
        }

        if (stock < 0) {
            this.stock = 0;
        } else {
            this.stock = stock;
        }

    }

    public ProductoServidor(String nombre, double precio) {
        this(nombre, precio, 10);
    }

    public void mostrarFicha() {
        System.out.printf("Producto: %s | Precio: %.2f€ | Stock: %d " + (stock == 1 ? "ud." : "uds.") + "%n", nombre,
                precio, stock);
    }

    public void vender(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: la cantidad debe ser mayor que cero.");
            return;
        } else if (cantidad <= stock) {
            stock -= cantidad;
            System.out.printf("Total a cobrar: %.2f€", cantidad * precio);
            System.out.printf(" | Stock restante: %d " + (stock == 1 ? "ud." : "uds.") + "%n", stock);
        } else {
            System.out.println("Stock insuficiente para realizar la venta.");

        }
    }

    public void reponerStock(int cantidad) {

        if (cantidad <= 0) {
            System.out.println("Error: la cantidad a reponer debe ser mayor que cero.");
            return;
        }

        stock += cantidad;
        System.out.printf("Stock actualizado: %d " + (stock == 1 ? "ud." : "uds.") + "%n", stock);
    }
}
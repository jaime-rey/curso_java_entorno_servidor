package dev.jaimerey;

import java.util.ArrayList;

import dev.jaimerey.Model.Producto;

/**
 * Hello world!
 *
 */
public class App {
    public static void main() {

        System.out.println("ALMACÉN DE PRODUCTOS");

        Producto productoLaptop = new Producto("Laptop", 1200.0, 10);

        Producto productoSmartphone = new Producto("Smartphone", 800.0, 0);

        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(productoLaptop);
        productos.add(productoSmartphone);

        detalleProductos(productos);

    }

    private static void detalleProductos(ArrayList<Producto> productos) {
        for (Producto producto : productos) {
            producto.mostrarFicha();
            if (!producto.hayStock()) {
                System.out.println("Producto sin stock");
            }
        }
    }
}

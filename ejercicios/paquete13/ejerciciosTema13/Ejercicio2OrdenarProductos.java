package ejercicios.paquete13.ejerciciosTema13;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Locale;

public class Ejercicio2OrdenarProductos {
    public static void main(String[] args) {
        ArrayList<String> productos = new ArrayList<>();
        productos.add("PC sobremesa");
        productos.add("Laptop");
        productos.add("Ratón");
        productos.add("Teclado");
        productos.add("Altavoces");

        System.out.println("Productos antes de ordenar: ");
        for (String producto : productos) {
            System.out.println(producto);
        }

        System.out.println("Productos en orden alfabético: ");

        productos.sort(Collator.getInstance(Locale.of("es", "ES")));
        for (String producto : productos) {
            System.out.println(producto);
        }

        System.out.println("Productos con el nombre de más corto a más largo: ");
        productos.sort((a, b) -> Integer.compare(a.length(), b.length()));
        for (String producto : productos) {
            System.out.println(producto);
        }

        System.out.println("Productos con el nombre de más largo a más corto: ");
        productos.sort((a, b) -> Integer.compare(b.length(), a.length()));
        for (String producto : productos) {
            System.out.println(producto);
        }

        System.out.println("Productos con más de 5 letras:");

        ArrayList<String> productosConMasDeCincoLetras = new ArrayList<>(productos);

        productosConMasDeCincoLetras.removeIf(producto -> producto.length() <= 5);

        productosConMasDeCincoLetras.forEach(System.out::println);

    }
}

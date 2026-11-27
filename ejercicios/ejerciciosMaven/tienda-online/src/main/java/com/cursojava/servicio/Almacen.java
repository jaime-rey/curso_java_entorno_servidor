package com.cursojava.servicio;

import java.util.ArrayList;
import java.util.List;

import com.cursojava.modelo.Producto;

public class Almacen {

    private final List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public Producto buscarPorCodigo(String codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                return producto;
            }
        }
        return null;
    }

    public void mostrarInventario() {
        System.out.println("=============================================");
        System.out.println("INVENTARIO DEL ALMACÉN");
        System.out.println("=============================================");
        for (Producto p : productos) {
            System.out.printf("  [%s] %-28s  %7.2f €   stock: %d%n",
                p.getCodigo(), p.getNombre(), p.getPrecio(), p.getStock());
        }
    }

    public void mostrarAgotados() {
        System.out.println("=============================================");
        System.out.println("PRODUCTOS AGOTADOS");
        System.out.println("=============================================");
        int agotados = 0;
        for (Producto p : productos) {
            if (p.getStock() == 0) {
                System.out.printf("  [%s] %s%n", p.getCodigo(), p.getNombre());
                agotados++;
            }
        }
        if (agotados == 0) {
            System.out.println("No hay productos agotados.");
        }
    }
}

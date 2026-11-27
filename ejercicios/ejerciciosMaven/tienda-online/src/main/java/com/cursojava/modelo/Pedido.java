package com.cursojava.modelo;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private static final double UMBRAL_DESCUENTO = 150.0;
    private static final double PORCENTAJE_DESCUENTO = 0.10;

    private final int numero;
    private final Cliente cliente;
    private final List<LineaPedido> lineas;

    public Pedido(int numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.lineas = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void agregarProducto(Producto producto, int cantidad) {
        producto.descontarStock(cantidad);
        lineas.add(new LineaPedido(producto, cantidad));
    }

    public double getTotal() {
        double total = 0.0;
        for (LineaPedido linea : lineas) {
            total += linea.getSubtotal();
        }
        return total;
    }

    public double getTotalConDescuento() {
        double total = getTotal();
        if (total > UMBRAL_DESCUENTO) {
            return total * (1 - PORCENTAJE_DESCUENTO);
        }
        return total;
    }

    public void mostrarResumen() {
        System.out.println("---------------------------------------------");
        System.out.println("Pedido nº " + numero);
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Teléfono de contacto: " + cliente.getTelefono());
        System.out.println("Líneas:");
        for (LineaPedido linea : lineas) {
            Producto p = linea.getProducto();
            System.out.printf("  - %s x%d  ->  %.2f €%n",
                p.getNombre(), linea.getCantidad(), linea.getSubtotal());
        }
        double total = getTotal();
        System.out.printf("Total: %.2f €%n", total);
        if (total > UMBRAL_DESCUENTO) {
            System.out.println("Descuento del 10 % por superar 150 €");
            System.out.printf("TOTAL A PAGAR: %.2f €%n", getTotalConDescuento());
        }
    }
}

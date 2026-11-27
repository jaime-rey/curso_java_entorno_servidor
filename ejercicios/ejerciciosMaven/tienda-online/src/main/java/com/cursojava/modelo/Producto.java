package com.cursojava.modelo;

public class Producto {

    private final String codigo;
    private final String nombre;
    private final double precio;
    private int stock;

    public Producto(String codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public boolean hayStock(int cantidad) {
        return stock >= cantidad;
    }

    public void descontarStock(int cantidad) {
        if (!hayStock(cantidad)) {
            throw new IllegalStateException(
                "Stock insuficiente para " + nombre + " (pedidas " + cantidad + ", quedan " + stock + ")");
        }
        stock -= cantidad;
    }
}

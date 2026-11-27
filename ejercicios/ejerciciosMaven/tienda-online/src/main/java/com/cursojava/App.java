package com.cursojava;

import java.util.ArrayList;
import java.util.List;

import com.cursojava.informes.InformeVentas;
import com.cursojava.modelo.Cliente;
import com.cursojava.modelo.Pedido;
import com.cursojava.modelo.Producto;
import com.cursojava.servicio.Almacen;

public class App {

    public static void main(String[] args) {

        Almacen almacen = new Almacen();
        almacen.agregarProducto(new Producto("P01", "Teclado mecánico",        25.00, 20));
        almacen.agregarProducto(new Producto("P02", "Ratón gaming",            45.00, 10));
        almacen.agregarProducto(new Producto("P03", "Monitor 24\"",           175.00,  1));
        almacen.agregarProducto(new Producto("P04", "Auriculares inalámbricos", 35.00,  0));

        Cliente ana  = new Cliente("Ana García",   "ana@correo.com",   "600111222");
        Cliente luis = new Cliente("Luis Pérez",   "luis@correo.com",  "600333444");

        Pedido pedido1 = new Pedido(1, ana);
        pedido1.agregarProducto(almacen.buscarPorCodigo("P01"), 8);

        Pedido pedido2 = new Pedido(2, luis);
        pedido2.agregarProducto(almacen.buscarPorCodigo("P03"), 1);

        Pedido pedido3 = new Pedido(3, ana);
        pedido3.agregarProducto(almacen.buscarPorCodigo("P02"), 2);

        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(pedido1);
        pedidos.add(pedido2);
        pedidos.add(pedido3);

        for (Pedido p : pedidos) {
            p.mostrarResumen();
        }

        almacen.mostrarInventario();
        almacen.mostrarAgotados();

        InformeVentas.mostrar(pedidos);
    }
}

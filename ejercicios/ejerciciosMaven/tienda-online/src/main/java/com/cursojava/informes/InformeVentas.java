package com.cursojava.informes;

import java.util.List;

import com.cursojava.modelo.Pedido;

public class InformeVentas {

    private InformeVentas() {
    }

    public static void mostrar(List<Pedido> pedidos) {
        System.out.println("=============================================");
        System.out.println("INFORME DE VENTAS");
        System.out.println("=============================================");

        if (pedidos.isEmpty()) {
            System.out.println("No hay pedidos registrados.");
            return;
        }

        System.out.println("Número de pedidos: " + pedidos.size());

        double totalFacturado = 0.0;
        for (Pedido p : pedidos) {
            totalFacturado += p.getTotalConDescuento();
        }
        System.out.printf("Total facturado: %.2f €%n", totalFacturado);

        Pedido mayor = pedidos.get(0);
        for (Pedido p : pedidos) {
            if (p.getTotalConDescuento() > mayor.getTotalConDescuento()) {
                mayor = p;
            }
        }
        System.out.printf("Pedido más alto: nº %d  ->  %.2f €%n",
            mayor.getNumero(), mayor.getTotalConDescuento());
    }
}

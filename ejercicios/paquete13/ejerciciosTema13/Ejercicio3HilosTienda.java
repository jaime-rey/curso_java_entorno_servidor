package ejercicios.paquete13.ejerciciosTema13;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio3HilosTienda {
    public static void main(String[] args) {

        ArrayList<Double> importes = new ArrayList<>(List.of(10.0, 20.5, 30.75));
        ArrayList<String> pedidosPreparados = new ArrayList<>(List.of("Pedido1", "Pedido2", "Pedido3"));

        Thread hiloImportes = new Thread(() -> {
            for (Double importe : importes) {
                System.out.println("Importe: " + importe);
            }
        });

        Thread hiloPedidos = new Thread(() -> {
            for (String pedido : pedidosPreparados) {
                System.out.println("Pedido preparado: " + pedido);
            }
        });

        hiloImportes.start();
        hiloPedidos.start();

        System.out.println("Hilos iniciados");
    }

}

package ejercicios.paquete13.ejerciciosTema13;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio3HilosTienda {
    public static void main() {

        ArrayList<Double> importes = new ArrayList<>(List.of(10.0, 20.5, 30.75));

        Thread hiloCaja = new Thread(() -> {
            double total = 0;
            for (Double importe : importes) {
                System.out.println("[Caja]: cobro de " + importe + " €");
                total += importe;
            }
            System.out.println("[Caja]: total cobrado = " + total + " €");
        });

        Thread hiloPedidos = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("[Almacén]: paquete " + i + " preparado");
            }
        });

        hiloCaja.start();
        hiloPedidos.start();

        try {
            hiloCaja.join();
            hiloPedidos.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Jornada terminada");
    }

}

package ejercicios.ejerciciosPOO;

import java.util.Scanner;

public class PrincipalTarjeta {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            TarjetaTransporte tarjeta = new TarjetaTransporte();

            boolean aceptada;
            do {
                double importe = leerDecimal(sc, "Importe de la recarga: ");
                aceptada = tarjeta.recargar(importe);
            } while (!aceptada);

            while (tarjeta.validar()) {
                System.out.printf("Viaje realizado. Saldo: %.2f €%n", tarjeta.getSaldo());
            }

            System.out.println("No hay saldo suficiente para otro viaje");
            System.out.println("Total de viajes: " + tarjeta.getViajes());
            System.out.printf("Saldo sobrante: %.2f €%n", tarjeta.getSaldo());
        }
    }

    private static double leerDecimal(Scanner sc, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            try {
                return Double.parseDouble(sc.nextLine().trim().replace(',', '.'));
            } catch (NumberFormatException e) {
                System.out.println("No es un número, inténtalo de nuevo");
            }
        }
    }
}

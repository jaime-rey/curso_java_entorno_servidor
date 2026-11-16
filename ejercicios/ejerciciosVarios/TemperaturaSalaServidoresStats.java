package ejercicios.ejerciciosVarios;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

public class TemperaturaSalaServidoresStats {
    public static void main() {

        double tempMax = 25d;

        double[] temperaturas = setTemperaturas();

        DoubleSummaryStatistics stats = Arrays.stream(temperaturas).summaryStatistics();

        System.out.printf("Promedio de temperaturas: %.2f ºC%n", stats.getAverage());
        System.out.printf("Máxima temperatura: %.2f ºC%n", stats.getMax());
        System.out.printf("Mínima temperatura: %.2f ºC%n", stats.getMin());

        long cantidadMayores = Arrays.stream(temperaturas).filter(t -> t > tempMax).count();
        System.out.println("Cantidad de temperaturas mayores que " + tempMax + " ºC: " + cantidadMayores);

        if (cantidadMayores >= 3) {
            System.out.println("[X] ALERTA: revisa la refrigeración de la sala");
        } else {
            System.out.println("[OK] Semana estable. No hace falta intervenir");
        }
    }

    private static double[] setTemperaturas() {

        double[] temp = new double[7];

        try (Scanner sc = new Scanner(System.in)) {

            for (int i = 0; i < temp.length; i++) {
                temp[i] = pedirDouble(sc, i);
            }

            System.out.println("Temperaturas ingresadas: ");
            for (int i = 0; i < temp.length; i++) {
                System.out.println("Temperatura " + (i + 1) + ": " + temp[i] + " ºC");
            }

        }
        return temp;
    }

    private static double pedirDouble(Scanner sc, int dia) {
        while (true) {
            System.out.print("Ingrese la temperatura " + (dia + 1) + ": ");
            try {
                return Double.parseDouble(sc.nextLine().replace(',', '.'));
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Debe introducir un número correcto.");
            }
        }
    }
}

package ejercicios.paquete5;

import java.util.Scanner;

public class TemperaturaSalaServidores {
    public static void main() {

        double tempMax = 25d;

        double[] temperaturas = setTemperaturas();

        double promedio = calcularPromedio(temperaturas);
        System.out.printf("Promedio de temperaturas: %.2f ºC%n", promedio);

        double maximo = calcularMaximo(temperaturas);
        System.out.printf("Máxima temperatura: %.2f ºC%n", maximo);

        double minimo = calcularMinimo(temperaturas);
        System.out.printf("Mínima temperatura: %.2f ºC%n", minimo);

        int cantidadMayores = new TemperaturaSalaServidores().contarTemperaturasMayoresQue(temperaturas, tempMax);
        System.out.println("Cantidad de temperaturas mayores que " + tempMax + " ºC: " + cantidadMayores);

        if (cantidadMayores >= 3) {
            System.out.println("[X] ALERTA: revisa la refrigeración de la sala");
        } else {
            System.out.println("[OK] Semana estable. No hace falta intervenir");
        }
    }

    private static double[] setTemperaturas() {

        double[] temp = new double[7];

        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {

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

    private static double calcularPromedio(double[] temperaturas) {
        double suma = 0;
        for (double temp : temperaturas) {
            suma += temp;
        }
        return suma / temperaturas.length;
    }

    private static double calcularMaximo(double[] temperaturas) {
        double max = temperaturas[0];
        for (double temp : temperaturas) {
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }

    private static double calcularMinimo(double[] temperaturas) {
        double min = temperaturas[0];
        for (double temp : temperaturas) {
            if (temp < min) {
                min = temp;
            }
        }
        return min;
    }

    private int contarTemperaturasMayoresQue(double[] temperaturas, double tempMax) {
        int contador = 0;
        for (double temp : temperaturas) {
            if (temp > tempMax) {
                contador++;
            }
        }
        return contador;
    }

}

package paquete2;

import java.util.Scanner;

public class CalculadoraSuma {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int numero1 = 10;
            int numero2 = 4;

            boolean esMayor = numero1 > numero2;

            Double numberOne = null;
            double numberTwo = 0;

            System.out.println(numberOne);
            System.out.println(numberTwo);

            System.out.print("Primer número: ");
            double a = Double.parseDouble(sc.nextLine().trim().replace(',', '.'));

            System.out.print("Segundo número: ");
            double b = Double.parseDouble(sc.nextLine().trim().replace(',', '.'));

            System.out.println("Suma: " + (a + b));
            System.out.println("Resta: " + (a - b));
            System.out.println("Multiplicación: " + (a * b));
        }
    }
}

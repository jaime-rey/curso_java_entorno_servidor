package paquete2;

import java.util.Scanner;

public class ComparadorNumeros {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Primer número entero: ");
            int a = Integer.parseInt(sc.nextLine().trim());

            System.out.print("Segundo número entero: ");
            int b = Integer.parseInt(sc.nextLine().trim());

            System.out.println("El primer número es mayor que el segundo: " + (a > b));
            System.out.println("El primer número es menor que el segundo: " + (a < b));
            System.out.println("El primer número es igual que el segundo: " + (a == b));
        }
    }
}

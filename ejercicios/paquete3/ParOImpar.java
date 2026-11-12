package ejercicios.paquete3;

import java.util.Scanner;

// Actividad 1: indica si un número entero es PAR o IMPAR
public class ParOImpar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        // Mientras lo escrito no sea un entero, lo descartamos y volvemos a pedirlo
        while (!sc.hasNextInt()) {
            System.out.print("Eso no es un número entero. Inténtalo de nuevo: ");
            sc.next();
        }
        int numero = sc.nextInt();

        // Si el resto de dividir entre 2 es 0, el número es par
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es PAR");
        } else {
            System.out.println("El número " + numero + " es IMPAR");
        }

        sc.close();
    }
}

package paquete1;

import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Primer mensaje");
        System.out.print("Segundo mensaje");
        System.out.println("Tercer mensaje");

        String nombre = "Jaime";
        int edad = 48;

        int numero = new Scanner(System.in).nextInt();
        int numero2 = new Scanner(System.in).nextInt();

        System.out.println("Me llamo: " + nombre + " y tengo " + edad + " años");

        String mensaje = IO.readln("Estoy muy cansado, Sr. Stark: ");

        IO.println(mensaje);

    }
}
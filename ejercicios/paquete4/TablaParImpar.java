package ejercicios.paquete4;

public class TablaParImpar {
    public static void main(String[] args) {
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {

            System.out.print("Introduce un número del 1 al 10: ");
            int numero = sc.nextInt();
            while (numero < 1 || numero > 10) {
                System.out.print("Número inválido. Introduce un número del 1 al 10: ");
                numero = sc.nextInt();
            }
            if (numero % 2 == 0) {
                System.out.println("El número " + numero + " es par.");
            } else {
                System.out.println("El número " + numero + " es impar.");
            }

            mostrarTabla(numero);

        }
    }

    public static void mostrarTabla(int numero) {
        System.out.println("Tabla del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        System.out.println("Cantidad de pares: " + (numero % 2 == 0 ? 10 : 5) + " de 10");
    }
}

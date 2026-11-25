package ejercicios.paquete12;

public class EjemploExcepciónBasica {
    public static void main(String[] args) {
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            System.out.println("Introduce un número: ");
            int numero = sc.nextInt();
            int resultado = 10 / numero;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Se ha producido una excepción: " + e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Se ha producido una excepción: " + e.getMessage());
        } finally {
            System.out.println("Bloque finally ejecutado.");
        }

        System.out.println("Fin del programa.");
    }
}

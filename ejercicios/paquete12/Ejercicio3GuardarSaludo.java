package ejercicios.paquete12;

public class Ejercicio3GuardarSaludo {
    public static void guardarTresLineasEnFichero() {
        try (java.io.PrintWriter writer = new java.io.PrintWriter("saludo.txt")) {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            for (int i = 0; i < 3; i++) {
                System.out.println("Introduce una línea de saludo:");
                String linea = scanner.nextLine();
                writer.println(linea);
            }
        } catch (java.io.IOException e) {
            System.out.println("Error al escribir en el fichero: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        guardarTresLineasEnFichero();
    }
}

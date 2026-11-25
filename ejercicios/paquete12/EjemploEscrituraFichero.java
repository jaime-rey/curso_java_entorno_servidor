package ejercicios.paquete12;

public class EjemploEscrituraFichero {
    public static void main(String[] args) {
        try (java.io.FileWriter escritor = new java.io.FileWriter("./ejemplo.txt");
                java.io.FileWriter escritor2 = new java.io.FileWriter("./ejemplo.txt", true)) {
            escritor.write("Hola, mundo!");
            escritor.append("\n"); // Añade un salto de línea al final del texto
            escritor.write("Esta es otra línea de texto."); // Escribe otra línea en el fichero
            escritor.append("\n");
            escritor.flush(); // Asegura que todos los datos se escriban en el fichero antes de cerrarlo

            System.out.println("Datos escritos correctamente en el fichero.");
            escritor2.write("Añadiendo una línea con el segundo escritor.");
            escritor2.flush(); // Asegura que todos los datos se escriban en el fichero antes de cerrarlo
            System.out.println("Datos añadidos correctamente con el segundo escritor.");
        } catch (java.io.IOException e) {
            System.out.println("Error al escribir en el fichero: " + e.getMessage());
        }
    }
}

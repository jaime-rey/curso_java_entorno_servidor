package ejercicios.paquete12;

public class EjemploLecturaFichero {
    public static void main(String[] args) {
        try (java.io.FileReader lector = new java.io.FileReader("./ejemplo.txt");
                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(lector)) {
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (java.io.IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
    }
}

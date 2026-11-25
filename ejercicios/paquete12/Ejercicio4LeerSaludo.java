package ejercicios.paquete12;

import java.io.*;

public class Ejercicio4LeerSaludo {
    private static final String FICHERO = "saludo.txt";

    private static void leerSaludo() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FICHERO))) {

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        leerSaludo();
    }
}

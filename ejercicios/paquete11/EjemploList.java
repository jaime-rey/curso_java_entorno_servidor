package ejercicios.paquete11;

import java.util.ArrayList;

public abstract class EjemploList {
    public static void main(String[] args) {
        // Creamos una lista dinámica vacía que guardará textos (String)
        ArrayList<String> alumnos = new ArrayList<String>();
        // Añade "Ana" en la posición 0 de la lista
        alumnos.add("Ana");
        // Añade "Luis" en la posición 1 de la lista
        alumnos.add("Luis");
        // Añade otra vez "Ana" en la posición 2 (las listas SÍ permiten valores
        // repetidos)
        alumnos.add("Ana");
        // .size() nos dice cuántos hay (3)
        System.out.println("Recorriendo el ArrayList (total " + alumnos.size()
                + " elementos):");
        // Recorremos desde 0 hasta alumnos.size() igual que hacíamos con los
        // arrays
        for (int i = 0; i < alumnos.size(); i++) {
            // Con .get(i) leemos el elemento guardado en el índice 'i'
            System.out.println("Posición " + i + ": " + alumnos.get(i));
            // Cierra el bucle for
        }
        // Cierra el método main
    }
}

package ejercicios.paquete13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Ordenar una lista con nuestra propia regla, escrita como lambda
public class EjemploLambdaBasica {

    public static void main(String[] args) {
        // Lista dinámica de textos
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Carlos"); // 6 letras (deberá quedar el último por ser el más largo)

        nombres.add("Luis"); // 4 letras
        nombres.add("Ana"); // 3 letras (deberá quedar la primera por ser la más corta)
        nombres.add("Marta"); // 5 letras

        // Copia de la lista para ordenarla de la otra forma y comparar
        ArrayList<String> copia = new ArrayList<String>(nombres);

        // FORMA 1 (antes de Java 8): CLASE INTERNA ANÓNIMA.
        // Creamos "al vuelo" un objeto de una clase sin nombre que implementa
        // la interfaz Comparator<String> y escribimos su único método, compare().
        Collections.sort(copia, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.length() - b.length();
            }
        });

        System.out.println("Con clase anónima:");
        for (String nombre : copia) {
            System.out.println(nombre);
        }

        // FORMA 2 (Java 8 en adelante): LAMBDA.
        // Es lo mismo que lo de arriba: Java sabe que Comparator solo tiene un
        // método pendiente (compare), así que solo escribimos los parámetros y el return.
        // Si la resta da negativo, 'a' es más corto y va antes.
        Collections.sort(nombres, (a, b) -> a.length() - b.length());

        System.out.println("Con lambda:");
        for (String nombre : nombres) {
            // Imprime en orden: Ana (3), Luis (4), Marta (5), Carlos (6)
            System.out.println(nombre);
        }
    }
}

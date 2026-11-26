package ejercicios.paquete13;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

// Recorrer, ordenar y borrar en una lista con lambdas
public class EjemploNotasLambda {

    public static void main(String[] args) {
        // Lista dinámica de notas enteras
        ArrayList<Integer> notas = new ArrayList<Integer>();
        notas.add(6);
        notas.add(9);
        notas.add(4);
        notas.add(7);
        notas.add(3);

        // b - a: de mayor a menor (al revés que a - b)
        Collections.sort(notas, (a, b) -> b - a);
        System.out.println("Notas de mayor a menor: " + notas);

        // forEach recorre la lista y ejecuta la lambda con cada elemento (al que llama
        // 'n').
        // Hace lo mismo que un for que imprime cada nota
        notas.forEach(n -> System.out.println("Nota: " + n));

        System.out.println("Notas originales: ");
        notas.forEach(System.out::println);

        // removeIf borra todos los elementos para los que la lambda devuelve true:
        // aquí, las notas menores que 5
        notas.removeIf(n -> n < 5);
        System.out.println("Solo aprobados: " + notas);

        Collator col = Collator.getInstance(Locale.of("es", "ES"));
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Ana");
        nombres.add("Óscar");
        nombres.add("Zoe");
        nombres.add("Ñoño");
        nombres.add("Nuria");
        nombres.add("ana");
        nombres.add("Álvaro");

        nombres.sort(col.reversed()); // forma 1
        nombres.sort(Collections.reverseOrder(col)); // forma 2
        // → [Zoe, Óscar, Ñoño, Nuria, ana, Álvaro]
    }
}

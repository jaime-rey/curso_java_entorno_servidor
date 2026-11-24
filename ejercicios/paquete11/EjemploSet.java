package ejercicios.paquete11;

import java.util.HashSet;

public abstract class EjemploSet {
    public static void main(String[] args) {
        // Creamos un conjunto HashSet de textos
        HashSet<String> categorias = new HashSet<String>();
        // Guarda "Bebidas" en el conjunto
        categorias.add("Bebidas");
        // Guarda "Limpieza" en el conjunto
        categorias.add("Limpieza");
        // Intentamos meter "Bebidas" por segunda vez: HashSet detecta que ya está
        // y lo ignora sin dar error
        categorias.add("Bebidas");
        // Imprime 2 (no 3), porque filtró el repetido
        System.out.println("Cantidad real guardada sin duplicados: "
                + categorias.size());
        // Muestra el contenido, por ejemplo [Limpieza, Bebidas]: HashSet no
        // garantiza ningún orden
        System.out.println("Contenido del conjunto: " + categorias);
        
        // Recorremos el conjunto con un bucle for-each
        for (String categoria : categorias) {
            System.out.println("Categoría: " + categoria);
        }

        // Recorremos el conjunto con un iterador
        java.util.Iterator<String> iterador = categorias.iterator();
        while (iterador.hasNext()) {
            System.out.println("Categoría (iterador): " + iterador.next());
        }

        // Recorremos el conjunto convirtiéndolo a un array
        String[] arrayCategorias = categorias.toArray(new String[0]);
        for (int i = 0; i < arrayCategorias.length; i++) {
            System.out.println("Categoría (array): " + arrayCategorias[i]);
        }
    }
}

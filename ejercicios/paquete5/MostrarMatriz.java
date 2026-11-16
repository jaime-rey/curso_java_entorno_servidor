package ejercicios.paquete5;

public class MostrarMatriz {
    // Punto de entrada del programa
    public static void main(String[] args) {
        // Declaramos e inicializamos una matriz de 3 filas y 3 columnas dándole
        // sus valores organizados visualmente
        int[][] matriz = {
                // Fila 0: contiene los valores 1 (columna 0), 2 (columna 1) y 3
                // (columna 2)
                { 1, 2, 3 },
                // Fila 1: contiene los valores 4 (columna 0), 5 (columna 1) y 6
                // (columna 2)
                { 4, 5, 6 },
                // Fila 2: contiene los valores 7 (columna 0), 8 (columna 1) y 9
                // (columna 2)
                { 7, 8, 9 }
                // Cierra con punto y coma la declaración de la matriz
        };
        // Bucle exterior: recorre las filas desde la 0 hasta la 2 (matriz.length
        // mide el número de filas)
        for (int fila = 0; fila < matriz.length; fila++) {
            // Bucle interior: recorre las columnas que hay dentro de la fila
            // actual
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                // Imprime el dato de esa fila y columna seguido de un tabulador
                // (\t) sin saltar de línea
                System.out.print(matriz[fila][columna] + "\t");
                // Termina de imprimir todas las columnas de la fila actual
            }
            // Hace un salto de línea vacío para bajar al siguiente renglón antes
            // de empezar la próxima fila
            System.out.println();
            // Cierra el bucle exterior tras haber mostrado las 3 filas completas
        }
        // Cierra el método main
    }
    // Cierra la clase MostrarMatriz
}

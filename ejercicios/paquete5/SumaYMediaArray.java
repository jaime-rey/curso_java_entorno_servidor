package ejercicios.paquete5;

public class SumaYMediaArray {
    // Inicia la ejecución del programa
    public static void main() {
        // Creamos el array con las 5 calificaciones a procesar
        int[] notas = { 6, 8, 5, 9, 7 };
        // Creamos nuestra hucha acumuladora en 0 antes de empezar a recorrer el
        // array
        int suma = 0;
        // Recorremos todas las posiciones del array desde la 0 hasta la 4
        for (int i = 0; i < notas.length; i++) {
            // Sumamos al acumulador el valor guardado dentro de la casilla actual
            // (equivale a: suma = suma + notas[i])
            suma += notas[i];
            // Al terminar el bucle, 'suma' contiene el total de todas las casillas
            // (35)
        }
        // Convertimos 'suma' a (double) antes de dividir entre 5 para no perder
        // los decimales de la media
        double media = (double) suma / notas.length;
        // Muestra la suma acumulada: 35
        System.out.println("Suma total de las notas: " + suma);
        // Muestra el promedio calculado: 7.0
        System.out.println("Nota media exacta: " + media);
        // Cierra el método main
    }
    // Cierra la clase SumaYMediaArray
}

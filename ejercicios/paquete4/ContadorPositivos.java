package ejercicios.paquete4;

// Importamos Scanner para poder pedir números al usuario en cada vuelta del bucle
import java.util.Scanner;

// Definimos la clase ContadorPositivos (archivo ContadorPositivos.java)
public class ContadorPositivos {
    // Punto de entrada principal del programa
    public static void main() {
        // Creamos el lector de teclado conectado a la consola
        try (Scanner teclado = new Scanner(System.in);) {
            // CONTADOR: Inicializamos a cero fuera del bucle la variable que contará
            // cuántos números son mayores que 0
            int positivos = 0;
            // Programamos un bucle for para pedir exactamente 5 números (la 'i' irá
            // de 1 a 5)
            for (int i = 1; i <= 5; i++) {
                // Aprovechamos la variable 'i' para que el mensaje indique por qué
                // pregunta vamos
                IO.print("Introduce el número " + i + " de 5: ");
                // Leemos el número entero que acaba de escribir el usuario en esta
                // vuelta
                int numero = teclado.nextInt();
                // Comprobamos con un condicional si el número recién introducido es
                // positivo (mayor que cero)
                if (numero > 0) {
                    // Si es positivo, sumamos 1 a nuestro contador (si es negativo o
                    // cero, no sumamos nada)
                    positivos++;
                    // Cerramos el condicional if
                }
                // Cerramos el bucle for tras haber completado las 5 preguntas
                // Mostramos el recuento final al terminar
                System.out.println("En total has introducido " + positivos
                        + " números positivos.");
                // Cerramos el método main
            }
        }
        // Cerramos la clase ContadorPositivos
    }
}

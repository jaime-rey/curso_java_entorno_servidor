package ejercicios.paquete4;

// Define la clase principal para probar nuestro primer bucle (archivo
// PrimerWhile.java)
public class PrimerWhile {
    // Punto de entrada obligatorio donde arranca el programa
    public static void main(String[] args) {
        // PIEZA 1 (Variable de control): Creamos la variable que llevará la
        // cuenta empezando en el número 1
        int numero = 1;
        // PIEZA 2 (Condición de permanencia): Mientras 'numero' sea menor o igual
        // que 5, repite este bloque
        while (numero <= 5) {
            // Imprime en pantalla el valor que tiene 'numero' en esta vuelta
            // concreta
            System.out.println("Vuelta número: " + numero);
            // PIEZA 3 (Actualización): Suma 1 a 'numero' al final de la vuelta
            // para acercarnos al final del bucle
            numero++;
            // Al llegar a esta llave, el programa vuelve a subir a la línea del
            // 'while' para comprobar si el nuevo valor sigue siendo <= 5
        }
        // Esta línea solo se ejecuta cuando 'numero' llega a 6 y la condición da
        // false
        System.out.println("El bucle ha terminado.");
        // Cierra el método principal main
    }
    // Cierra la clase PrimerWhile
}
package ejercicios.paquete5;

// Define la clase para probar las utilidades matemáticas de Java (archivo
// EjemplosMath.java)
public class EjemplosMath {
    // Inicia el método principal
    public static void main(String[] args) {
        // Calcula la raíz cuadrada de 25 y muestra: 5.0
        System.out.println("Raíz cuadrada de 25: " + Math.sqrt(25));
        // Calcula la potencia de base 2 y exponente 3, mostrando: 8.0
        System.out.println("2 elevado al cubo (2^3): " + Math.pow(2, 3));
        // Redondea 4.6 al entero más próximo y muestra: 5
        System.out.println("Redondeo de 4.6: " + Math.round(4.6));
        // Compara ambos números y devuelve el más alto: 12
        System.out.println("El mayor entre 7 y 12 es: " + Math.max(7, 12));
        // Compara ambos números y devuelve el más bajo: 7
        System.out.println("El menor entre 7 y 12 es: " + Math.min(7, 12));
        // Multiplica el decimal aleatorio por 6 (da de 0.0 a 5.99), le quita los
        // decimales con (int) (da de 0 a 5) y le suma 1 (obteniendo de 1 a 6)
        int dado = (int) (Math.random() * 6) + 1;
        // Muestra un número sorpresa entre 1 y 6 que cambiará cada vez que pulses
        // Run
        System.out.println("Tirada de dado aleatoria (del 1 al 6): " + dado);
        // Cierra el método main
    }
    // Cierra la clase EjemplosMath
}

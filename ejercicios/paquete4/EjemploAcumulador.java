package ejercicios.paquete4;

// Define la clase para aprender a sumar varios valores dentro de un bucle
// (archivo EjemploAcumulador.java)
public class EjemploAcumulador {
    // Punto de arranque del programa
    public static void main(String[] args) {
        // ACUMULADOR: Creamos la hucha vacía (a cero) ANTES de empezar el bucle
        // para ir guardando el total
        int suma = 0;
        // Bucle que dará 5 vueltas haciendo que la variable 'i' valga
        // sucesivamente 1, 2, 3, 4 y 5
        for (int i = 1; i <= 5; i++) {
            // En cada vuelta, metemos en la hucha 'suma' lo que ya tenía guardado
            // más el valor actual de 'i'
            suma += i;
            // Mostramos cómo va engordando la suma paso a paso
            System.out.println("En la vuelta " + i
                    + ", el acumulador lleva sumado: " + suma);
            // Cierra el bucle for tras haber sumado 1 + 2 + 3 + 4 + 5
        }
        // Imprime el resultado definitivo almacenado en la hucha (15)
        System.out.println("La suma total final es: " + suma);
        // Cierra el método main
    }
    // Cierra la clase EjemploAcumulador
}

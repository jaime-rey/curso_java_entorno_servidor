package ejercicios.paquete4;

public class SumaDiezPrimeros {
    public static void main() {
        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            suma += i;
        }
        System.out.println("La suma de los 10 primeros números naturales es: " + suma);
    }
}

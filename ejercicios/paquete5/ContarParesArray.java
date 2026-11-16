package ejercicios.paquete5;

public class ContarParesArray {
    public static void main(String[] args) {
        int[] numeros = {3, 8, 12, 7, 4, 15, 20, 9};

        int pares = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares++;
            }
        }

        System.out.println("Cantidad de números pares: " + pares);
    }
}

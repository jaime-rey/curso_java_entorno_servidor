package ejercicios.paquete5;

public class MayorYMenorLista {
    public static void main(String[] args) {
        double[] precios = {12.50, 3.99, 25.00, 8.75, 19.90, 45.30};

        double max = precios[0];
        double min = precios[0];

        for (int i = 1; i < precios.length; i++) {
            if (precios[i] > max) {
                max = precios[i];
            }
            if (precios[i] < min) {
                min = precios[i];
            }
        }

        System.out.printf("Precio más caro: %.2f €%n", max);
        System.out.printf("Precio más barato: %.2f €%n", min);
    }
}

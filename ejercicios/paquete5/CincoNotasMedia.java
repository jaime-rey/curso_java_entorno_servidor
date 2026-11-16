package ejercicios.paquete5;

public class CincoNotasMedia {
    public static void main(String[] args) {
        double[] notas = new double[5];
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            for (int i = 0; i < notas.length; i++) {
                System.out.print("Ingrese la nota " + (i + 1) + ": ");
                notas[i] = Double.parseDouble(sc.nextLine().replace(',', '.'));
            }
        }

        double suma = 0;

        for (double nota : notas) {
            suma += nota;
        }

        double media = suma / notas.length;
        System.out.println("La media de las notas es: " + media);
    }
}

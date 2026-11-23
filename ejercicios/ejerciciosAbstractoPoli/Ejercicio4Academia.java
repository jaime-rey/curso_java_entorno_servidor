package ejercicios.ejerciciosAbstractoPoli;

public class Ejercicio4Academia {
    public static void main(String[] args) {
        Pagable[] plantilla = {
                new ProfesorFijo("Ana", 1800.0),
                new ProfesorPorHoras("Luis", 40, 22.5),
                new ProfesorPorHoras("Marta", 60, 25.0)
        };
        for (int i = 0; i < plantilla.length; i++) {
            System.out.printf("%s | Pago: %.2f €%n",
                    plantilla[i].getNombre(), plantilla[i].calcularPago());
        }
    }
}

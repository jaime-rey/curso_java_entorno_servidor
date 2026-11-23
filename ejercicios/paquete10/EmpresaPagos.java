package ejercicios.paquete10;

public abstract class EmpresaPagos {
    public static void main(String[] args) {
        // Array polimórfico del tipo de la interfaz Pagable
        Pagable[] trabajadores = new Pagable[3];
        trabajadores[0] = new EmpleadoFijo("Ana", 1400.0);
        trabajadores[1] = new RepartidorPorHoras("Luis", 80, 12.5);
        trabajadores[2] = new RepartidorPorHoras("Marta", 60, 11.0);

        for (int i = 0; i < trabajadores.length; i++) {
            // POLIMORFISMO: cada objeto usa su propia fórmula
            double pago = trabajadores[i].calcularPago();
            System.out.printf("%s | Pago: %.2f €%n",
                    trabajadores[i].getDescripcion(), pago);
        }
    }
}

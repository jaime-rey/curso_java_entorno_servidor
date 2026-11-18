package ejercicios.ejerciciosPOO;

public class TarjetaTransporte {
    private static final double PRECIO_VIAJE = 1.5;
    private static final double RECARGA_MINIMA = 5;

    private double saldo;
    private int viajes;

    // Devuelve true si la recarga ha sido aceptada
    public boolean recargar(double importe) {
        if (importe >= RECARGA_MINIMA) {
            saldo += importe;
            return true;
        }
        System.out.println("Aviso: la recarga mínima es de " + RECARGA_MINIMA + " €");
        return false;
    }

    // Cobra un viaje si hay saldo suficiente
    public boolean validar() {
        if (saldo >= PRECIO_VIAJE) {
            saldo -= PRECIO_VIAJE;
            viajes++;
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getViajes() {
        return viajes;
    }
}

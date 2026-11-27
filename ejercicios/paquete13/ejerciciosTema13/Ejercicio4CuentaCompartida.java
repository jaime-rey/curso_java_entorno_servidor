package ejercicios.paquete13.ejerciciosTema13;

class CuentaBanco{
    private  double saldo = 1000;

    public double getSaldo() {
        return saldo;
    }

    public synchronized void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro de " + cantidad + " realizado. Saldo restante: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para retirar " + cantidad);
        }
    }

    public synchronized void ingresar(double cantidad) {
        saldo += cantidad;
        System.out.println("Depósito de " + cantidad + " realizado. Saldo actual: " + saldo);
    }
}

public final class Ejercicio4CuentaCompartida {
    private static final double ESPERADO = 1500;

    public static void main() {

        CuentaBanco cuenta = new CuentaBanco();

        Thread hiloIngresos = new Thread(() -> {
            for (int i = 0; i < 100 ; i++){
                cuenta.ingresar(10);
            }
        });

        Thread hilosRetiradas = new Thread(() -> {
            for (int i = 0; i < 100 ; i++){
                cuenta.retirar(5);
            }
        });

        hiloIngresos.start();
        hilosRetiradas.start();

        try {
            hiloIngresos.join();
            hilosRetiradas.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Saldo final: " + cuenta.getSaldo());
        if (Math.abs(cuenta.getSaldo() - ESPERADO) < 0.001) {
            System.out.println("✓ El saldo coincide con el esperado (" + ESPERADO + " €)");
        } else {
            System.out.println("✗ Error: esperado " + ESPERADO + " pero hay " + cuenta.getSaldo());
        }
    }

}

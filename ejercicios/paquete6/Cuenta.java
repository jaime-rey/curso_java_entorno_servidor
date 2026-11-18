package ejercicios.paquete6;

public class Cuenta {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {

        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }

}

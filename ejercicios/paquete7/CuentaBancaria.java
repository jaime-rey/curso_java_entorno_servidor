package ejercicios.paquete7;

public class CuentaBancaria {
    // Atributo privado para el titular
    private String titular;
    // Atributo privado para el saldo
    private double saldo;

    // 1. Constructor completo: recibe titular y saldo inicial
    public CuentaBancaria(String titular, double saldo) {
        // Asigna el titular recibido
        this.titular = titular;
        // Igual que en la versión del apartado 6: no admitimos un saldo inicial
        // negativo
        if (saldo >= 0) {
            // Asigna el saldo recibido
            this.saldo = saldo;
        } else {
            // Si era negativo, la cuenta empieza en cero
            this.saldo = 0.0;
        }
        // Cierra el constructor completo
    }

    // 2. Constructor sobrecargado: recibe solo el titular
    public CuentaBancaria(String titular) {
        // Encadenamiento: llama al constructor completo de arriba fijando el
        // saldo a 0.0
        this(titular, 0.0);
        // Cierra el constructor corto
    }

    // Método para añadir dinero a la cuenta
    public void ingresar(double cantidad) {
        // Comprueba que la cantidad sea positiva
        if (cantidad > 0) {
            // Actualiza el saldo interno
            this.saldo += cantidad;
        }
        // Cierra ingresar
    }

    // Método para imprimir el estado de la cuenta
    public void mostrarDatos() {
        System.out.println("Titular: " + titular + " | Saldo: " + saldo + " €");
        // Cierra mostrarDatos
    }
    // Cierra la clase CuentaBancaria
}

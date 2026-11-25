package ejercicios.paquete12;

public final class CuentaSimple {
    // Atributo privado para guardar el dinero de la cuenta
    private double saldo;

    // Constructor que inicializa la cuenta con su saldo
    public CuentaSimple(double saldoInicial) {
        // Guarda el saldo inicial
        this.saldo = saldoInicial;
        // Cierra el constructor
    }

    // Método para sacar dinero de la cuenta
    public void retirar(double cantidad) throws SaldoInsuficienteException {
        // Si alguien intenta retirar una cantidad negativa, la operación no tiene
        // sentido y lanzamos la alarma:
        // Comprobamos si el parámetro recibido es negativo
        if (cantidad < 0) {
            // 'throw new' detiene el método y lanza el error con nuestro mensaje
            throw new IllegalArgumentException("La cantidad a retirar no puede ser negativa.");
            // Cierra el if de argumento ilegal
        } else if (cantidad > this.saldo) {
            // Avisamos normalmente por pantalla
            System.out.println("Saldo insuficiente para realizar la retirada.");
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar la retirada.");
            // Si la cantidad es positiva y hay saldo suficiente:
        } else {
            // Descontamos el dinero del saldo de la cuenta
            this.saldo = this.saldo - cantidad;
            // Confirmamos el nuevo saldo
            System.out.println("Retirada realizada. Nuevo saldo disponible: "
                    + this.saldo + " €");
            // Cierra el if-else de saldo
        }
        // Cierra el método retirar

    }

    public static void main(String[] args) {
        CuentaSimple cuenta = new CuentaSimple(100.0);
        // Vigilamos una retirada con un dato ilegal
        try {
            // Retirada válida: deja el saldo en 70 euros
            cuenta.retirar(30.0);
            // Segunda retirada válida: deja el saldo en 50 euros
            cuenta.retirar(20.0);

            cuenta.retirar(100.0); // Intento de retirar más de lo disponible, lanza SaldoInsuficienteException
            // Cantidad negativa: el método lanza la IllegalArgumentException
            cuenta.retirar(-5.0);
            // Se salta porque la excepción interrumpe el try
            System.out.println("Esta línea no llega a ejecutarse.");
            // Atrapamos exactamente el tipo de excepción que lanzó el método
        } catch (IllegalArgumentException e) {
            // getMessage() devuelve el texto que escribimos en el throw new
            System.out.println("Operación rechazada: " + e.getMessage());
            // Cierra el try-catch
        } catch (SaldoInsuficienteException e) {
            System.out.println("Operación rechazada: " + e.getMessage());
        }
        // main está dentro de la propia clase, por eso puede leer el atributo
        // private
        System.out.println("El programa sigue. Saldo final: " + cuenta.getSaldo()
                + " €");
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

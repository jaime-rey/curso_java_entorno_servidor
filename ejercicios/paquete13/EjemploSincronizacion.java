package ejercicios.paquete13;

// Clase cuyo único dato van a usar dos hilos a la vez
class ContadorCompartido {
    private int valor = 0;

    // 'synchronized' pone un cerrojo: impide que dos hilos entren aquí a la vez.
    // Al terminar el método se abre el cerrojo y puede pasar el siguiente hilo
    public synchronized void incrementar() {
        this.valor++;
    }

    public int getValor() {
        return this.valor;
    }
}

// Dos hilos sumando sobre el mismo objeto
public class EjemploSincronizacion {

    // 'throws InterruptedException' es necesario al usar .join()
    public static void main(String[] args) throws InterruptedException {
        // El único objeto compartido por ambos hilos
        ContadorCompartido contador = new ContadorCompartido();

        // Hilo 1: llama 1000 veces a incrementar()
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100_000; i++) {
                contador.incrementar();
            }
        });

        // Hilo 2: también llama 1000 veces al mismo método
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100_000; i++) {
                contador.incrementar();
            }
        });

        t1.start();
        t2.start();

        // join(): "espera aquí hasta que t1 y t2 hayan terminado"
        t1.join();
        t2.join();

        // Gracias a 'synchronized', siempre 2000, sin perder ni una suma
        System.out.println("Valor final exacto del contador compartido: " + contador.getValor());
    }
}

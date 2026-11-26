package ejercicios.paquete13;

// Dos hilos trabajando a la vez
public class EjemploThreadBasico {

    // Aquí arranca el HILO PRINCIPAL del programa
    public static void main(String[] args) {
        // Creamos un HILO SECUNDARIO y le pasamos con una lambda () -> { ... }
        // el trabajo que debe hacer. Todo lo que esté dentro de estas llaves
        // lo hará el segundo "trabajador" en paralelo
        Thread hiloSecundario = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("[Hilo secundario]: paso " + i);
            }
        });

        // ¡MUY IMPORTANTE! .start() arranca el hilo secundario en paralelo
        // (con .run() NO se crea un hilo nuevo: se ejecutaría aquí, entero y antes de seguir)
        hiloSecundario.start();

        // Mientras el secundario ya corre por su cuenta, el principal sigue con su bucle
        for (int i = 1; i <= 5; i++) {
            System.out.println("[Hilo principal]: paso " + i);
        }
    }
}

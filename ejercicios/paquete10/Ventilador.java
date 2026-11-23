package ejercicios.paquete10;

public class Ventilador implements Encendible {
    // Atributo privado propio del ventilador para saber si sus aspas están
    // girando
    private boolean encendido;

    // Constructor del ventilador
    public Ventilador() {
        // Al crear el ventilador, también empieza detenido (false)
        this.encendido = false;
        // Cierra el constructor
    }

    // Cumple el método encender() del contrato, pero adaptado al comportamiento
    // de un ventilador
    @Override
    // Acción de encender el ventilador
    public void encender() {
        // Si estaba apagado:
        if (!this.encendido) {
            // Pasa a estar en marcha
            this.encendido = true;
            // Mensaje específico del ventilador
            System.out.println("El ventilador empieza a girar las aspas.");
            // Si ya estaba girando:
        } else {
            // Aviso específico
            System.out.println("El ventilador ya estaba funcionando.");
            // Cierra el if-else
        }
        // Cierra encender
    }

    // Cumple el método apagar() del contrato
    @Override
    // Acción de apagar el ventilador
    public void apagar() {
        // Si estaba girando:
        if (this.encendido) {
            // Lo detenemos
            this.encendido = false;
            // Mensaje al parar
            System.out.println("El ventilador se detiene.");
            // Si ya estaba parado:
        } else {
            // Aviso al usuario
            System.out.println("El ventilador ya estaba apagado.");
            // Cierra el if-else
        }
        // Cierra apagar
    }
}

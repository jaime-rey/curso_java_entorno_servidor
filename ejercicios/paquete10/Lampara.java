package ejercicios.paquete10;

public class Lampara implements Encendible {

    // Atributo privado propio de la lámpara para recordar si está dando luz
    // (true) o apagada (false)
    private boolean encendida;

    // Constructor de la lámpara
    public Lampara() {
        // Al fabricar la lámpara con 'new', empieza apagada por seguridad
        this.encendida = false;
        // Cierra el constructor
    }

    // Indica que estamos cumpliendo la primera promesa del contrato Encendible
    @Override
    // Programamos cómo se enciende concretamente una lámpara
    public void encender() {
        // Comprobamos si NO estaba encendida
        if (!this.encendida) {
            // Cambiamos su estado interno a encendida (true)
            this.encendida = true;
            // Mostramos el mensaje propio de la lámpara
            System.out.println("La lámpara se ha encendido e ilumina la " +
                    "habitación.");
            // Si ya estaba en true:
        } else {
            // Avisamos de que no hace falta encenderla otra vez
            System.out.println("La lámpara ya estaba encendida.");
            // Cierra el condicional if-else
        }
        // Cierra el método encender
    }

    // Indica que estamos cumpliendo la segunda promesa del contrato Encendible
    @Override
    // Programamos cómo se apaga concretamente una lámpara
    public void apagar() {
        // Solo la apagamos si realmente estaba encendida (true)
        if (this.encendida) {
            // Cambiamos su estado interno a apagada (false)
            this.encendida = false;
            // Mostramos el mensaje de apagado
            System.out.println("La lámpara se ha apagado.");
            // Si ya estaba en false:
        } else {
            // Avisamos al usuario
            System.out.println("La lámpara ya estaba apagada.");
            // Cierra el condicional if-else
        }
        // Cierra el método apagar
    }

}

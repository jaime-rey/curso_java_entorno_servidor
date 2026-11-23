package ejercicios.paquete10;

public class EjemploInterfaz {
    public static void main(String[] args) {
        // Creamos una lámpara y un ventilador
        Lampara lampara = new Lampara();
        Ventilador ventilador = new Ventilador();

        // Encendemos ambos
        lampara.encender();
        ventilador.encender();

        // Apagamos ambos
        lampara.apagar();
        ventilador.apagar();
    }
}

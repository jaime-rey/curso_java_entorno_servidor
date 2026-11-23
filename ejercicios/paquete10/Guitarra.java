package ejercicios.paquete10;

public class Guitarra extends Instrumento {
    public Guitarra(String nombre) {
        // Entrega el nombre al padre
        super(nombre);
    }

    @Override
    public void tocar() {
        // Sonido de la guitarra
        System.out.println(this.nombre + " suena: tlan, tlan, tlan");
    }
}

package ejercicios.paquete10;

public class Tambor extends Instrumento {
    public Tambor(String nombre) {
        // Entrega el nombre al padre
        super(nombre);
    }

    // Completa el método pendiente a su manera
    @Override
    public void tocar() {
        // Sonido del tambor
        System.out.println(this.nombre + " suena: pom, pom, pom");
    }

    public void afinar() {
        System.out.println(this.nombre + " se está afinando.");
    }
}

package ejercicios.paquete10;

public abstract class Instrumento {
    // Atributo común
    protected String nombre;

    // Constructor que llamarán las hijas con super
    protected Instrumento(String nombre) {
        // Guarda el nombre
        this.nombre = nombre;
        // Cierra el constructor
    }

    // Método abstracto: cada hija decide cómo suena
    public abstract void tocar();
    // Cierra Instrumento
}

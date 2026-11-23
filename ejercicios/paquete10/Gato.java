package ejercicios.paquete10;

public class Gato extends Animal {
    // Constructor del gato
    public Gato(String nombre, int edad) {
        // Envía los datos comunes al constructor de Animal
        super(nombre, edad);
        // Cierra el constructor
    }

    // Completa obligatoriamente el método abstracto hacerSonido() a la manera de
    // un gato
    @Override
    // Define cómo suena un gato
    public void hacerSonido() {
        // Imprime el maullido
        System.out.println(this.nombre + " dice: ¡Miau!");
        // Cierra hacerSonido
    }
    // Cierra la clase Gato
}

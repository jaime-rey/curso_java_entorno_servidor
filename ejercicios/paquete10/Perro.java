package ejercicios.paquete10;

public class Perro extends Animal {

    // Constructor del perro
    public Perro(String nombre, int edad) {
        // Envía el nombre y la edad al constructor de la clase abstracta Animal
        super(nombre, edad);
        // Cierra el constructor
    }

    // Completa obligatoriamente el método abstracto que Animal dejó pendiente
    @Override
    // Define cómo suena un perro
    public void hacerSonido() {
        // Imprime el ladrido
        System.out.println(this.nombre + " dice: ¡Guau, guau!");
        // Cierra hacerSonido
    }

}

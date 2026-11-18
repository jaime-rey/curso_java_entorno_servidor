package ejercicios.paquete7;

public class Persona {
    private String nombre;
    private int edad;

    // Constructor completo
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Constructor abreviado: encadena con el completo y asigna 0 a la edad
    public Persona(String nombre) {
        this(nombre, 18);
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + ", edad: " + edad);
    }
}

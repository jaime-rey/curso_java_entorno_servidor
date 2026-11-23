package ejercicios.paquete10;

public abstract class Animal {
    // Atributo común que heredarán todos los animales
    protected String nombre;
    // Atributo común de edad para todos los animales
    protected int edad;

    // Constructor de la clase abstracta (lo llamarán los hijos con 'super')
    protected Animal(String nombre, int edad) {
        // Guarda el nombre común
        this.nombre = nombre;
        // Guarda la edad común
        this.edad = edad;
        // Cierra el constructor
    }

    // Método NORMAL ya hecho: funciona exactamente igual para todos los animales
    // y lo heredan gratis
    public void mostrarDatos() {
        // Imprime nombre y edad
        System.out.println("Animal: " + this.nombre + " | Edad: " + this.edad
                + " años");
        // Cierra mostrarDatos
    }

    // Método ABSTRACTO (termina en ; sin llaves): obliga a cada clase hija a
    // programar su propio sonido
    public abstract void hacerSonido();
}

package ejercicios.ejerciciosAbstractoPoli;

public abstract class Mascota {
    private final String nombre;
    private final int edad;

    protected Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void mostrarDatos() {
        System.out.println("Mascota: " + nombre + " | Edad: " + edad + " años");
    }

    public abstract void hacerSonido();
}

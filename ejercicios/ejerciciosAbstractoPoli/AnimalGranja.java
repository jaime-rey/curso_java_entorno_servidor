package ejercicios.ejerciciosAbstractoPoli;

public abstract class AnimalGranja {
    private final String nombre;
    private final double peso;

    protected AnimalGranja(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void mostrarDatos() {
        System.out.println("Animal: " + nombre + " | Peso: " + peso + " kg");
    }

    public abstract void hacerSonido();
}

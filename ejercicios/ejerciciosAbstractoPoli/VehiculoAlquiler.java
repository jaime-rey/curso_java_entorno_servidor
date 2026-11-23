package ejercicios.ejerciciosAbstractoPoli;

public abstract class VehiculoAlquiler {
    private final String matricula;
    private final double precioBase;

    protected VehiculoAlquiler(String matricula, double precioBase) {
        this.matricula = matricula;
        this.precioBase = precioBase;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public abstract double calcularPrecioFinal();

    public void mostrar() {
        System.out.printf("%s (%s) | Base: %.2f € | Final: %.2f €%n",
                getClass().getSimpleName(), matricula, precioBase, calcularPrecioFinal());
    }
}

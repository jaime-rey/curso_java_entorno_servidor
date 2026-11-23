package ejercicios.ejerciciosAbstractoPoli;

public class MotoAlquiler extends VehiculoAlquiler {
    private static final double CASCO = 8.0;

    public MotoAlquiler(String matricula, double precioBase) {
        super(matricula, precioBase);
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecioBase() + CASCO;
    }
}

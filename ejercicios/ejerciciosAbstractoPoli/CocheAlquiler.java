package ejercicios.ejerciciosAbstractoPoli;

public class CocheAlquiler extends VehiculoAlquiler {
    private static final double SEGURO = 20.0;

    public CocheAlquiler(String matricula, double precioBase) {
        super(matricula, precioBase);
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecioBase() + SEGURO;
    }
}

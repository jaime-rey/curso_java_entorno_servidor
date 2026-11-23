package ejercicios.ejerciciosAbstractoPoli;

public class ProfesorFijo implements Pagable {
    private final String nombre;
    private final double salarioMensual;

    public ProfesorFijo(String nombre, double salarioMensual) {
        this.nombre = nombre;
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularPago() {
        return salarioMensual;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}

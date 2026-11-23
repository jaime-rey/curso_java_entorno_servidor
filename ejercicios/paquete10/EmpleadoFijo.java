package ejercicios.paquete10;

public class EmpleadoFijo implements Pagable {
    private final String nombre;
    private final double salarioMensual;

    public EmpleadoFijo(String nombre, double salarioMensual) {
        this.nombre = nombre;
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularPago() {
        return salarioMensual;
    }

    @Override
    public String getDescripcion() {
        return "Empleado fijo: " + nombre;
    }
}

package ejercicios.ejerciciosAbstractoPoli;

public class ProfesorPorHoras implements Pagable {
    private final String nombre;
    private final int horas;
    private final double precioHora;

    public ProfesorPorHoras(String nombre, int horas, double precioHora) {
        this.nombre = nombre;
        this.horas = horas;
        this.precioHora = precioHora;
    }

    @Override
    public double calcularPago() {
        return horas * precioHora;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}

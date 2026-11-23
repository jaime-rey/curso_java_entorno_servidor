package ejercicios.paquete10;

public class RepartidorPorHoras implements Pagable {
    private final String nombre;
    private final int horas;
    private final double precioHora;

    public RepartidorPorHoras(String nombre, int horas, double precioHora) {
        this.nombre = nombre;
        this.horas = horas;
        this.precioHora = precioHora;
    }

    @Override
    public double calcularPago() {
        return horas * precioHora;
    }

    @Override
    public String getDescripcion() {
        return "Repartidor por horas: " + nombre + " (" + horas + " h x " + precioHora + " €/h)";
    }
}

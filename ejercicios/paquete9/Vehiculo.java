package ejercicios.paquete9;

public abstract class Vehiculo {
    private final String marca;

    protected Vehiculo(String marca) {
        this.marca = marca;
    }

    public void arrancar() {
        System.out.println("El vehículo de la marca " + getMarca() + " está arrancando.");
    }

    protected String getMarca() {
        return marca;
    }

}

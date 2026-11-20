package ejercicios.paquete9;

public abstract class Vehiculo {
    protected final String marca;

    protected Vehiculo(String marca) {
        this.marca = marca;
    }

    public void arrancar() {
        System.out.println("El vehículo de la marca " + marca + " está arrancando.");
    }

}

package ejercicios.paquete9;

public class Coche extends Vehiculo {

    private final int puertas;

    protected Coche(String marca, int puertas) {
        super(marca);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void mostrarDetalles() {
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Puertas: " + puertas);
    }
}

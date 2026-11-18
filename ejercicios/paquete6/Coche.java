package ejercicios.paquete6;

public class Coche {
    private String marca;
    private String modelo;
    private int kilometros;

    public Coche(String marca, String modelo, int kilometros) {
        this.marca = marca;
        this.modelo = modelo;
        this.kilometros = kilometros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    // Solo suma la distancia si es mayor que 0
    public void recorrerKilometros(int distancia) {
        if (distancia > 0) {
            kilometros += distancia;
        } else {
            System.out.println("Distancia no válida: debe ser mayor que 0");
        }
    }

    public void mostrarDatos() {
        System.out.printf("Marca: %s%nModelo: %s%nKilómetros: %d%n", marca, modelo, kilometros);
    }

    @Override
    public String toString() {
        return "Coche [marca=" + marca + ", modelo=" + modelo + ", kilometros=" + kilometros + "]";
    }
}

package ejercicios.paquete7;

public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void mostrarDatos() {
        System.out.println("Base: " + base + ", altura: " + altura);
    }
}

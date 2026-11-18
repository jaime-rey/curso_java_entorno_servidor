package ejercicios.ejerciciosPOO;

public class Rectangulo {
    private double base;
    private double altura;

    public void setBase(double base) {
        if (base > 0) {
            this.base = base;
        } else {
            System.out.println("Aviso: la base debe ser mayor que 0");
        }
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("Aviso: la altura debe ser mayor que 0");
        }
    }

    public double getArea() {
        return base * altura;
    }

    public double getPerimetro() {
        return 2 * (base + altura);
    }

    public double getDiagonal() {
        return Math.sqrt(base * base + altura * altura);
    }

    public boolean esCuadrado() {
        return base == altura;
    }
}

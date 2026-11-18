package ejercicios.paquete7;

public class ReferenciaCompartida {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(4, 3);
        Rectangulo r2 = r1; // r2 no es una copia: apunta al MISMO objeto que r1

        System.out.println("Antes del cambio:");
        r1.mostrarDatos();

        r2.setBase(10); // cambiamos la base a través de r2

        System.out.println("Después de r2.setBase(10), imprimiendo r1:");
        r1.mostrarDatos(); // r1 también ve la base 10

        System.out.println("¿r1 y r2 son el mismo objeto? " + (r1 == r2));
    }
}

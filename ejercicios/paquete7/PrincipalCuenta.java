package ejercicios.paquete7;

public class PrincipalCuenta {
    public static void main(String[] args) {
        // Creamos un objeto usando el constructor completo
        CuentaBancaria c1 = new CuentaBancaria("Lucía", 100.0);
        // Copiamos la referencia: c2 NO crea un objeto nuevo; apunta al mismo
        // objeto que c1 en el Heap
        CuentaBancaria c2 = c1;
        c2.ingresar(50.0);
        System.out.println("Datos desde c1:");
        // Muestra 150.0 € porque c1 y c2 miran al mismo objeto físico en memoria
        c1.mostrarDatos();
        System.out.println("Datos desde c2:");
        // Muestra también 150.0 €
        c2.mostrarDatos();
        // == entre objetos compara las direcciones: true porque apuntan al mismo
        // objeto
        System.out.println("¿c1 y c2 son el mismo objeto? " + (c1 == c2));
        // Constructor corto (sobrecarga): crea un objeto NUEVO con saldo 0.0
        CuentaBancaria c3 = new CuentaBancaria("Mario");
        System.out.println("Datos desde c3:");
        // Muestra 0.0 €: c3 es otra cuenta distinta en el Heap
        c3.mostrarDatos();
        // false: son dos objetos diferentes
        System.out.println("¿c1 y c3 son el mismo objeto? " + (c1 == c3));
    }
}

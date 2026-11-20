package ejercicios.paquete9;

public class CocheConOverride extends Coche {

    // Constructor de la subclase
    public CocheConOverride(String marca, int puertas) {
        // Envía la marca al constructor de la superclase Vehiculo
        super(marca, puertas);
    }

    // Etiqueta que avisa al compilador de que estamos sustituyendo el
    // comportamiento del método arrancar() heredado de Vehiculo
    @Override
    // Mantiene exactamente la misma firma (nombre y paréntesis) que tenía en la
    // clase padre
    public void arrancar() {
        // Nuevo comportamiento específico para coches
        System.out.println("El coche " + this.getMarca() + " (" + this.getPuertas()
                + " puertas) arranca girando la llave o pulsando el botón " +
                "Start.");
        // Cierra el método sobrescrito arrancar
    }
    // Cierra la clase CocheConOverride

    public static void main(String[] args) {
        CocheConOverride miCoche = new CocheConOverride("Toyota", 4);
        miCoche.arrancar();
        System.out.println("Detalles del coche:");
        System.out.println("Marca: " + miCoche.getMarca());
        System.out.println("Puertas: " + miCoche.getPuertas());
        Coche miCoche2 = new Coche("Honda", 2);
        miCoche2.arrancar();
        System.out.println("Detalles del coche:");
        System.out.println("Marca: " + miCoche2.getMarca());
        System.out.println("Puertas: " + miCoche2.getPuertas());
    }
}

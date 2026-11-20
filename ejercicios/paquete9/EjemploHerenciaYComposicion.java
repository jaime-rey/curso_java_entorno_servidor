package ejercicios.paquete9;

// PIEZA PARA COMPOSICIÓN: Representa el motor que irá montado dentro del coche
class MotorPieza {
    // Guarda la potencia del motor
    private final int caballos;
    private final int cilindrada;

    // Constructor para crear el motor con sus caballos
    public MotorPieza(int caballos, int cilindrada) {
        this.cilindrada = cilindrada;
        // Asigna la potencia al atributo interno
        this.caballos = caballos;
        // Cierra el constructor
    }

    // Acción que imprime las características técnicas del motor
    public void mostrarMotor() {
        // Muestra la potencia por pantalla
        System.out.println("Motor de " + this.caballos + " CV y cilindrada " + this.cilindrada + " cc");
        // Cierra mostrarMotor
    }
    // Cierra la clase MotorPieza
}

// SUPERCLASE PARA HERENCIA: Representa el concepto general de vehículo
class VehiculoBase {// Atributo 'protected' para que las subclases hijas puedan leerlo
    // directamente
    private final String marca;

    public String getMarca() {
        return this.marca;
    }

    // Constructor de la clase padre que inicializa la marca
    public VehiculoBase(String marca) {
        // Guarda la marca del vehículo
        this.marca = marca;
        // Cierra el constructor
    }
    // Cierra la superclase VehiculoBase
}

// HERENCIA (IS-A): CocheCompleto ES UN VehiculoBase (usa 'extends')
class CocheCompleto extends VehiculoBase {
    // COMPOSICIÓN (HAS-A): CocheCompleto TIENE UN objeto de tipo MotorPieza como
    // atributo dentro de él
    private final MotorPieza motor;

    // El constructor recibe la marca (para el padre) y el objeto MotorPieza ya
    // creado
    public CocheCompleto(String marca, MotorPieza motor) {
        // Envía la marca hacia arriba al constructor de la superclase
        // VehiculoBase
        super(marca);
        // Guarda el objeto 'motor' dentro de su atributo interno 'this.motor'
        this.motor = motor;
        // Cierra el constructor
    }

    // Método que muestra toda la información del coche apoyándose en sus partes
    public void mostrarDatos() {
        // Imprime la marca heredada de VehiculoBase
        System.out.println("Marca del coche: " + this.getMarca());
        // Delega en su atributo 'motor' llamando a su método mostrarMotor() para
        // que imprima los caballos
        this.motor.mostrarMotor();
        // Cierra mostrarDatos
    }
    // Cierra la clase CocheCompleto
}
// Clase principal con el método main para ejecutar la demostración (archivo
// EjemploHerenciaYComposicion.java)

public class EjemploHerenciaYComposicion {
    // Punto de entrada del programa
    public static void main() {
        // Paso 1: Fabricamos primero el objeto pieza 'miMotor' de 140 caballos
        MotorPieza miMotor = new MotorPieza(140, 1500);
        // Paso 2: Fabricamos el coche pasándole su marca y montándole dentro el
        // objeto 'miMotor'
        CocheCompleto miCoche = new CocheCompleto("Peugeot", miMotor);
        // Paso 3: Pedimos al coche que muestre su ficha completa (marca heredada
        // + datos del motor compuesto)
        miCoche.mostrarDatos();
    }
}

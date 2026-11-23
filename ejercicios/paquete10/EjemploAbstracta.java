package ejercicios.paquete10;

public abstract class EjemploAbstracta {
    public static void main(String[] args) {
        // Instanciamos un Perro concreto
        Perro perro = new Perro("Toby", 3);
        // Instanciamos un Gato concreto
        Gato gato = new Gato("Misu", 2);
        // Usa el método común heredado de Animal
        perro.mostrarDatos();
        // Usa el método específico completado en Perro
        perro.hacerSonido();
        // Usa el método común heredado de Animal
        gato.mostrarDatos();
        // Usa el método específico completado en Gato
        gato.hacerSonido();
    }

}

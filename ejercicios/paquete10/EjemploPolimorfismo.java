package ejercicios.paquete10;

public abstract class EjemploPolimorfismo {
    public static void main() {
        // Creamos un arreglo de Instrumento
        Instrumento[] instrumentos = new Instrumento[2];
        // Llenamos el arreglo con diferentes instrumentos
        instrumentos[0] = new Guitarra("Gibson");
        instrumentos[1] = new Tambor("Yamaha");

        // Recorremos el arreglo y tocamos cada instrumento
        for (Instrumento instrumento : instrumentos) {
            instrumento.tocar();
        }

        ((Tambor) instrumentos[1]).afinar();
    }
}

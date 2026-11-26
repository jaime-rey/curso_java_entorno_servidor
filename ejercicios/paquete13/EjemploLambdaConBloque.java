package ejercicios.paquete13;

// Interfaz funcional: tiene un único método pendiente
interface Mensaje {
    // Recibe un nombre por parámetro y no devuelve nada
    void mostrar(String nombre);
}

// FORMA 1 (Día 10): una clase entera solo para implementar mostrar()
class MensajeBienvenida implements Mensaje {
    @Override
    public void mostrar(String nombre) {
        System.out.println("Hola, " + nombre);
        System.out.println("Bienvenido al programa de servidor.");
    }
}

public class EjemploLambdaConBloque {

    public static void main(String[] args) {
        // FORMA 1: objeto de la clase que implementa la interfaz
        Mensaje saludo1 = new MensajeBienvenida();
        saludo1.mostrar("Lucía");

        // FORMA 2 (hoy): la lambda sustituye a toda la clase MensajeBienvenida.
        // A la izquierda de -> el parámetro 'nombre'; a la derecha, entre llaves,
        // el cuerpo de mostrar(). Aquí solo se GUARDA en saludo2, todavía no se ejecuta.
        Mensaje saludo2 = nombre -> {
            // Estas llaves son el cuerpo de mostrar(), no un método nuevo dentro del main
            System.out.println("Hola, " + nombre);
            System.out.println("Bienvenido al programa de servidor.");
        }; // Termina en ; porque es una asignación, igual que int x = 5;

        // Aquí es cuando se ejecuta la lambda
        saludo2.mostrar("Pedro");

        // FORMA 3: referencia a método con ::
        // darBienvenida ya existe y encaja con mostrar() (recibe un String y no
        // devuelve nada), así que basta con decir "usa ese método"
        Mensaje saludo3 = EjemploLambdaConBloque::darBienvenida;
        saludo3.mostrar("Marta");
        // Equivale a la lambda:  nombre -> darBienvenida(nombre)
    }

    // Método normal con la misma "forma" que mostrar(String nombre)
    private static void darBienvenida(String nombre) {
        System.out.println("Hola, " + nombre);
        System.out.println("Bienvenido al programa de servidor.");
    }
}

package ejercicios.paquete7;

public class PrincipalPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona("Ana", 30); // constructor completo
        Persona p2 = new Persona("Luis");    // constructor abreviado (edad = 0)

        p1.mostrarDatos();
        p2.mostrarDatos();
    }
}

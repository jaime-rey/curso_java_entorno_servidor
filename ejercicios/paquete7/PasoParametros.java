package ejercicios.paquete7;

public class PasoParametros {

    public static void cambiarNumero(int numero) {
        numero = 9999;
    }

    public static void cumplirAnios(Alumno alumno) {
        // Cambiamos el objeto compartido: el cambio SÍ se verá fuera
        alumno.setEdad(alumno.getEdad() + 1);
    }

    public static void main(String[] args) {
        int x = 10;
        cambiarNumero(x);
        // Sigue valiendo 10
        System.out.println("x después del método: " + x);
        Alumno a1 = new Alumno("Ana", 20);
        cumplirAnios(a1);
        // Ahora vale 21
        System.out.println("Edad de a1 después del método: " + a1.getEdad());
    }
}

package ejercicios.ejerciciosAbstractoPoli;

public class Ejercicio1Linterna {
    public static void main(String[] args) {
        Linterna l = new Linterna();
        l.cargar();
        l.cargar();
        l.usar();
        l.usar();
        l.usar();
        System.out.println("Batería final: " + l.getNivelBateria() + "%");
    }
}

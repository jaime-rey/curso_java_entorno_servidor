package ejercicios.ejerciciosAbstractoPoli;

public class Ejercicio2Granja {
    public static void main(String[] args) {
        AnimalGranja[] animales = {
                new Oveja("Lola", 55.0),
                new Vaca("Paca", 620.0)
        };
        for (AnimalGranja a : animales) {
            a.mostrarDatos();
            a.hacerSonido();
        }
    }
}

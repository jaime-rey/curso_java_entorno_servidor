package ejercicios.ejerciciosAbstractoPoli;

public class Ejercicio8Refugio {
    public static void main(String[] args) {
        Mascota[] refugio = {
                new PerroRefugio("Rocky", 4),
                new GatoRefugio("Luna", 2),
                new PerroRefugio("Toby", 7)
        };
        for (Mascota m : refugio) {
            m.mostrarDatos();
            m.hacerSonido();
        }
    }
}

package ejercicios.ejerciciosAbstractoPoli;

public class Ejercicio6Luces {
    public static void main(String[] args) {
        Encendible[] dispositivos = {
                new Lampara(),
                new Farola(),
                new Televisor()
        };
        for (Encendible e : dispositivos) {
            e.encender();
        }
    }
}

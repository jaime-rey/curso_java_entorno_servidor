package ejercicios.ejerciciosAbstractoPoli;

public class PerroRefugio extends Mascota {
    public PerroRefugio(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: ¡Guau!");
    }
}

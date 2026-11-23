package ejercicios.ejerciciosAbstractoPoli;

public class GatoRefugio extends Mascota {
    public GatoRefugio(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: ¡Miau!");
    }
}

package ejercicios.ejerciciosAbstractoPoli;

public class Vaca extends AnimalGranja {
    public Vaca(String nombre, double peso) {
        super(nombre, peso);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: ¡Muuu!");
    }
}

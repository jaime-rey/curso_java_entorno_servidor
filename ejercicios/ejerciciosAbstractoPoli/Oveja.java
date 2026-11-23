package ejercicios.ejerciciosAbstractoPoli;

public class Oveja extends AnimalGranja {
    public Oveja(String nombre, double peso) {
        super(nombre, peso);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: ¡Beee!");
    }
}

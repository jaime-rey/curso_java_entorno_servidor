package ejercicios.ejerciciosAbstractoPoli;

public class Ejercicio3Tienda {
    public static void main(String[] args) {
        Avisador a1 = new AltavozTienda();
        Avisador a2 = new PantallaTienda();
        a1.avisar();
        a2.avisar();
    }
}

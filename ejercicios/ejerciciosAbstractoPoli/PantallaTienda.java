package ejercicios.ejerciciosAbstractoPoli;

public class PantallaTienda implements Avisador {
    @Override
    public void avisar() {
        System.out.println("[Pantalla] ¡Nuevas rebajas! Ver escaparate.");
    }
}

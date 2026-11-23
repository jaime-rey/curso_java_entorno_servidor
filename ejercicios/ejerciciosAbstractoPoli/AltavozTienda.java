package ejercicios.ejerciciosAbstractoPoli;

public class AltavozTienda implements Avisador {
    @Override
    public void avisar() {
        System.out.println("[Altavoz] Atención clientes: oferta en caja 3.");
    }
}

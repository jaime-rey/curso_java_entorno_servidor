package ejercicios.ejerciciosAbstractoPoli;

public class PedidoUrgente implements Entregable {
    private final String destinatario;

    public PedidoUrgente(String destinatario) {
        this.destinatario = destinatario;
    }

    @Override
    public void entregar() {
        System.out.println("Entregando pedido URGENTE a " + destinatario + ".");
    }

    @Override
    public boolean esUrgente() {
        return true;
    }
}

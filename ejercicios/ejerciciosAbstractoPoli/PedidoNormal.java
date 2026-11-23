package ejercicios.ejerciciosAbstractoPoli;

public class PedidoNormal implements Entregable {
    private final String destinatario;

    public PedidoNormal(String destinatario) {
        this.destinatario = destinatario;
    }

    @Override
    public void entregar() {
        System.out.println("Entregando pedido normal a " + destinatario + ".");
    }

    @Override
    public boolean esUrgente() {
        return false;
    }
}

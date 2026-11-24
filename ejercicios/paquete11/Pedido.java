package ejercicios.paquete11;

public final class Pedido {
    // Identificador del pedido
    private final int id;
    // Estado actual del pedido: solo puede ser uno de los valores del enum
    private EstadoPedido estadoPedido;

    // Todo pedido nuevo empieza en estado PENDIENTE
    public Pedido(int id) {
        this.id = id;
        this.estadoPedido = EstadoPedido.PENDIENTE;
    }

    public int getId() {
        return id;
    }

    public EstadoPedido getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(EstadoPedido estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    @Override
    public String toString() {
        return "Pedido [id=" + id + ", estadoPedido=" + estadoPedido + "]";
    }
}

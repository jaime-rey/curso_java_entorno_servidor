package ejercicios.ejerciciosAbstractoPoli;

public class Ejercicio7Reparto {
    public static void main(String[] args) {
        Entregable[] pedidos = {
                new PedidoNormal("Ana"),
                new PedidoUrgente("Luis"),
                new PedidoNormal("Marta"),
                new PedidoUrgente("Sergio")
        };
        for (Entregable p : pedidos) {
            p.entregar();
            if (p.esUrgente()) {
                System.out.println("  >>> AVISO: pedido con prioridad máxima.");
            }
        }
    }
}

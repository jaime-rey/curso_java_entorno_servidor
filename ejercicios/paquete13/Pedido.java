package ejercicios.paquete13;

// CLASE EXTERIOR: Representa el pedido general de un cliente
public class Pedido {

    // Atributo privado del pedido exterior que guarda el nombre del comprador
    private String cliente;

    // Constructor de la clase exterior Pedido
    public Pedido(String cliente) {
        this.cliente = cliente;
    }

    // CLASE INTERNA: está escrita DENTRO de las llaves de Pedido porque una línea
    // solo tiene sentido dentro de un pedido
    class LineaPedido {

        private String cliente;
        // Qué artículo se ha comprado
        private String producto;
        // Cuántas unidades se han pedido
        private int cantidad;

        // Constructor de la clase interna LineaPedido
        public LineaPedido(String cliente, String producto, int cantidad) {
            this.cliente = cliente;
            this.producto = producto;
            this.cantidad = cantidad;
        }

        // Imprime el detalle completo de la línea
        public void mostrarLinea() {
            // ¡GRAN VENTAJA! La clase interna puede leer directamente el atributo
            // privado 'cliente' de su objeto exterior Pedido
            System.out.println("Cliente del pedido: " + Pedido.this.cliente);
            System.out.println("Cliente de la línea: " + this.cliente);
            System.out.println("Producto: " + this.producto);
            System.out.println("Cantidad: " + this.cantidad + " unidades");
        }
    }

    // Punto de entrada para probar la clase exterior y su clase interna
    public static void main(String[] args) {
        // PASO 1: primero creamos obligatoriamente el objeto exterior 'pedido'
        Pedido pedido = new Pedido("Ana");

        // PASO 2: a partir de ese objeto 'pedido' ya existente, creamos un objeto
        // de su clase interna usando 'pedido.new'
        LineaPedido linea = pedido.new LineaPedido("Pepe", "Cuaderno", 3);

        // PASO 3: mostramos los datos de la línea ("Ana", "Cuaderno" y 3)
        linea.mostrarLinea();
    }
}
